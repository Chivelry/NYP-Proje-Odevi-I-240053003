package package2;

public class Urun {
    private int urunId;
    private String ad;
    private String aciklama;
    private double fiyat;
    private int stokAdedi;
    private Kategori kategori; // Bir Kategori nesnesi

    // Constructor
    public Urun(int urunId, String ad, String aciklama, double fiyat, int stokAdedi, Kategori kategori) {
        this.urunId = urunId;
        this.ad = ad;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
        this.stokAdedi = stokAdedi;
        this.kategori = kategori;
    }

    // Metotlar
    public void stokGuncelle(int miktar) {
        stokAdedi += miktar;
        System.out.println(ad + " için yeni stok: " + stokAdedi);
    }

    public void fiyatGuncelle(double yeniFiyat) {
        if (yeniFiyat > 0) {
            this.fiyat = yeniFiyat;
            System.out.println(ad + " için yeni fiyat: " + fiyat + " TL");
        } else {
            System.out.println("Geçersiz fiyat değeri.");
        }
    }

    public void bilgileriGoster() {
        System.out.println("--- Ürün Bilgileri ---");
        System.out.println("ID: " + urunId);
        System.out.println("Ad: " + ad);
        System.out.println("Açıklama: " + aciklama);
        System.out.println("Fiyat: " + fiyat + " TL");
        System.out.println("Stok: " + stokAdedi + " adet");
        System.out.println("Kategori: " + kategori.getAd());
    }

    // Getter metotları
    public String getAd() {
        return ad;
    }
    public double getFiyat() {
        return fiyat;
    }
    public int getStokAdedi() {
        return stokAdedi;
    }
    public int getUrunId() {
        return urunId;
    }
}