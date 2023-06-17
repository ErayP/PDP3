package b211210306;

import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.UIDefaults.LazyInputMap;

public class Test {

	public static void main(String[] args){
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Pozitif sayilari boslukla ayirarak girin: ");
	    String input = scanner.nextLine();
	    String[] sayilar = input.split(" ");
	    
	    
		Koloni[] koloniler = new Koloni[sayilar.length];
		Ataktik taktik1 = new Ataktik();
		Btaktik taktik2 = new Btaktik();
		Auretim uretim1 = new Auretim();
		Buretim uretim2 = new Buretim();
		Oyun oyun = new Oyun();
		
		
		int Oyunbitsin = 0;
		for(int i = 0 ;i<sayilar.length;i++) {
			int sayi = Integer.parseInt(sayilar[i]);
			koloniler[i] = new Koloni(sayi,21+i);
		}
		
		int tur_Sayisi = 1;
		while(true) {
			Oyunbitsin = 0;
			for(int i =0;i<sayilar.length;i++) {
				Oyunbitsin += koloniler[i].getOyunbitsin();
			}
			if(Oyunbitsin == 1) {
				break;
			}
			int rastgeleSayi = random.nextInt();
			System.out.println("Tur sayisi : "+tur_Sayisi);
			System.out.print("Sembol  Populasyon  Yemek Stogu   Kazanma   Kaybetme\n");
			System.out.print("--------------------------------------------------- \n");
			for(int k = 0;k<sayilar.length;k++) {
				String ciktiString =koloniler[k].toString();
				System.out.println(ciktiString);
			}
			System.out.print("--------------------------------------------------- \n");
			for(int i = 0;i < sayilar.length-1;i++) {
				for(int k =0;k<sayilar.length;k++) {
					if(rastgeleSayi%2==0) {
						taktik1.rastgele_Savas(koloniler[i],koloniler[k]);
					}
					else {
						taktik2.rastgele_Savas(koloniler[i],koloniler[k]);
					}
				}
			}
			for(int a = 0 ;a < sayilar.length;a++) {
				if(rastgeleSayi%2==0) {
					uretim2.rastgele_Uret(koloniler[a]);
				}
				else {
					uretim1.rastgele_Uret(koloniler[a]);
				}
			}
			for(int a = 0; a<sayilar.length; a++) {
				oyun.tur_Islemleri(koloniler[a]);
			}
			tur_Sayisi++;
		}
	}
}
