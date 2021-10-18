package cc.shinbi.exercise.typing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Typing {
	private static final int NUMER_OF_SENTENCES = 10;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("開始します。 Enterを押してください。");
		start(reader);
		reader.readLine();
		boolean loop = true;
		while (loop) {
			System.out.println("もう一度やりますか？[Y/N]");
			String input = reader.readLine();
			if (!input.equals("Y")) {
				loop = false;
			}
		}
		reader.close();
	}

	private static List<String> readSentences() {
		List<String> list = new ArrayList<String>();
		InputStream stream = Typing.class.getResourceAsStream("sentences.txt");

		String line = null;
		BufferedReader resourceReader = new BufferedReader(new InputStreamReader(stream));
		try {
			while ((line = resourceReader.readLine()) != null) {
				list.add(line);
			}
		} catch (IOException e) {
			System.out.println("文書を読込に失敗しました。");
		}
		return list;
	}

	public static void showResult(int counter, int correct, double seconds, int totalLengtht) {
		System.out.println(String.format(
				"%d 間中 %d 問が正しい入力でした。",
				counter,
				correct
			)
		);

		System.out.println(String.format(
				"%.01f 秒かかりました。",
				seconds
			)
		);

		double speed = (double)totalLengtht / seconds;

		System.out.println(String.format(
				"一分あたりの文字数は%.01f 文字です。",
				speed
				)
			);
	}

	private static void start(BufferedReader reader) {
		List<String> sentences = readSentences();
		Collections.shuffle(sentences);

		int counter = 0;
		int correct = 0;
		int totalLengtht = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < sentences.size() && i < NUMER_OF_SENTENCES; i++) {
			String sentence = sentences.get(i);
			System.out.println(sentences);
			try {

				String input = reader.readLine();
				if (sentence.equals(input)) {
					System.out.println("○");
					correct++;
				} else {
					System.out.println("×");
				}
			} catch (IOException e) {
				System.out.println("入力文字列の取得に失敗しました。");
			}
			counter++;
		}

		long end = System.currentTimeMillis();
		double seconds = (double) (end - start) / 1000.0;
		showResult(counter, correct, seconds, totalLengtht);
	}
}

