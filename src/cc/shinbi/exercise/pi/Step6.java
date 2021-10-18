package cc.shinbi.exercise.pi;

public class Step6 {

	public static void main(String[] args) {
		int counter = 0;   //カウンター定義。
		for(int i = 0; i<1000000; i++)
		{
			double x = Math.random();
			double y = Math.random();
			double z = x*x+y*y;
			if(z<= 1.0) {
				 counter++;         //カウンターを１つ増やす。
	}
}
		System. out. println("一以下は" + counter + "回");      //表示。
	}
}
