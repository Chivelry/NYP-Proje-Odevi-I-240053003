package package1;
public class Hayvan {
    String tur;
    String ad;
    int yas;
    double agirlik;
    boolean acMi;
    boolean uyuyorMu;

    public Hayvan(String tur, String ad, int yas, double agirlik) {
        this.tur = tur;
        this.ad = ad;
        this.yas = yas;
        this.agirlik = agirlik;
        this.acMi = true;
        this.uyuyorMu = false;
    }

    public void YemekYe(String besin) {
        if (acMi) {
            System.out.println(ad + " (" + tur + ") " + besin + " yiyor. Artık tok.");
            acMi = false;
        } else {
            System.out.println(ad + " şu an tok, yemek yemiyor.");
        }
    }

    public void SesCikar() {
        System.out.println(ad + " bir ses çıkarıyor...");
    }

    public void UyuVeyaUyan() {
        if (!uyuyorMu) {
            uyuyorMu = true;
            System.out.println(ad + " uyumaya başladı.");
        } else {
            uyuyorMu = false;
            System.out.println(ad + " uyandı.");
        }
    }

    public void OzellikleriGoster() {
        System.out.println("\n--- Hayvan Bilgileri ---");
        System.out.println("Tür: " + tur);
        System.out.println("Adı: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Ağırlık: " + agirlik + " kg");
    }
}