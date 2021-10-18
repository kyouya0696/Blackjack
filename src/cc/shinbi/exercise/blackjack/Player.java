package cc.shinbi.exercise.blackjack;


import java.io.BufferedReader;
import java.io.IOException;

/**
*
* �v���C���[�N���X
*
*/
public class Player extends Attender {
	public static final int ACTION_HIT = 1;
	public static final int ACTION_STAND = 2;

	private BufferedReader reader;

	public Player(BufferedReader reader) {
		super("You");
		this.reader = reader;
	}

	/**
	 * �Q����(�v���C���[�ƃf�B���[)
	 */
	@Override
	public int calculateStrength() {
		int strength = super.calculateStrength();
		if (strength == 0) {
			strength = -1;
		}
		return strength;
	}

	/**
	 * �J�[�h�̑S�Ă̎�D�B
	 */
	@Override
	public void play(Stock stock) throws IOException {
		boolean standing = false;
		while (!standing) {
			this.display();
			int action = selectAction();
			if (action == ACTION_HIT) {
				this.hit(stock);
				int strength = this.calculateStrength();
				if (strength <= 0) {
					standing = true;
				}
				else {
					standing = true;
				}
			}
		}
	}
	/**
	 *�@�f�B�[���[�̎�D�̏����擾����B
	 * �v���C���[�̎�D�̏����擾����B
	 */
	private int selectAction() throws IOException {
		String selectMassage = "[" + ACTION_HIT + "] Hit (�J�[�h������)"
	+ " [" + ACTION_STAND + "] Stand (��������)";
		System.out.println(selectMassage);
		int action = 0;
		while (action != ACTION_HIT && action != ACTION_STAND) {
			String input = this.reader.readLine();
			action = Integer.parseInt(input);
		}
		return action;
	}

}

/**
 * �J�[�h�̌��ʂ�\�����܂��B
 * �������J�[�h�̌��ʂ��擾����B
 */
