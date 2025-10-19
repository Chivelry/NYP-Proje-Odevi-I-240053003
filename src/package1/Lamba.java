package package1;
/**
 * Ev, ofis veya dış mekanlarda kullanılan aydınlatma
 * cihazlarının (ampul, armatür vb.) temel özelliklerini temsil eden sınıf.
 */
public class Lamba {
    // --- Özellikler ---
    private int guc;            // Güç tüketimi (Watt)
    private int renkSicakligi;  // Işık renginin sıcaklığı (Kelvin, Örn: 3000K)
    private int parlaklik;      // Mevcut parlaklık seviyesi (0-100%)
    private boolean acikMi;     // Lambanın yanıp yanmadığı (true: Açık, false: Kapalı)
    /**
     * Lamba sınıfının kurucu metodu.
     * Lambanın temel statik özelliklerini (güç, renk sıcaklığı) ayarlar.
     */
    public Lamba(int guc, int renkSicakligi) {
        this.guc = guc;
        this.renkSicakligi = renkSicakligi;
        this.parlaklik = 0; // Başlangıçta parlaklık sıfır (kapalı)
        this.acikMi = false;
    }
    // --- Davranışlar (Metotlar)---
    /**
     * Lambayı açma işlemini gerçekleştirir.
     * Açılırken parlaklığı %100 yapar.
     */
    public void Ac() {
        if (!acikMi) {
            acikMi = true;
            parlaklik = 100; // Açılınca tam parlaklıkta başlasın.
            System.out.println("Lamba açıldı. Tam parlaklıkta yanıyor.");
        } else {
            System.out.println("Lamba zaten açık.");
        }
    }
    /**
     * Lambayı kapatma işlemini gerçekleştirir.
     * Kapanınca parlaklığı 0 yapar.
     */
    public void Kapat() {
        if (acikMi) {
            acikMi = false;
            parlaklik = 0;
            System.out.println("Lamba kapatıldı.");
        } else {
            System.out.println("Lamba zaten kapalı.");
        }
    }
    /**
     * Lambanın parlaklık seviyesini ayarlar.
     * Sadece lamba açıkken çalışır ve seviye 0-100 arasında olmalıdır.
     * @param seviye Ayarlanmak istenen parlaklık yüzdesi.
     */
    public void ParlaklikAyarla(int seviye) {
        if (acikMi) {
            if (seviye >= 0 && seviye <= 100) {
                parlaklik = seviye;
                System.out.println("Parlaklık %" + parlaklik + " olarak ayarlandı.");
            } else {
                System.out.println("Hata: Parlaklık seviyesi 0 ile 100 arasında olmalıdır.");
            }
        } else {
            System.out.println("Lamba kapalı, parlaklık ayarlanamaz. Önce açın.");
        }
    }
    /**
     * Lambanın mevcut durumunu ve temel özelliklerini konsola yazdırır.
     */
    public void DurumuYazdir() {
        System.out.println("\n--- Lamba Durumu ---");
        System.out.println("Durum: " + (acikMi ? "Açık" : "Kapalı"));
        System.out.println("Güç: " + guc + "W");
        System.out.println("Renk Sıcaklığı: " + renkSicakligi + "K");
        System.out.println("Mevcut Parlaklık: %" + parlaklik);
    }
}