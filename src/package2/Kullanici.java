package package2;

import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    private int kullaniciId;
    private String kullaniciAdi;
    private String sifre; // Hash'lenmiş gibi
    private String email;
    private List<Adres> adresler; // Bir Adres nesneleri listesi

    // Constructor
    public Kullanici(int kullaniciId, String kullaniciAdi, String sifre, String email) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.adresler = new ArrayList<>();
    }

    // Metotlar
    public void adresEkle(Adres yeniAdres) {
        adresler.add(yeniAdres);
        System.out.println(yeniAdres.getAdresBasligi() + " adresi eklendi.");
    }

    public void adresSil(Adres adres) {
        if (adresler.remove(adres)) {
            System.out.println(adres.getAdresBasligi() + " adresi silindi.");
        } else {
            System.out.println("Adres bulunamadı.");
        }
    }

    public void bilgileriGoster() {
        System.out.println("--- Kullanıcı Bilgileri ---");
        System.out.println("ID: " + kullaniciId);
        System.out.println("Kullanıcı Adı: " + kullaniciAdi);
        System.out.println("Email: " + email);
        System.out.println("--- Kayıtlı Adresler ---");
        if (adresler.isEmpty()) {
            System.out.println("Kayıtlı adres bulunmamaktadır.");
        } else {
            for (int i = 0; i < adresler.size(); i++) {
                System.out.println((i + 1) + ". " + adresler.get(i).adresBilgisiniDondur() + "\n");
            }
        }
    }
    // Getter metotları (diğer sınıflar için gerekli)
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
}