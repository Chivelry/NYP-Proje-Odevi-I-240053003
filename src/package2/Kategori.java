package package2;

public class Kategori {
    private int kategoriId;
    private String ad;
    // Constructor
    public Kategori(int kategoriId, String ad) {
        this.kategoriId = kategoriId;
        this.ad = ad;
    }
    // Getter metotları
    public int getKategoriId() {
        return kategoriId;
    }
    public String getAd() {
        return ad;
    }
}