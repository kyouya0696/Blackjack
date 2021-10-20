package cc.shinbi.exercise.blackjack.test;

import org.junit.jupiter.api.Test;

import cc.shinbi.exercise.blackjack.Card;

class CardTest {

	@Test
	void testCard() {
		Card[] cards = Card.getAllCards();
		for (int i = 0; i < cards.length; i++) {
			Card card = cards[i];
			System.out.println(card);
		}
	}
}
