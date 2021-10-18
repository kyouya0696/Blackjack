package cc.shinbi.exercise.hit_blow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int SIZE = 4;
	public static final int MAX_NUMBER = 6;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in)
			);

		start(reader);

		reader.close();
	}

	public static void start(BufferedReader reader) throws IOException {
		Numbers correct = new Numbers(SIZE);
		correct.random(MAX_NUMBER);

		boolean loop = true;
		while (loop) {
			System.out.println(
					String.format(
					"数字を入力してください。(1~%d) [%d 桁]",
					MAX_NUMBER,
					SIZE
					)

			);

			String input = reader.readLine();
			Numbers numbers = new Numbers(SIZE);
			numbers.input(input);

			Result result = correct.check(numbers);
			if (result.getHit() == SIZE) {
				System.out.println("正解です。");
				loop = false;
			}
		}
	}
}