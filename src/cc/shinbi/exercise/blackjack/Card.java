package cc.shinbi.exercise.blackjack;

/**
 *
 * @author カード管理クラス
 *
 */
public class Card {
	/** マーク定義 */
	public enum Suit {

		SPADE,
		/** スペード */
		HEART,
		/** ハート */
		DIAMOND,
		/** ダイヤ */
		CLUB
		/** クラブ */
}
	private Suit suit;
	private int number;
	/**
	 * コンストラクター
	 * @param suit マーク
	 * @param number 数字
	 */

	public Card(Suit suit, int number) {
		this.suit = suit;
		this.number = number;
	}

	/**
	 * カードのマークを取得する。
	 * @return カードのマーク
	 */

	public Suit getSuit() {
		return suit;
	}

	/**
	 * カードのマークを取得する。
	 * @return カードの数字
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * マークの情報の文字列を取得する。
	 * (例： Suit.SPAND -> スペード)
	 * @param suit マークの情報
	 * @return 文字列
	 */
	public static String getSuitString(Suit suit) {
		String string = null;

		if (suit == Suit.SPADE) {
			string = "スペード";
		}
		else if (suit == Suit.HEART) {
			string = "ハート";
		}
		else if (suit == Suit.DIAMOND) {
			string = "ダイヤ";
		}
		else if (suit == Suit.CLUB) {
			string = "クラブ";
		}
		return string;
	}

	/**
	 * 数字情報の文字列を取得する。
	 * (例： １ -> A, 2 -> 2, 3 -> 3,4 -> 4, 5 -> 5,・・・,12 -> Q, 13 -> K)
	 * @param number 数字
	 * @return 数字の文字列
	 */
	public static String getNumberString(int number) {
		String string = null;

		if (number == 1) {
			string = "A";
		}
		else if (number == 11) {
			string = "J";
		}
		else if (number == 12) {
			string = "Q";
		}
		else if (number == 13) {
			string = "K";
		}
		else if (number >= 2 && number <= 10) {
			string = Integer.toString(number);
	}
		return string;
	}
	/**
	 * カードの文字列を取得する。
	 * (例： [スペードA],[スペード2],・・・)
	 */
	public String toString() {
		String suit = getSuitString(this.suit);
		String number = getNumberString(this.number);

		String string = "[]";
		if (suit != null && number != null) {
			string = "[" + suit + number + "]";
		}
		return string;
}
	/**
	 * 52枚の全てのカードを取得する。
	 * @return 52枚のカードの配列
	 */
	public static Card[] getAllCards() {
		Card[] cards = new Card[52];
		int index = 0;

		Suit[] suits = { Suit.SPADE, Suit.HEART, Suit.CLUB, Suit.DIAMOND};
		for (int i = 0; i < suits.length; i++) {
			Suit suit = suits[i];
			for (int number = 1; number <= 13; number++) {
				Card card = new Card(suit, number);
				cards[index] = card;
				index++;
			}
		}
			return cards;
	}
}