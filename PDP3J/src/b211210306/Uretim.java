package b211210306;

public abstract class Uretim {
	public void rastgele_Uret(Koloni koloni) {
		if(koloni.getPopulasyon() > 0 && koloni.getYemekstogu() > 0) {
			int deger = uretim();
			koloni.setYemekstoguEkle(deger);
		}
		else {
			return;
		}
	}
	public abstract int uretim();
}
