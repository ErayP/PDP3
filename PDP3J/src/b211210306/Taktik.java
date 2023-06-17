package b211210306;

public abstract class Taktik {
	public void rastgele_Savas(Koloni koloni1,Koloni koloni2) {
		int taktik1 = savas();
		int taktik2 = savas();
		int sonuc = Math.abs(taktik1-taktik2);
		int yuzde = sonuc/10;
		int popCikar =0;
		if(koloni1.getPopulasyon() > 0 && koloni1.getYemekstogu() > 0 && koloni2.getPopulasyon() > 0 && koloni2.getYemekstogu() > 0) {
			if(taktik1 > taktik2) {
				popCikar = (koloni2.getPopulasyon()*yuzde/100);
				koloni2.setPopulasyonCikar(popCikar);
				koloni1.setYemekstoguEkle(popCikar);
				koloni2.setYemekstoguCikar(popCikar);
				koloni1.kazanmaEkle();
				koloni2.kaybetmeEkle();
			}
			else if(taktik1 < taktik2) {
				popCikar =(koloni1.getPopulasyon()*yuzde/100);
				koloni1.setPopulasyonCikar(popCikar);
				koloni2.setYemekstoguEkle(popCikar);
				koloni1.setYemekstoguCikar(popCikar);
				koloni1.kaybetmeEkle();
				koloni2.kazanmaEkle();
			}
			else {
				if(koloni1.getPopulasyon() >= koloni2.getPopulasyon()) {
					popCikar = (koloni2.getPopulasyon()*yuzde/100); 
					koloni2.setPopulasyonCikar(popCikar);
					koloni1.setYemekstoguEkle(popCikar);
					koloni2.setYemekstoguCikar(popCikar);
					koloni1.kazanmaEkle();
					koloni2.kaybetmeEkle();
				}
				else {
					popCikar =(koloni1.getPopulasyon()*yuzde/100);
					koloni1.setPopulasyonCikar(popCikar);
					koloni2.setYemekstoguEkle(popCikar);
					koloni1.setYemekstoguCikar(popCikar);
					koloni1.kaybetmeEkle();
					koloni2.kazanmaEkle();
				}
			}
		}
		else {
			return;
		}
	}
	public abstract int savas();
}

