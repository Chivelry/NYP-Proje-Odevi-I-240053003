package package1;
/**
 * Farklı uç tiplerine sahip tornavidaların
 * ortak özelliklerini ve temel işlevlerini temsil eden sınıf.
 */
public class Tornavida {
    // --- Özellikler ---
    String tip;             // Uç tipi (Örn: Yıldız, Düz, Tork)
    double uzunluk;         // Şaftın uzunluğu (cm)
    String malzeme;         // Şaftın yapıldığı malzeme (Örn: Krom Vanadyum Çelik)
    boolean izolasyonluMu;  // Elektriksel yalıtım (true/false)
    String sapRengi;        // Tutma yerinin rengi
    /**
     * Tornavida sınıfının kurucu metodu.
     * Tornavidanın yapısal özelliklerini belirler.
     */
    public Tornavida(String tip, double uzunluk, String malzeme, boolean izolasyonluMu, String sapRengi) {
        this.tip = tip;
        this.uzunluk = uzunluk;
        this.malzeme = malzeme;
        this.izolasyonluMu = izolasyonluMu;
        this.sapRengi = sapRengi;
    }
    // --- Davranışlar (Metotlar)---
    /**
     * Vidayı sıkma eylemini simgeler (Saat yönü).
     */
    public void Sık() {
        System.out.println(tip + " tornavida ile vida saat yönünde sıkılıyor...");
    }
    /**
     * Vidayı gevşetme eylemini simgeler (Saat yönü tersi).
     */
    public void Gevset() {
        System.out.println(tip + " tornavida ile vida saat yönünün tersine gevşetiliyor...");
    }
    /**
     * Tornavidanın elektriksel yalıtım durumunu kontrol eder ve kullanıcıyı uyarır.
     */
    public void IzolasyonuKontrolEt() {
        if (izolasyonluMu) {
            System.out.println("Dikkat: Bu tornavida elektriksel yalıtıma sahiptir. Güvenle kullanılabilir.");
        } else {
            System.out.println("Uyarı: Bu tornavida yalıtımsızdır. Elektrik varken kullanırken dikkatli olun!");
        }
    }
    /**
     * Tornavidanın tüm özelliklerini konsola yazdırır.
     */
    public void OzellikleriGoster() {
        System.out.println("\n--- Tornavida Özellikleri ---");
        System.out.println("Uç Tipi: " + tip);
        System.out.println("Uzunluk: " + uzunluk + " cm");
        System.out.println("Malzeme: " + malzeme);
        System.out.println("İzolasyonlu mu?: " + (izolasyonluMu ? "Evet" : "Hayır"));
        System.out.println("Renk: " + sapRengi);
    }
}