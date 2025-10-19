package package1;
public class BeyazEsya {
    String marka; //Arçelik veya Beko
    String model;
    String enerjiSinifi; //Enerji Verimlilik (A++ veya B gibi)
    double fiyat;
    int garantiSuresi; //Yıllık
    boolean durum; //Açık veya Kapalı

    public BeyazEsya(String marka, String model, String enerjiSinifi, double fiyat, int garantiSuresi) {
        this.marka = marka;
        this.model = model;
        this.enerjiSinifi = enerjiSinifi;
        this.fiyat = fiyat;
        this.garantiSuresi = garantiSuresi;
        this.durum = false; // Başlangıçta kapalı
    }

    public void CihazAc() {
        if (!durum) {
            durum = true;
            System.out.println(marka + " " + model + " açıldı.");
        } else {
            System.out.println(marka + " " + model + " zaten açık.");
        }
    }

    public void CihazKapa() {
        if (durum) {
            durum = false;
            System.out.println(marka + " " + model + " kapatıldı.");
        } else {
            System.out.println(marka + " " + model + " zaten kapalı.");
        }
    }

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
