package package1;
/**
 * Beyaz eşya ürünlerinin (buzdolabı, çamaşır makinesi vb.)
 * ortak özelliklerini ve temel davranışlarını temsil eden ana sınıf.
 */
public class BeyazEsya {
    // --- Özellikler ---
    String marka;
    String model;
    String enerjiSinifi;    // Enerji Verimlilik Sınıfı (Örn: A++, B)
    double fiyat;
    int garantiSuresi;      // Garanti süresi (yıl olarak)
    boolean durum;          // Cihazın mevcut çalışma durumu (true: Açık, false: Kapalı)
    /**
     * BeyazEsya sınıfının kurucu (constructor) metodu.
     * Yeni bir BeyazEsya nesnesi oluşturulurken gerekli temel bilgileri alır.
     */
    public BeyazEsya(String marka, String model, String enerjiSinifi, double fiyat, int garantiSuresi) {
        this.marka = marka;
        this.model = model;
        this.enerjiSinifi = enerjiSinifi;
        this.fiyat = fiyat;
        this.garantiSuresi = garantiSuresi;
        this.durum = false; // Bütün cihazlar başlangıçta kapalı olarak ayarlanır.
    }
    // --- Davranışlar (Metotlar)---
    /**
     * Cihazın açılma işlemini gerçekleştirir.
     * Cihaz kapalıysa durumunu 'açık' olarak değiştirir.
     */
    public void CihazAc() {
        if (!durum) {
            durum = true;
            System.out.println(marka + " " + model + " açıldı.");
        } else {
            System.out.println(marka + " " + model + " zaten açık.");
        }
    }
    /**
     * Cihazın kapatılma işlemini gerçekleştirir.
     * Cihaz açıksa durumunu 'kapalı' olarak değiştirir.
     */
    public void CihazKapa() {
        if (durum) {
            durum = false;
            System.out.println(marka + " " + model + " kapatıldı.");
        } else {
            System.out.println(marka + " " + model + " zaten kapalı.");
        }
    }
    /**
     * Beyaz eşyanın tüm özelliklerini konsola yazdırır.
     */
    public void BilgileriGoster() {
        System.out.println("--- Cihaz Bilgileri ---");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Enerji Sınıfı: " + enerjiSinifi);
        System.out.println("Fiyatı: " + fiyat);
        System.out.println("Garanti Süresi: " + garantiSuresi);
        System.out.println("Durum: " + (durum ? "Açık" : "Kapalı"));
    }
}