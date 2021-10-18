package cc.shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rola {
	 public static void main (String[] args) throws IOException {
		  BufferedReader reader = new BufferedReader(
				  new InputStreamReader(System.in)
				  );
		System. out.println("ローラもおともします。");

		boolean agreed = false;
		do {
			System. out.println("このローラもつれてってくださいますわね。");
			System. out.println("[Y] はい [N] いいえ");
			String input = reader.readLine();
			if(input.equals("Y")) {
				agreed = true;
	  }

			else {
				System.out.println("そんな ひどい ・ ・ ・");
			}

		} while (!agreed);
		System. out.println("うれしゅうございます。 ぽっ");
		reader.close();
	}


	}


