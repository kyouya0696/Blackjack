package cc.shinbi.exercise.blackjack;


import java.io.BufferedReader;
import java.io.IOException;

/**
*
* プレイヤークラス
*
*/
public class Player extends Attender {
	public static final int ACTION_HIT = 1;
	public static final int ACTION_STAND = 2;

	private BufferedReader reader;

	public Player(BufferedReader reader) {
		super("You");
		this.reader = reader;
	}

	/**
	 * 参加者(プレイヤーとディラー)
	 */
	@Override
	public int calculateStrength() {
		int strength = super.calculateStrength();
		if (strength == 0) {
			strength = -1;
		}
		return strength;
	}

	/**
	 * カードの全ての手札。
	 */
	@Override
	public void play(Stock stock) throws IOException {
		boolean standing = false;
		while (!standing) {
			this.display();
			int action = selectAction();
			if (action == ACTION_HIT) {
				this.hit(stock);
				int strength = this.calculateStrength();
				if (strength <= 0) {
					standing = true;
				}
				else {
					standing = true;
				}
			}
		}
	}
	/**
	 *　ディーラーの手札の情報を取得する。
	 * プレイヤーの手札の情報を取得する。
	 */
	private int selectAction() throws IOException {
		String selectMassage = "[" + ACTION_HIT + "] Hit (カードを引く)"
	+ " [" + ACTION_STAND + "] Stand (勝負する)";
		System.out.println(selectMassage);
		int action = 0;
		while (action != ACTION_HIT && action != ACTION_STAND) {
			String input = this.reader.readLine();
			action = Integer.parseInt(input);
		}
		return action;
	}

}

/**
 * カードの結果を表示します。
 * 引いたカードの結果を取得する。
 */
