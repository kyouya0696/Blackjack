package cc.shinbi.exercise.blackjack;

import java. util. ArrayList;
import java. util. Arrays;
import java. util. Collections;
import java. util. List;

/**
 * �R�D�@�N���X
 */
public class Stock {
	private ArrayList<Card> cards;

	public Stock() {
		initialize();
	}


	/**
	 * �R�D�i��D�̃J�[�h�j���擾����
	 */
	public void initialize() {
		Card[] array = Card.getAllCards();
		List<Card> list = Arrays.asList(array);
		Collections.shuffle(list);
		this.cards = new ArrayList<Card>(list);
}
	/**
	 *�J�[�h�̏��̑S�Ă�����������
	 */
	public int getNumberOfCards() {
		return this.cards.size();
}
	/**
	 * �J�[�h�̐��������擾����B
	 */
	public Card pickCard() {
		Card card = this.cards.get(0);
		this.cards.remove(0);
		return card;
	}
}

/**
 * �S�ẴJ�[�h�̃X�g�b�N���擾����B
 * �J�[�h������
 */
