package tr.edu.medipol.yazilimaraclari.safaksezer.h5190050.finalProjesi;

import org.springframework.web.bind.annotation.*;


import java.util.*;
@RestController
@RequestMapping("/urun")
public class UrunRestApi {

	@GetMapping("/listele")
	public List<Urun> listele(){
		return UrunVeritabani.urunleriGetir();
	}
	@PostMapping("/ekle")
	public Urun ekle(@RequestBody Urun urun){
		UrunVeritabani.urunEkle(urun);
		return urun;
	}
	@DeleteMapping("/sil")
	public String sil(@RequestBody String urunAd) {
		UrunVeritabani.urunSil(urunAd);
		return urunAd;
	}
}
