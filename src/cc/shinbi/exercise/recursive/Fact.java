package cc.shinbi.exercise.recursive;

public class Fact {

	public static void main(String[] args) {
	int answer = fact(10);
	System.out.println(answer);
	}

	private static int fact(int n) {
	int fact = 0;
	int answer = 0;
	if(fact <= n) {
		fact = answer * (n*10);
	}
		return fact;
	}
}
