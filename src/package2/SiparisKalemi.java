package package2;

public class SiparisKalemi {
    private Urun urun; // Bir Urun nesnesi
    private int adet;
    private double birimFiyatOAnki; // Sipariş anındaki ürün fiyatı

    // Constructor
    public SiparisKalemi(Urun urun, int adet) {
        this.urun = urun;
        this.adet = adet;
        this.birimFiyatOAnki = urun.getFiyat(); // Sipariş anındaki fiyatı kaydet
    }

    // Metot
    public double kalemToplamTutariHesapla() {
        return adet * birimFiyatOAnki;
    }

    // Getter metotları
    public Urun getUrun() {
        return urun;
    }

    public int getAdet() {
        return adet;
    }

    public double getBirimFiyatOAnki() {
        return birimFiyatOAnki;
    }
}