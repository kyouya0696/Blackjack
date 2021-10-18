package cc.shinbi.exercise.quiz;

public class Quiz {
	String sentence;

	String answer;

	static int bestScore = 0;

	public Quiz(String sentence, String answer) {
		this.sentence = sentence;

		this.answer = answer;

}
	public boolean check(String input) {
		boolean isCorrect = false;
		if (this.answer.equals(input)) {
			isCorrect = true;
		}
		return isCorrect;
}
	public static Quiz[] getObjects() {
		Quiz[] array = { new Quiz(
				"ももクロの玉井詩織のニックネームといえば",
				"しおりん"
				),
				new Quiz(
						"ドラえもんの誕生日と言えば9月3日。では、のび太の誕生日は？",
						"8月7日"
						),
				new Quiz(
						"HTMLで記述したホームページの文書構造を装飾する言語と言えば？",
						"CSS"
						),
				new Quiz(
						"栃木県の県庁所在地と言えば？",
						"宇都宮市"
						),
				new Quiz(
						"ルーレットの数字を全部掛け算すると値はいくつになる？",
						"25"
						),
				new Quiz(
						"ヒプノシスマイクのキャラクターの入間銃兎の誕生日は？",
						"5月30日"
						),
				new Quiz(
						"ヒプノシスマイクのキャラクターで好きなキャラは？",
						"入間銃兎"
						),
				new Quiz(
						"ヒプノシスマイクで好きなデイビジョンは？",
						"ヨコハマ・デイビジョン"
				),
				new Quiz(
						"ヒプノシスマイクで次に好きなデイビジョンは？",
						"シンジュク・デイビジョン"
				),
				new Quiz(
						"ヒプノシスマイクで好きな次に好きなキャラは？",
						"碧棺 左馬刻"
				),
			};
		return array;
	}
}

