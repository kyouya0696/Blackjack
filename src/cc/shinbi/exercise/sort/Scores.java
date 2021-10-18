package cc.shinbi.exercise.sort;

import java.util.ArrayList;

import java.util.List;

public class Scores implements Comparable<Scores> {
	private int number;
	private int japanese;
	private int mathematics;
	private int english;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getJapanese() {
		return japanese;
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}

	public int getMathematics() {
		return mathematics;
	}

	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int calculateTotal() {
		int total = this.japanese + this.mathematics + this.english;
		return total;
	}

	public String toString() {
		String string = String.format(
				"生徒%02d (合計 %3d) : 国語=%3d 数学=%3d 英語=%3d",
				this.number,
				this.calculateTotal(),
				this.japanese,
				this.mathematics,
				this.english
				);

		return string;
	}

	private static int getRandomScores() {
		double random = Math.random();
		int score = (int) Math.floor(random * 101.0);
		return score;
	}

	public static List<Scores> createList(int size) {
		List<Scores> list = new ArrayList<Scores>();
		for (int number = 1; number <= size; number++) {
			Scores scores = new Scores();
			scores.setNumber(number);
			scores.setJapanese(getRandomScores());
			scores.setMathematics(getRandomScores());
			scores.setEnglish(getRandomScores());

			list.add(scores);
		}
		return list;
	}

	@Override
	public int compareTo(Scores o) {
		int total1 = this.calculateTotal();
		int total2 = o.calculateTotal();
		if (total1 < total2) { // 自分の方が点数が低い。
			return 1;
		}
		if (total1 < total2) { // 自分の方が点数が高い。
			return -1;
		}
		return 0;
	}
}