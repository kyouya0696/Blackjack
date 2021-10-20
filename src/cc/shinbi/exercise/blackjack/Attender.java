package cc.shinbi.exercise.blackjack;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 参加者クラス
 */
public abstract class Attender {
	protected ArrayList<Card> cards;
	protected String name;

	public Attender(String name) {
		this.name = name;
		initialize();
	}

	public void initialize() {
		this.cards = new ArrayList<Card>();
	}

	/**
	 * @param initialize 初期化する。
	 */
	public void start(Stock stock) {
		this.cards.clear();
		for (int i = 0; i<2; i++) {
			Card card = stock.pickCard();
			this.cards.add(card);
		}
	}
/**
 * ゲームの開始する。
 * Stock　山札オブジェクト
 */
	public String getName() {
		return name;
	}
/**
 * 参加者の名前を取得する。
 * @return 参加者の名前
 */
	public void hit(Stock stock) {
		Card card = stock.pickCard();
		this.cards.add(card);
	}
/**
 * 山札から一枚引く
 * Stock　山札オブジェクト
 */
	public int calculateStrength() {
		// 基本的には手札の値の合計値。。
		int strength = 0;
		boolean foundA = false;
		for (int i = 0; i < this.cards.size(); i++) { // 手札はthis.cardから取得できる。
		Card card = this.cards.get(i);
		int point = Math.min(card.getNumber(), 10);
			if (point == 1) {
				foundA = true;
			}
			strength = strength + point;
		}
			if (foundA && strength <= 11) {
				strength = strength + 10;
			}
			else if (strength > 21) {// 手札の数字がA(1)の場合は、値は1もしくは11とする。

					strength = 0;
				}
		return strength;
	}
/**
 * 手札の強さの計算する。
 * @return 手札の強さ（０～２１）
 */
	public int calculateStrengthOrg() {
		int strength = 0;

		int numA = 0;
		int sum = 0;
		 // カードの枚数分回す。
		for(int ii = 0; ii < this.cards.size(); ++ii) {
			int pt = this.cards.get(ii).getNumber();
			if(pt > 10) {
				// 絵札は10。
				pt = 10;
			}
			// 合計。 まずはAは１。
			sum += pt;
			// Aの枚数を数える。
			if(pt == 1) {
				++numA;
			}
		}
		strength = sum;
		// Aの枚数回、 10を足していく。
		for(int ii = 0; ii < numA; ++ii) {
			sum += 10;
			// 10足したものが21以下なら、足したものの方が強い
			if(sum <= 21) {
				strength = sum;
			}
			else {
				// burstしたらこれ以上足してもburst。
				break;
			}
		}
			// burst。
			if(strength > 21) {
				strength = 0;
			}
			return strength;
		}

	public String toString() {
		String string = name + ":";
		for (int i = 0; i < this.cards.size(); i++) {
			Card card = this.cards.get(i);
			string = string + card.toString();
		}
		return string;
	}
/**
 * 参加者の状態の文字列を取得する。
 */
	public void display() {
		System.out.println(this.toString());
	}
	/**
	 * 参加者の状態を表示する。
	 */
	public abstract void play(Stock stock) throws IOException;
}
/**
 * プレイする（抽象メソッド）
 * stock 山札オブジェクト
 * 例外：
 */