package cc.shinbi.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tensecond {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enterを押したらスタートします。");
		reader.readLine();
		long startTime = System.currentTimeMillis();
		System.out.println("10秒たったら Enterを押してください。");
		reader.readLine();
		long endTime = System.currentTimeMillis();
		double seconds = (double) (endTime - startTime) / 1000.0;

		System.out.println(seconds + "秒でした。");
	}

}

