package cc.shinbi.exercise.pi;

public class Step7 {

	public static void main(String[] args) {
		int counter = 0;
		for(int a = 0; a<1000000; a++) {
			double x = Math.random();
			double y = Math.random();
			double z = x*x+y*y;
			if(z<= 1.0) {
				 counter++;         //カウンターを１つ増やす。
			}
		}
		System.out.println((double)counter / 1000000.0);
	}
}
