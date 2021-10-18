package cc.shinbi.exercise.recursive;

public class TriangleNumber {
	public static void main(String[] args) {
	int triangle = calculate(100);
		System.out.println(triangle);
	}

	private static int calculate(int n) {
		int triangle = 0;
		if(n == 1) {
			triangle = 1;
		}
		else if(n > 1) {
			triangle = calculate(n-1) + n;
		}
		return triangle;
	}
}
