package b211210306;

import java.util.Random;

public class Btaktik extends Taktik {
	
	public int savas() {
		Random rand = new Random();
		int sayi = rand.nextInt(501);
		return sayi;
	}
	
}
