package cc.shinbi.exercise.blackjack;

import java.io.IOException;
/**
 *
 * �f�B�[���[ �N���X
 *
 */
public class Dealer extends Attender {
	private boolean opened;

	public Dealer() {
		super("Computer");
	}

	/**
	 * �R���X�g���N�^�[
	 */
	@Override
	public void start(Stock stock) {
		super.start(stock);
		this.opened = false;
	}
	/**
	 * �N���X����R�s�[���ꂽ�����FAttender
	 * �Q�[�����J�n����B
	 * �I�[�o���C�h�F
	 * start �N���X�� Attender
	 * stock �R�D�I�u�W�F�N�g
	 */
	@Override
	public void play(Stock stock) throws IOException {
		int strength = this.calculateStrength();
		while (strength < 17 && strength > 0) {
			this.hit(stock);
			strength = this.calculateStrength();
		}
		this.opened = true;
	}
/**
 * �N���X����R�s�[���ꂽ�����FAttender
 * �v���C����i���ۃ��\�b�h�j
 * play �N���X�� Attender
 * stock �R�D�I�u�W�F�N�g
 */
	@Override
	public String toString() {
		String string = "";
		if (this.opened) {
			string = super.toString();
		} else {
			string = this.name + ":";
			for (int i = 0; i < this.cards.size(); i++) {
				Card card = this.cards.get(i);
				if (i == 0) {
					string = string + card.toString();
				} else {
					string = string + "[#####]";
				}
			}
		}
		return string;
	}
}
/**
 * �N���X����R�s�[���ꂽ�����FAttender
 * �Q���҂̏�Ԃ𕶎�����擾����B
 *  �I�[�o���C�h�F
 *  toString �N���X���@Attender
 */