package cc.shinbi.exercise.hit_blow.test;

import org.junit.jupiter.api.Test;
import cc.shinbi.exercise.hit_blow.Numbers;

class NumberTest {
	@Test
	void testRandom() {
		for (int i = 0; i < 10; i++) {
			Numbers numbers = new Numbers(4);
			numbers.random(9);
			System. out. println(numbers);
		}
	}

	@Test
	void testHitBlow() {
		String correctString = "1234";
		String[] tests = {
			"1234", "5678", "4321", "1243", "4215", "1357", "2468",
				};

		Numbers correctNumbers = new Numbers(4);
		correctNumbers.input(correctString);

		for (int i = 0; i < tests.length; i++) {
			Numbers test = new Numbers(4);
			test.input(tests[i]);

			correctNumbers.check(test);
		}
	}
}
