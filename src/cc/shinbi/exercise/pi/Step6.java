package cc.shinbi.exercise.pi;

public class Step6 {

	public static void main(String[] args) {
		int counter = 0;   //�J�E���^�[��`�B
		for(int i = 0; i<1000000; i++)
		{
			double x = Math.random();
			double y = Math.random();
			double z = x*x+y*y;
			if(z<= 1.0) {
				 counter++;         //�J�E���^�[���P���₷�B
	}
}
		System. out. println("��ȉ���" + counter + "��");      //�\���B
	}
}
