package cc.shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KazuateGame {
	public static void main(String[] args) throws IOException {
		 BufferedReader reader = new BufferedReader(
				 new InputStreamReader(System.in)
			);
		double random = Math.random();
		int number = (int)Math.floor(random * 10.0) + 1;
		int answer = 0;
		int counter = 0;   //回数の変数（情報）定義。
		while(answer != number) {
			System. out.println("数字を入力してください。(1~10)");
			String input = reader.readLine();
			counter++;    //カウンターを１つふやす。
			answer = Integer.parseInt(input);
			if(answer < number) {
				System. out.println("数字が小さいです。");
			}
			else if(answer > number) {
				System. out.println("数字が大きいです。");
			}
			else {
				System. out.println("正解です。");
			}
		}
		System. out. println(counter + "回で正解です。");    //表示。
		reader.close();
		}
	}

