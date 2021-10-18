package cc.shinbi.exercise.blackjack.test;



import org.junit.jupiter.api.Test;
import cc.shinbi.exercise.blackjack.Card;
import cc.shinbi.exercise.blackjack.Stock;

class StockTest {

	@Test
	void testStock() {
		Stock stock = new Stock();
		while(stock.getNumberOfCards() > 0) {
			Card card = stock.pickCard();
			System.out.println(card);
		}
	}

}
