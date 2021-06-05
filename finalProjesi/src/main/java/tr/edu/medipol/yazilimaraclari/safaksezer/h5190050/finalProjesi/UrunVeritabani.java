package tr.edu.medipol.yazilimaraclari.safaksezer.h5190050.finalProjesi;

import java.util.*;

public final class UrunVeritabani {

	public static final List<Urun> URUNLER = new ArrayList<Urun>();
	static {
		URUNLER.add(new Urun("Telefon","Samsung Galaxy a21",2500));
		URUNLER.add(new Urun("Telefon","Samsung Galaxy a31",3000));
		URUNLER.add(new Urun("Telefon","Samsung Galaxy a71",3400));
	}
	
	public static List<Urun> urunleriGetir(){
		return URUNLER;
	}
	
	public static List<Urun> urunEkle(Urun urun) {
		URUNLER.add(urun);
		return URUNLER;
	}
	public static List<Urun> urunSil(String urunAd){
		for(Urun urun : URUNLER) {
			if(urun.getUrunAd().equals(urunAd)){
				URUNLER.remove(urun);
			}
		}
		return URUNLER;
	}
}
