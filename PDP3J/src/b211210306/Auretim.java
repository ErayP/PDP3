package b211210306;

import java.util.Random;

public class Auretim extends Uretim {
	@Override
	public int uretim() {
		Random rand = new Random();
		int uretim = rand.nextInt(11)+1;
		return uretim;
	}
}
