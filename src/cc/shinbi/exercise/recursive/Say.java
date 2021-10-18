package cc.shinbi.exercise.recursive;

public class Say {

	public static void main(String[] args) {
	say("Hello!",10);		// "Hello!" と10回言う。
}

	private static void say(String message, int times) {
		if(times >= 1) {
			System.out.println(message);
			say(message, times -1);
		}
	}
}
