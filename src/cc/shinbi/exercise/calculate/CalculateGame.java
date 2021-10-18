package cc.shinbi.exercise.calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateGame {
	public static int getRandomNumber() {
		int num = (int) (Math.random() * 9.0 + 1.0);
		return (int) Math.floor(num);
	}

	public static boolean checkNumber(String line) {
		boolean result = true;
		if (line.length() > 0) {
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				boolean isDigit = Character.isDigit(c);
				if (!isDigit) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	public static void showResult(double second, int correct) {
		int wrong = 10 - correct;
		double noramalizedTime = second + 3.0 * (double) wrong;
		String age = "";

		if (noramalizedTime < 10.0) {
			age = "10代";
		}
		else if (noramalizedTime < 13.0) {
			age = "20代";
		}
		else if (noramalizedTime < 16.0) {
			age = "30代";
		}
		else if (noramalizedTime < 19.0) {
			age = "40代";
		}
		else if (noramalizedTime < 22.0) {
			age = "50代";
		}
		else {
			age = "60代";
		}
		System.out.println("正解数は" + correct);
		System.out.println("タイム" + second);
		System.out.println("あなたの脳年齢は" + age + "です。");
	}

	public static int createQuestion() {
		int a = getRandomNumber();
		int b = getRandomNumber();
		System.out.println(a + "+" + b + "= ?");
		int answer = a + b;
		return answer;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = true;

		while (loop) {
			System.out.println("開始します。 Enterキーを押してください。");
			reader.readLine();
			start(reader);
			System.out.println("もう一度やりますか？[Y/N]");
			String input = reader.readLine();
			if (!input.equals("Y")) {
				loop = false;
			}
		}
		reader.close();
	}

public static int input(BufferedReader reader) throws IOException {
		boolean loop = true;
		int i = 0;
		while (loop) { // 数字を入れてください。
			System.out.println("数字を入れてください。");
			String input = reader.readLine();
			if (checkNumber(input)) { // 数字
				i= Integer.parseInt(input);
				loop = false;
			}
			else {// 数字ではない
				System.out.println("数字を入れてください。");
			}
		}
			return i;
}
	public static void start (BufferedReader reader) throws IOException {

				int time = 0; // ミリ秒
				int correct = 0;

				for(int i = 0; i < 10; i++) {
					int answer = createQuestion();

					long start = System.currentTimeMillis();
					int z = input(reader);
					if (z == answer) {
						System.out.println("正解です。 (^o^)");
						correct++;
					}
					else { // 不正解です。
						System.out.println("不正解です。 (T_T)");
					}
				long end = System.currentTimeMillis();
				time = time + (int) (end - start);
			}

			double second = (double) time / 1000.0;

			showResult(second, correct);
			}
		}


