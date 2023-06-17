package b211210306;
import java.util.Random;
public class Ataktik extends Taktik {
	
	public int savas() {
		Random rand = new Random();
		int sayi = rand.nextInt(1001);
		return sayi;
	}
	
}
