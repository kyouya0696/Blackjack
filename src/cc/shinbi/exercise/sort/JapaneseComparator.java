package cc.shinbi.exercise.sort;

import java.util.Comparator;

public class JapaneseComparator implements Comparator<Scores> {

	@Override
	public int compare(Scores o1, Scores o2) {
		if(o1.getJapanese() < o2.getJapanese()) { // 2番目の方が低い。
			return 1;
		}
		if(o1.getJapanese() > o2.getJapanese()) { // 1番目の方が高い。
			return -1;
		}
		return 0;
	}
}
