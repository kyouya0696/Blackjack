package cc.shinbi.exercise.recursive;

import java.io.File;

public class Files {

	public static void main(String[] args) {
	String path = System.getProperty("user.home");		// ホームフォルダー
	System.out.println("検索フォルダー: " + path);

	File folder = new File(path);
	displayFiles(folder);
	}

	private static void displayFiles(File file) {
		if(file.isDirectory()) {		// フォルダーのとき
			System.out.println("===" + file.getAbsolutePath() + "===");

			File[] children = file.listFiles();
			if(children != null) {		// nullになることがある。
				for(File child : children) {
					displayFiles(child);
				}
			}
		}
		else {			// ファイルのとき
			System.out.println(file.getName());
		}
	}
}
