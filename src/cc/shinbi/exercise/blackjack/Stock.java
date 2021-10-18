package cc.shinbi.exercise.blackjack;

import java. util. ArrayList;
import java. util. Arrays;
import java. util. Collections;
import java. util. List;

/**
 * 山札　クラス
 */
public class Stock {
	private ArrayList<Card> cards;

	public Stock() {
		initialize();
	}


	/**
	 * 山札（手札のカード）を取得する
	 */
	public void initialize() {
		Card[] array = Card.getAllCards();
		List<Card> list = Arrays.asList(array);
		Collections.shuffle(list);
		this.cards = new ArrayList<Card>(list);
}
	/**
	 *カードの情報の全てを初期化する
	 */
	public int getNumberOfCards() {
		return this.cards.size();
}
	/**
	 * カードの数字情報を取得する。
	 */
	public Card pickCard() {
		Card card = this.cards.get(0);
		this.cards.remove(0);
		return card;
	}
}

/**
 * 全てのカードのストックを取得する。
 * カードを引く
 */
