package package2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Siparis {
    private int siparisId;
    private Date siparisTarihi;
    private double toplamTutar;
    private String siparisDurumu; // Örn: "Onay Bekliyor", "Kargoda"
    private List<SiparisKalemi> siparisKalemleri; // SiparisKalemi nesneleri listesi
    private Adres teslimatAdresi; // Bir Adres nesnesi

    // Constructor (Sepetten oluşturmak için)
    public Siparis(int siparisId, Sepet sepet, Adres teslimatAdresi) {
        this.siparisId = siparisId;
        this.siparisTarihi = new Date(); // Şu anki tarih
        this.siparisDurumu = "Onay Bekliyor";
        this.teslimatAdresi = teslimatAdresi;

        // Siparis Kalemlerini oluştur ve toplam tutarı hesapla
        this.siparisKalemleri = new ArrayList<>();
        double genelToplam = 0.0;
        for (Map.Entry<Urun, Integer> entry : sepet.getUrunler().entrySet()) {
            SiparisKalemi kalem = new SiparisKalemi(entry.getKey(), entry.getValue());
            this.siparisKalemleri.add(kalem);
            genelToplam += kalem.kalemToplamTutariHesapla();
        }
        this.toplamTutar = genelToplam;
        System.out.println("Sipariş oluşturuldu. Toplam Tutar: " + this.toplamTutar + " TL");
    }

    // Metotlar
    public void siparisDurumunuGuncelle(String yeniDurum) {
        this.siparisDurumu = yeniDurum;
        System.out.println("Sipariş durumu güncellendi: " + yeniDurum);
    }

    public void siparisOzetiniGoster() {
        System.out.println("\n--- SİPARİŞ ÖZETİ ---");
        System.out.println("Sipariş ID: " + siparisId);
        System.out.println("Tarih: " + siparisTarihi);
        System.out.println("Durum: " + siparisDurumu);
        System.out.println("Teslimat Adresi:\n" + teslimatAdresi.adresBilgisiniDondur());
        System.out.println("--- Ürünler ---");
        for (SiparisKalemi kalem : siparisKalemleri) {
            System.out.printf("Ürün: %s, Adet: %d, Fiyat: %.2f TL, Toplam: %.2f TL\n",
                    kalem.getUrun().getAd(), kalem.getAdet(),
                    kalem.getBirimFiyatOAnki(), kalem.kalemToplamTutariHesapla());
        }
        System.out.printf("GENEL TOPLAM: %.2f TL\n", toplamTutar);
    }

    // Getter'lar
    public double getToplamTutar() {
        return toplamTutar;
    }
    public int getSiparisId() {
        return siparisId;
    }

}