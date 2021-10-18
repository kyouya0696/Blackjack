package cc.shinbi.exercise.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in)
			);
		boolean loop = true;
		while (loop) {
			start(reader);
			System. out. println("もう一度やりますか？ [Y/N]");
			String input = reader.readLine();
			if (!input.equals("Y")) {
				loop = false;
			}
		}
		reader.close();
}
	public static void start(BufferedReader reader) throws IOException {
		Quiz[] questions = Quiz.getObjects();
		int correct = 0;

		for (int i = 0; i < questions.length; i++) {
			Quiz question = questions[i];

			System. out. println(question.sentence);
			String input = reader.readLine();

			if (question.check(input)) {
				System. out. println("正解です。");
				correct++;
			}
			else {
				System. out. println("間違いです。");
			}
		}
		System. out. println(correct + "問正解です。");
		if (correct > Quiz.bestScore) {
			Quiz.bestScore = correct;
			System. out. println("ベストスコアが更新されました。");
		}
	}
}

