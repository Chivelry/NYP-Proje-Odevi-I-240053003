package package2;

import java.util.HashMap;
import java.util.Map;

public class Sepet {
    private Kullanici kullanici; // Bir Kullanici nesnesi
    // Ürünü ve adedini tutan yapı: Urun nesnesi -> Adet
    private Map<Urun, Integer> urunler;

    // Constructor
    public Sepet(Kullanici kullanici) {
        this.kullanici = kullanici;
        this.urunler = new HashMap<>();
    }

    // Metotlar
    public void sepeteEkle(Urun urun, int adet) {
        if (adet <= 0) {
            System.out.println("Geçersiz adet.");
            return;
        }

        // Stok kontrolü (basit bir örnek)
        if (urun.getStokAdedi() < adet) {
            System.out.println(urun.getAd() + " için yeterli stok yok. Mevcut: " + urun.getStokAdedi());
            return;
        }

        urunler.put(urun, urunler.getOrDefault(urun, 0) + adet);
        System.out.println(urun.getAd() + " ürününden " + adet + " adet sepete eklendi.");
    }

    public void sepettenCikar(Urun urun) {
        if (urunler.containsKey(urun)) {
            // Tamamını çıkarır
            urunler.remove(urun);
            System.out.println(urun.getAd() + " sepetten tamamen çıkarıldı.");
        } else {
            System.out.println("Bu ürün sepette bulunmamaktadır.");
        }
    }

    public double toplamTutariHesapla() {
        double toplam = 0.0;
        for (Map.Entry<Urun, Integer> entry : urunler.entrySet()) {
            Urun urun = entry.getKey();
            int adet = entry.getValue();
            toplam += urun.getFiyat() * adet;
        }
        return toplam;
    }

    public void sepetiGoster() {
        System.out.println("--- " + kullanici.getKullaniciAdi() + " adlı kullanıcının Sepeti ---");
        if (urunler.isEmpty()) {
            System.out.println("Sepetiniz boş.");
            return;
        }

        for (Map.Entry<Urun, Integer> entry : urunler.entrySet()) {
            Urun urun = entry.getKey();
            int adet = entry.getValue();
            System.out.printf("Ürün: %s, Adet: %d, Birim Fiyat: %.2f TL, Toplam: %.2f TL\n",
                    urun.getAd(), adet, urun.getFiyat(), urun.getFiyat() * adet);
        }
        System.out.printf("GENEL TOPLAM: %.2f TL\n", toplamTutariHesapla());
    }

    // Getter
    public Map<Urun, Integer> getUrunler() {
        return urunler;
    }
}