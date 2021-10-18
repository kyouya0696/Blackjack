package cc.shinbi.exercise.sort;

import java.util.Comparator;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<Scores> list = Scores.createList(15);
		list.sort(
				new Comparator<Scores>() {
			@Override
			public int compare(Scores o1, Scores o2) {
				if (o1.getMathematics() < o2.getMathematics()) { // 1番目の方が高い。
					return -1;
				}
				if (o1.getMathematics() > o2.getMathematics()) { // 2番目の方が低い。
					return 1;
				}

				return 0;
			}
		}
	);

		list.sort(
			(score1, score2) -> {
				if (score1.getEnglish() < score2.getEnglish()) { // 1番目の方が低い。
					return 1;
				}
				if (score1.getEnglish() > score2.getEnglish()) { // 2番目の方が高い。
					return -1;
				}

				return 0;
			}

	);
		for (Scores scores : list) {
			System.out.println(scores);
		}
	}

}
