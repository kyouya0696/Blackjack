package cc.shinbi.exercise.pi;

public class Step5 {
	public static void main(String[] args) {
		int counter = 0;   //カウンター定義。
	for(int i =0; i < 10; i++) {
		double x = Math.random();
		double y = Math.random();
		double xxyy = x*x+y*y;
		System. out. println(
				xxyy + "(" + "x = " + x + "y =" + y + ")"
				);
		counter++;
	}
	System. out. println(counter + "回");
		}
	}


