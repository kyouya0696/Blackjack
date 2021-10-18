package cc.shinbi.exercise.recursive;

public class Reverse {

	public static void main(String[] args) {
		String string = "abcdefghij";
		String reversed = reverse(string);
		System.out.println(reversed);
	}

	private static String reverse(String string) {
		String reversed = "";
		if(string.length() <= 1) {
			reversed = string;
		}
		else if(string.length() > 1) {
			String head = string.substring(0,1);		// 1文字目
			String body = string.substring(1);			// 2文字目以降
			reversed = reverse(body) + head;
		}
		return reversed;
	}
}
