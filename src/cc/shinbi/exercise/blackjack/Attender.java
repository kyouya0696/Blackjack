package cc.shinbi.exercise.blackjack;

import java.io.IOException;
import java.util.ArrayList;

/**
 * �Q���҃N���X
 */
public abstract class Attender {
	protected ArrayList<Card> cards;
	protected String name;

	public Attender(String name) {
		this.name = name;
		initialize();
	}

	public void initialize() {
		this.cards = new ArrayList<Card>();
	}

	/**
	 * @param initialize ����������B
	 */
	public void start(Stock stock) {
		this.cards.clear();
		for (int i = 0; i<2; i++) {
			Card card = stock.pickCard();
			this.cards.add(card);
		}
	}
/**
 * �Q�[���̊J�n����B
 * Stock�@�R�D�I�u�W�F�N�g
 */
	public String getName() {
		return name;
	}
/**
 * �Q���҂̖��O���擾����B
 * @return �Q���҂̖��O
 */
	public void hit(Stock stock) {
		Card card = stock.pickCard();
		this.cards.add(card);
	}
/**
 * �R�D����ꖇ����
 * Stock�@�R�D�I�u�W�F�N�g
 */
	public int calculateStrength() {
		// ��{�I�ɂ͎�D�̒l�̍��v�l�B�B
		int strength = 0;
		boolean foundA = false;
		for (int i = 0; i < this.cards.size(); i++) { // ��D��this.card����擾�ł���B
		Card card = this.cards.get(i);
		int point = Math.min(card.getNumber(), 10);
			if (point == 1) {
				foundA = true;
			}
			strength = strength + point;
		}
			if (foundA && strength <= 11) {
				strength = strength + 10;
			}
			else if (strength > 21) {// ��D�̐�����A(1)�̏ꍇ�́A�l��1��������11�Ƃ���B

					strength = 0;
				}
		return strength;
	}
/**
 * ��D�̋����̌v�Z����B
 * @return ��D�̋����i�O�`�Q�P�j
 */
	public int calculateStrengthOrg() {
		int strength = 0;

		int numA = 0;
		int sum = 0;
		 // �J�[�h�̖������񂷁B
		for(int ii = 0; ii < this.cards.size(); ++ii) {
			int pt = this.cards.get(ii).getNumber();
			if(pt > 10) {
				// �G�D��10�B
				pt = 10;
			}
			// ���v�B �܂���A�͂P�B
			sum += pt;
			// A�̖����𐔂���B
			if(pt == 1) {
				++numA;
			}
		}
		strength = sum;
		// A�̖�����A 10�𑫂��Ă����B
		for(int ii = 0; ii < numA; ++ii) {
			sum += 10;
			// 10���������̂�21�ȉ��Ȃ�A���������̂̕�������
			if(sum <= 21) {
				strength = sum;
			}
			else {
				// burst�����炱��ȏ㑫���Ă�burst�B
				break;
			}
		}
			// burst�B
			if(strength > 21) {
				strength = 0;
			}
			return strength;
		}

	public String toString() {
		String string = name + ":";
		for (int i = 0; i < this.cards.size(); i++) {
			Card card = this.cards.get(i);
			string = string + card.toString();
		}
		return string;
	}
/**
 * �Q���҂̏�Ԃ̕�������擾����B
 */
	public void display() {
		System.out.println(this.toString());
	}
	/**
	 * �Q���҂̏�Ԃ�\������B
	 */
	public abstract void play(Stock stock) throws IOException;
}
/**
 * �v���C����i���ۃ��\�b�h�j
 * stock �R�D�I�u�W�F�N�g
 * ��O�F
 */