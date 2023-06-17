package b211210306;

public class Koloni {
	
	
	private int populasyon;
	private int yemekStogu;
	private int kazanma;
	private int kaybetme;
	private char sembol;
	private int oyunBitsin;
	
	
	public Koloni(int deger,int sembol) {
		this.populasyon = deger;
		this.yemekStogu = deger*deger;
		this.kazanma = 0;
		this.kaybetme = 0;
		this.sembol = (char)sembol;
		this.oyunBitsin = 1;
	}
	
	
	public String toString() {
		String cikti;
		if(this.yemekStogu > 1 && this.populasyon > 1) {
			cikti = String.format("   %c        %d          %d          %d          %d\n"
			,this.sembol,this.populasyon,this.yemekStogu,this.kazanma,this.kaybetme);
		}
		else {
			cikti = "   --        --          --          --          --\n";
			this.oyunBitsin = 0;
		}
		return cikti;
	}
	
	public int getPopulasyon() {
		return this.populasyon;
	}
	
	public void setPopulasyonEkle(int deger) {
		this.populasyon += deger;
	}
	
	public void setPopulasyonCikar(int deger) {
		this.populasyon -= deger;
	}
	
	public int getYemekstogu() {
		return this.yemekStogu;
	}
	
	public void setYemekstoguEkle(int val) {
		this.yemekStogu += val;
	}
	
	public void setYemekstoguCikar(int val) {
		this.yemekStogu -= val;
	}
	
	public void kazanmaEkle() {
		this.kazanma +=1;
	}
	
	public void kaybetmeEkle() {
		this.kaybetme +=1;
	}
	
	public int getOyunbitsin() {
		return this.oyunBitsin;
	}
	
}
