package package1;
public class Tornavida {
    String tip;
    double uzunluk;
    String malzeme;
    boolean izolasyonluMu;
    String sapRengi;

    public Tornavida(String tip, double uzunluk, String malzeme, boolean izolasyonluMu, String sapRengi) {
        this.tip = tip;
        this.uzunluk = uzunluk;
        this.malzeme = malzeme;
        this.izolasyonluMu = izolasyonluMu;
        this.sapRengi = sapRengi;
    }

    public void Sık() {
        System.out.println(tip + " tornavida ile vida saat yönünde sıkılıyor...");
    }

    public void Gevset() {
        System.out.println(tip + " tornavida ile vida saat yönünün tersine gevşetiliyor...");
    }

    public void IzolasyonuKontrolEt() {
        if (izolasyonluMu) {
            System.out.println("Dikkat: Bu tornavida elektriksel yalıtıma sahiptir. Güvenle kullanılabilir.");
        } else {
            System.out.println("Uyarı: Bu tornavida yalıtımsızdır. Elektrik varken kullanırken dikkatli olun!");
        }
    }

    public void OzellikleriGoster() {
        System.out.println("\n--- Tornavida Özellikleri ---");
        System.out.println("Uç Tipi: " + tip);
        System.out.println("Uzunluk: " + uzunluk + " cm");
        System.out.println("Malzeme: " + malzeme);
        System.out.println("İzolasyonlu mu?: " + (izolasyonluMu ? "Evet" : "Hayır"));
        System.out.println("Renk: " + sapRengi);
    }
}