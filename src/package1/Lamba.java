package package1;
public class Lamba {
    private int guc;
    private int renkSicakligi;
    private int parlaklik;
    private boolean acikMi;

    public Lamba(int guc, int renkSicakligi) {
        this.guc = guc;
        this.renkSicakligi = renkSicakligi;
        this.parlaklik = 0;
        this.acikMi = false;
    }

    public void Ac() {
        if (!acikMi) {
            acikMi = true;
            parlaklik = 100;
            System.out.println("Lamba açıldı. Tam parlaklıkta yanıyor.");
        } else {
            System.out.println("Lamba zaten açık.");
        }
    }

    public void Kapat() {
        if (acikMi) {
            acikMi = false;
            parlaklik = 0;
            System.out.println("Lamba kapatıldı.");
        } else {
            System.out.println("Lamba zaten kapalı.");
        }
    }

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

    public void DurumuYazdir() {
        System.out.println("\n--- Lamba Durumu ---");
        System.out.println("Durum: " + (acikMi ? "Açık" : "Kapalı"));
        System.out.println("Güç: " + guc + "W");
        System.out.println("Renk Sıcaklığı: " + renkSicakligi + "K");
        System.out.println("Mevcut Parlaklık: %" + parlaklik);
    }
}