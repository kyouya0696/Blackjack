package cc.shinbi.exercise.blackjack;

/**
 *
 * @author �J�[�h�Ǘ��N���X
 *
 */
public class Card {
	/** �}�[�N��` */
	public enum Suit {

		SPADE,
		/** �X�y�[�h */
		HEART,
		/** �n�[�g */
		DIAMOND,
		/** �_�C�� */
		CLUB
		/** �N���u */
}
	private Suit suit;
	private int number;
	/**
	 * �R���X�g���N�^�[
	 * @param suit �}�[�N
	 * @param number ����
	 */

	public Card(Suit suit, int number) {
		this.suit = suit;
		this.number = number;
	}

	/**
	 * �J�[�h�̃}�[�N���擾����B
	 * @return �J�[�h�̃}�[�N
	 */

	public Suit getSuit() {
		return suit;
	}

	/**
	 * �J�[�h�̃}�[�N���擾����B
	 * @return �J�[�h�̐���
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * �}�[�N�̏��̕�������擾����B
	 * (��F Suit.SPAND -> �X�y�[�h)
	 * @param suit �}�[�N�̏��
	 * @return ������
	 */
	public static String getSuitString(Suit suit) {
		String string = null;

		if (suit == Suit.SPADE) {
			string = "�X�y�[�h";
		}
		else if (suit == Suit.HEART) {
			string = "�n�[�g";
		}
		else if (suit == Suit.DIAMOND) {
			string = "�_�C��";
		}
		else if (suit == Suit.CLUB) {
			string = "�N���u";
		}
		return string;
	}

	/**
	 * �������̕�������擾����B
	 * (��F �P -> A, 2 -> 2, 3 -> 3,4 -> 4, 5 -> 5,�E�E�E,12 -> Q, 13 -> K)
	 * @param number ����
	 * @return �����̕�����
	 */
	public static String getNumberString(int number) {
		String string = null;

		if (number == 1) {
			string = "A";
		}
		else if (number == 11) {
			string = "J";
		}
		else if (number == 12) {
			string = "Q";
		}
		else if (number == 13) {
			string = "K";
		}
		else if (number >= 2 && number <= 10) {
			string = Integer.toString(number);
	}
		return string;
	}
	/**
	 * �J�[�h�̕�������擾����B
	 * (��F [�X�y�[�hA],[�X�y�[�h2],�E�E�E)
	 */
	public String toString() {
		String suit = getSuitString(this.suit);
		String number = getNumberString(this.number);

		String string = "[]";
		if (suit != null && number != null) {
			string = "[" + suit + number + "]";
		}
		return string;
}
	/**
	 * 52���̑S�ẴJ�[�h���擾����B
	 * @return 52���̃J�[�h�̔z��
	 */
	public static Card[] getAllCards() {
		Card[] cards = new Card[52];
		int index = 0;

		Suit[] suits = { Suit.SPADE, Suit.HEART, Suit.CLUB, Suit.DIAMOND};
		for (int i = 0; i < suits.length; i++) {
			Suit suit = suits[i];
			for (int number = 1; number <= 13; number++) {
				Card card = new Card(suit, number);
				cards[index] = card;
				index++;
			}
		}
			return cards;
	}
}