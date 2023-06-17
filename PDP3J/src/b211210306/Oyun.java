package b211210306;

public class Oyun {
	public void tur_Islemleri(Koloni koloni) {
		int popIslem = koloni.getPopulasyon();
		koloni.setPopulasyonEkle(popIslem/5);
		int yemekIslem = 2*koloni.getPopulasyon();
		koloni.setYemekstoguCikar(yemekIslem);
	}
}
