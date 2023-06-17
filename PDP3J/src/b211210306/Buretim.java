package b211210306;

import java.util.Random;

public class Buretim extends Uretim {
	public int uretim() {
		Random rand = new Random();
		int uretim = rand.nextInt(4)+1;
		return uretim;
	}
}
