package tr.edu.medipol.yazilimaraclari.safaksezer.h5190050.finalProjesi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalProjesiApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testUrunleriGetir() {
		List<Urun> urunler = UrunVeritabani.URUNLER;
		List<Urun> gelenUrunler = UrunVeritabani.urunleriGetir();
		assertEquals(urunler,gelenUrunler);
	}
	@Test
	public void testUrunEkle() {
		List<Urun> urunler = UrunVeritabani.URUNLER;
		List<Urun> urunlerSonuc = UrunVeritabani.urunEkle(new Urun("Telefon","Samsung Galaxy a75",3800));
		assertEquals(urunler,urunlerSonuc);
	}
	
}
