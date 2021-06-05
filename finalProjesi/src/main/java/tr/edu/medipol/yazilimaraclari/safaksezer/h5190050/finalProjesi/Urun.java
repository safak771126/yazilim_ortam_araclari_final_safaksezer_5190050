package tr.edu.medipol.yazilimaraclari.safaksezer.h5190050.finalProjesi;

public class Urun {
	
	private String urunAd,urunKategori;
	private int urunFiyat;
	
	public Urun(String urunKategori,String urunAd, int urunFiyat) {
		super();
		this.urunKategori = urunKategori;
		this.urunAd = urunAd;
		this.urunFiyat = urunFiyat;
	}
	
	public String getUrunKategori() {
		return urunKategori;
	}

	public String getUrunAd() {
		return urunAd;
	}

	public int getUrunFiyat() {
		return urunFiyat;
	}
	
	
}
