package cc.shinbi.exercise.hit_blow;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Numbers {
	private int[] array;

	public Numbers(int size) {
		int length = Math.max(Math.min(size, 9), 1);
		this.array = new int[length];
		Arrays.fill(this.array, 0);
	}

	public void random(int maxNumber) {
		List<Integer> list = new ArrayList<Integer>();
		for (int n = 1; n <= maxNumber; n++) {
			list.add(n);
		}
		Collections.shuffle(list);

		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = list.get(i);
		}
	}

	public void input(String input) {
		int tmp = Integer.parseInt(input);
		for (int i = 0; i < this.array.length; i++) {
			this.array[this.array.length - 1 - i] = tmp % 10;
			tmp = tmp / 10;
		}
	}

	public int countHit(Numbers other) {
		int hit = 0;
		for (int a = 0; a < other.array.length; ++a) {
			for (int kk = 0; kk < this.array.length; ++kk) {
				if (this.array.length > a) {
					if (this.array[a] == other.array[a]) {
						++hit;
					}
				}
			}
		}
		return hit;
	}

	public int countUsed(Numbers other) {
		int used = 0;
		for (int b = 0; b < other.array.length; ++b) {
			for (int ll = 0; ll < this.array.length; ++ll) {
					if (this.array[ll] == other.array[b]) {
						++used;
						break;
					}
			}
		}
		return used;
	}

	public Result check(Numbers other) {
		int hit = this.countHit(other);
		int used = this.countUsed(other);
		int blow = used - hit;
		Result result = new Result(hit, blow);
		System. out. println(other + "---" + result);
		return result;
	}

	public String toString() {
		String string = "Not available";
		if (this.array != null) {
			string = "";
			for (int i = 0; i < this.array.length; i++) {
				string = string + this.array[i];
			}
		}
		return string;
	}
}