package cc.shinbi.exercise.blackjack.test;

import org.junit.jupiter.api.Test;

import cc.shinbi.exercise.blackjack.Attender;
import cc.shinbi.exercise.blackjack.Stock;

class AttenderTest {

	@Test
	void test() {
		Stock stock = new Stock();
		Attender attender = new Attender("Test") {
			@Override
			public void play(Stock stock) {

			}
		};
		for(int i = 0; i < 5; i++) {
			if(i == 0) {
				attender.start(stock);
			}
			else {
				attender.hit(stock);
			}
			int strength = attender.calculateStrength();
			System. out. println(attender);
			System. out.println("Strength = " + strength);
		}
	}

}
