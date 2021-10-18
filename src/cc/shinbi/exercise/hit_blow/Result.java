package cc.shinbi.exercise.hit_blow;

public class Result {
	private int hit;
	private int blow;

	public Result(int hit, int blow) {
		this.hit = hit;
		this.blow = blow;
	}

	public int getHit() {
		return hit;
	}

	public int getBlow() {
		return blow;
	}

	public String toString() {
//	String string = "H:" + this.hit + " B:" + this.blow;
	String string = String.format("H: %d B: %d", this.hit, this.blow);
		return string;
	}
}
