package package2;

import java.util.Date;

public class Odeme {
    private int odemeId;
    private Siparis siparis; // İlişkili Siparis nesnesi
    private String odemeYontemi; // "Kredi Kartı", "Havale"
    private double tutar;
    private Date odemeTarihi;
    private boolean onaylandiMi;

    // Constructor
    public Odeme(int odemeId, Siparis siparis, String odemeYontemi) {
        this.odemeId = odemeId;
        this.siparis = siparis;
        this.odemeYontemi = odemeYontemi;
        this.tutar = siparis.getToplamTutar();
        this.odemeTarihi = new Date();
        this.onaylandiMi = false; // Başlangıçta onaylanmamış
    }

    // Metotlar
    public void odemeOnayla() {
        if (!onaylandiMi) {
            this.onaylandiMi = true;
            siparis.siparisDurumunuGuncelle("Ödeme Alındı, Hazırlanıyor");
            System.out.println("Ödeme başarıyla onaylandı!");
        } else {
            System.out.println("Ödeme zaten onaylanmış.");
        }
    }

    public void odemeBilgileriniGoster() {
        System.out.println("\n--- ÖDEME BİLGİLERİ ---");
        System.out.println("ID: " + odemeId);
        System.out.println("Sipariş ID: " + siparis.getSiparisId());
        System.out.println("Yöntem: " + odemeYontemi);
        System.out.printf("Tutar: %.2f TL\n", tutar);
        System.out.println("Tarih: " + odemeTarihi);
        System.out.println("Onay Durumu: " + (onaylandiMi ? "Evet" : "Hayır"));
    }
}