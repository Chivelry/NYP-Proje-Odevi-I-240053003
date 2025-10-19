package package1;
public class Top {
    String tip;
    double cap; // cm
    double agirlik; // gram
    double basinc; // bar
    boolean sisikMi;

    public Top(String tip, double cap, double agirlik, double basinc) {
        this.tip = tip;
        this.cap = cap;
        this.agirlik = agirlik;
        this.basinc = basinc;
        this.sisikMi = basinc > 0.5;
    }

    public void Yuvarlan() {
        if (sisikMi) {
            System.out.println(tip + " topu yuvarlanıyor...");
        } else {
            System.out.println("Top yeterince şişik değil, sekerek/sürünerek ilerliyor.");
        }
    }

    public void Sicra(double kuvvet) {
        if (sisikMi) {
            double sicramaYuksekligi = kuvvet * basinc * 0.5; // Basit bir simülasyon
            System.out.println(tip + " topu" + kuvvet + " kuvvetiyle vuruşta " + sicramaYuksekligi + " birim sıçradı.");
        } else {
            System.out.println(tip + " topu sönük olduğu için çok az sıçradı.");
        }
    }

    public void Sisir(double artanBasinc) {
        this.basinc += artanBasinc;
        this.sisikMi = this.basinc > 0.5;
        System.out.println(tip + " topu şişirildi. Yeni basınç: " + basinc + " bar.");
    }

    public void OzellikleriGoster() {
        System.out.println("\n--- " + tip + " Topu Özellikleri ---");
        System.out.println("Çap: " + cap + " cm");
        System.out.println("Ağırlık: " + agirlik + " gr");
        System.out.println("Basınç: " + basinc + " bar");
        System.out.println("Şişik Durumu: " + (sisikMi ? "Evet" : "Hayır"));
    }
}