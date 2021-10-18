package cc.shinbi.exercise.blackjack;

import java.io.IOException;
/**
 *
 * ディーラー クラス
 *
 */
public class Dealer extends Attender {
	private boolean opened;

	public Dealer() {
		super("Computer");
	}

	/**
	 * コンストラクター
	 */
	@Override
	public void start(Stock stock) {
		super.start(stock);
		this.opened = false;
	}
	/**
	 * クラスからコピーされた説明：Attender
	 * ゲームを開始する。
	 * オーバライド：
	 * start クラス内 Attender
	 * stock 山札オブジェクト
	 */
	@Override
	public void play(Stock stock) throws IOException {
		int strength = this.calculateStrength();
		while (strength < 17 && strength > 0) {
			this.hit(stock);
			strength = this.calculateStrength();
		}
		this.opened = true;
	}
/**
 * クラスからコピーされた説明：Attender
 * プレイする（抽象メソッド）
 * play クラス内 Attender
 * stock 山札オブジェクト
 */
	@Override
	public String toString() {
		String string = "";
		if (this.opened) {
			string = super.toString();
		} else {
			string = this.name + ":";
			for (int i = 0; i < this.cards.size(); i++) {
				Card card = this.cards.get(i);
				if (i == 0) {
					string = string + card.toString();
				} else {
					string = string + "[#####]";
				}
			}
		}
		return string;
	}
}
/**
 * クラスからコピーされた説明：Attender
 * 参加者の状態を文字列を取得する。
 *  オーバライド：
 *  toString クラス内　Attender
 */