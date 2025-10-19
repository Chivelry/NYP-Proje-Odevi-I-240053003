package package1;
/**
 * Tüm hayvanların (kedi, köpek, kuş vb.)
 * ortak özelliklerini ve temel yaşam davranışlarını temsil eden sınıf.
 */
public class Hayvan {
    // --- Özellikler ---
    String tur;     // Hayvanın türü (Örn: Kedi, Köpek)
    String ad;
    int yas;
    double agirlik; // Hayvanın ağırlığı (kg)
    boolean acMi;   // Açlık durumu (true: Aç, false: Tok)
    boolean uyuyorMu; // Uyku durumu (true: Uyuyor, false: Uyanık)
    /**
     * Hayvan sınıfının kurucu metodu.
     * Hayvanın temel biyolojik özelliklerini ayarlar.
     */
    public Hayvan(String tur, String ad, int yas, double agirlik) {
        this.tur = tur;
        this.ad = ad;
        this.yas = yas;
        this.agirlik = agirlik;
        this.acMi = true;      // Hayvan başlangıçta aç olarak kabul edilsin.
        this.uyuyorMu = false; // Başlangıçta uyanık.
    }
    // --- Davranışlar (Metotlar)---
    /**
     * Hayvanın yemek yeme eylemini simgeler.
     * Açsa yer ve tok hale gelir.
     * @param besin Tüketilen besinin adı.
     */
    public void YemekYe(String besin) {
        if (acMi) {
            System.out.println(ad + " (" + tur + ") " + besin + " yiyor. Artık tok.");
            acMi = false;
        } else {
            System.out.println(ad + " şu an tok, yemek yemiyor.");
        }
    }
    /**
     * Hayvanın ses çıkarma eylemini simgeler (alt sınıflarda özelleştirilebilir).
     */
    public void SesCikar() {
        System.out.println(ad + " bir ses çıkarıyor...");
    }
    /**
     * Hayvanın uyku durumunu değiştirir (Uyanıksa uyutur, uyuyorsa uyandırır).
     */
    public void UyuVeyaUyan() {
        if (!uyuyorMu) {
            uyuyorMu = true;
            System.out.println(ad + " uyumaya başladı.");
        } else {
            uyuyorMu = false;
            System.out.println(ad + " uyandı.");
        }
    }
    /**
     * Hayvanın tüm özelliklerini konsola yazdırır.
     */
    public void OzellikleriGoster() {
        System.out.println("\n--- Hayvan Bilgileri ---");
        System.out.println("Tür: " + tur);
        System.out.println("Adı: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Ağırlık: " + agirlik + " kg");
    }
}