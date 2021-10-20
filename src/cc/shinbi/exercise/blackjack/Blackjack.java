package cc.shinbi.exercise.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blackjack {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("開始します。 Enterを押してください。");
		start(reader);
		reader.readLine();
		boolean loop = true;
		while (loop) {
			System.out.println("もう一度やりますか？[Y/N]");
			String input = reader.readLine();
			if (!input.equals("Y")) {
				loop = false;
			}
		}
		reader.close();
	}



	/**
	 * ブラックジャックゲーム
	 * @param reader
	 * @throws IOException
	 */
	public static void start(BufferedReader reader) throws IOException {
		Player player = new Player(reader);
		Dealer dealer = new Dealer();
		Stock stock = new Stock();

		player.start(stock);
		dealer.start(stock);

		dealer.display();

		player.play(stock);

		dealer.play(stock);
		showResult(player, dealer);
	}
	/**
	 * メインメソッド
	 * パラメータ:
	 * 例外：
	 * ゲームを開始と終了する。
	 */

	public static void showResult(Attender player, Attender dealer) {
		dealer.display();
		player.display();

		int dealerStrength = dealer.calculateStrength();
		int playerStrength = player.calculateStrength();

		if (playerStrength > dealerStrength) {
			System.out.println("あなたの勝ちです。");
		}
		else if (dealerStrength > playerStrength) {
			System.out.println("あなたの負けです。");
		}
		else {
			System.out.println("引き分けです。");

			}
		}
	}


/**
 * ゲームの結果を表示する。
 * パラメータ：
 * player プレイヤー・オブジェクト
 * dealer ディーラー・オブジェクト
 */
