package cc.shinbi.exercise.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberParser {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		boolean loop = true;
		while(loop) {
			System.out.println("数字を入力してください。(Entter のみで終了)");
			String input = reader.readLine();
			if(input.equals(input)) {
				loop = false;
			}
			else {
				parse(input);
			}
			System.out.println("終了しました。");
			reader.close();
		}
	}

	public static void parse(String input) {
		try {
			int intNumber = Integer.parseInt(input);
			System.out.println(String.format("int型 %d を取得しました。", intNumber));
		} catch (Exception e) {
			System.out.println("int型を取得に失敗しました。。");
		}
		try {
			double doubleNumber = Double.parseDouble(input);
			System.out.println(String.format("double型 %fを取得しました。", doubleNumber));
		} catch (Exception e) {
			System.out.println("double型を取得に失敗しました。。");
		}
	}
}
