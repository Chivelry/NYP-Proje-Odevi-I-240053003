package package1;
/**
 * Çeşitli spor dallarında kullanılan topların
 * ortak özelliklerini ve temel fiziksel davranışlarını temsil eden sınıf.
 */
public class Top {
    // --- Özellikler ---
    String tip;     // Topun türü (Örn: Futbol, Basketbol, Tenis)
    double cap;     // Topun çapı (cm)
    double agirlik; // Topun ağırlığı (gram)
    double basinc;  // İçindeki hava basıncı (bar cinsinden)
    boolean sisikMi; // Basınç yeterli mi? (true/false)
    /**
     * Top sınıfının kurucu metodu.
     * Topun temel fiziksel özelliklerini ayarlar ve şişik durumunu hesaplar.
     */
    public Top(String tip, double cap, double agirlik, double basinc) {
        this.tip = tip;
        this.cap = cap;
        this.agirlik = agirlik;
        this.basinc = basinc;
        // Basınç 0.5 bar'dan büyükse topu şişik kabul et.
        this.sisikMi = basinc > 0.5;
    }
    // --- Davranışlar (Metotlar)---
    /**
     * Topun yuvarlanma eylemini simgeler.
     * Şişik durumuna göre farklı çıktı verir.
     */
    public void Yuvarlan() {
        if (sisikMi) {
            System.out.println(tip + " topu yuvarlanıyor...");
        } else {
            System.out.println("Top yeterince şişik değil, sekerek/sürünerek ilerliyor.");
        }
    }
    /**
     * Topun sıçrama eylemini simgeler.
     * Sıçrama yüksekliği kuvvet ve basınca bağlı olarak hesaplanır.
     * @param kuvvet Vuruşun veya çarpmanın kuvveti.
     */
    public void Sicra(double kuvvet) {
        if (sisikMi) {
            // Sıçrama yüksekliği için basit bir formül
            double sicramaYuksekligi = kuvvet * basinc * 0.5;
            System.out.println(tip + " topu" + kuvvet + " kuvvetiyle vuruşta " + sicramaYuksekligi + " birim sıçradı.");
        } else {
            System.out.println(tip + " topu sönük olduğu için çok az sıçradı.");
        }
    }
    /**
     * Topun içindeki hava basıncını artırır ve şişiklik durumunu günceller.
     * @param artanBasinc Topa eklenen basınç miktarı.
     */
    public void Sisir(double artanBasinc) {
        this.basinc += artanBasinc;
        this.sisikMi = this.basinc > 0.5;
        System.out.println(tip + " topu şişirildi. Yeni basınç: " + basinc + " bar.");
    }
    /**
     * Topun tüm özelliklerini konsola yazdırır.
     */
    public void OzellikleriGoster() {
        System.out.println("\n--- " + tip + " Topu Özellikleri ---");
        System.out.println("Çap: " + cap + " cm");
        System.out.println("Ağırlık: " + agirlik + " gr");
        System.out.println("Basınç: " + basinc + " bar");
        System.out.println("Şişik Durumu: " + (sisikMi ? "Evet" : "Hayır"));
    }
}