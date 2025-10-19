import package1.*;
import package2.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secenek = 0;
        int paketSecenek = 1;

        while(secenek != 7) {
            if(paketSecenek == 1) {
                System.out.println("------------------------------------");
                System.out.println("---------- Paket1 Seçenek Ekranı ----------");
                System.out.println("1. Yeni Beyaz Eşya Objesi");
                System.out.println("2. Yeni Hayvan Objesi");
                System.out.println("3. Yeni Lamba Objesi");
                System.out.println("4. Yeni Top Objesi");
                System.out.println("5. Yeni Tornavida Objesi");
                System.out.println("6. Paket2 Seçenek Ekranına Geçiş");
                System.out.println("7. Çıkış");
                System.out.println("------------------------------------");

                secenek = scanner.nextInt();
                switch (secenek) {
                    case 1:
                        BeyazEsyaSecenek();
                        break;
                    case 2:
                        HayvanSecenek();
                        break;
                    case 3:
                        LambaSecenek();
                        break;
                    case 4:
                        TopSecenek();
                        break;
                    case 5:
                        TornavidaSecenek();
                        break;
                    case 6:
                        paketSecenek = 2;
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
                }
            }
            else if (paketSecenek == 2) {
                System.out.println("------------------------------------");
                System.out.println("---------- Paket2 Seçenek Ekranı ----------");
                System.out.println("7. Çıkış");
                System.out.println("------------------------------------");

                secenek = scanner.nextInt();

                switch (secenek) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
                }
            }
        }
    }
    public static void BeyazEsyaSecenek() {
        Scanner scanner = new Scanner(System.in);
        boolean beyazEsya = false;
        BeyazEsya yeniBeyazEsya = null;
        int secenek = 0;
        while(secenek != 5) {
            System.out.println("------------------------------------");
            System.out.println("------ Beyaz Esya Seçenekleri ------");
            System.out.println("1. Beyaz Eşya Oluştur");
            System.out.println("2. Oluşturulan Beyaz Eşya Bilgilerini Göster");
            System.out.println("3. Oluşturulan Beyaz Eşyayı Aç");
            System.out.println("4. Oluşturulan Beyaz Eşyayı Kapa");
            System.out.println("5. Geri Dön (Geri Dönmek Beyaz Eşyayı Siler)");
            System.out.println("------------------------------------");

            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    // 1. Kullanıcıdan verileri oku
                    System.out.print("Markayı girin: ");

                    scanner.nextLine();
                    
                    String be_marka = scanner.nextLine();

                    System.out.print("Modeli girin: ");
                    String be_model = scanner.nextLine();

                    System.out.print("Enerji Sınıfını girin (Örn: A++): ");
                    String be_sinif = scanner.nextLine();

                    System.out.print("Fiyatı girin: ");

                    double be_fiyat = scanner.nextDouble();

                    System.out.print("Garanti Süresini (yıl) girin: ");
                    int be_garanti = scanner.nextInt();

                    // Scanner nextInt veya nextDouble'dan sonra yeni satırı okumaz.
                    // nextLine() çağırarak bu sorunu çözüyoruz.
                    scanner.nextLine();

                    // 2. Constructor kullanarak objeyi oluştur
                    yeniBeyazEsya = new BeyazEsya(be_marka, be_model, be_sinif, be_fiyat, be_garanti);

                    System.out.println("\nBeyaz eşyanız oluşturuldu.");
                    beyazEsya = true;
                    break;
                case 2:
                    if(beyazEsya) {
                        yeniBeyazEsya.BilgileriGoster();
                    }
                    else {
                        System.out.println("Önce beyaz eşya oluşturmanız gerekmektedir.");
                    }
                    break;
                case 3:
                    if(beyazEsya) {
                        yeniBeyazEsya.CihazAc();
                    }
                    else {
                        System.out.println("Önce beyaz eşya oluşturmanız gerekmektedir.");
                    }
                    break;
                case 4:
                    if(beyazEsya) {
                        yeniBeyazEsya.CihazKapa();
                    }
                    else {
                        System.out.println("Önce beyaz eşya oluşturmanız gerekmektedir.");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
            }
        }
    }
    public static void HayvanSecenek() {
        Scanner scanner = new Scanner(System.in);
        boolean hayvan = false;
        Hayvan yeniHayvan = null;
        int secenek = 0;
        while(secenek != 6) {
            System.out.println("------------------------------------");
            System.out.println("------ Hayvan Seçenekleri ------");
            System.out.println("1. Hayvan Oluştur");
            System.out.println("2. Oluşturulan Hayvanın Özelliklerini Göster");
            System.out.println("3. Oluşturulan Hayvana Yemek Yedir");
            System.out.println("4. Oluşturulan Hayvana Ses Çıkarttır");
            System.out.println("5. Oluşturulan Hayvanı Uyandır Veya Uyut");
            System.out.println("6. Geri Dön (Geri Dönmek Hayvanı Siler)");
            System.out.println("------------------------------------");

            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    // 1. Kullanıcıdan verileri oku
                    System.out.print("Türü girin: ");

                    scanner.nextLine();

                    String h_tur = scanner.nextLine();

                    System.out.print("Adını girin: ");
                    String h_ad = scanner.nextLine();

                    System.out.print("Yaşını: ");
                    int h_yas = scanner.nextInt();

                    System.out.print("Ağırlığını (kg) girin: ");
                    double h_agirlik = scanner.nextDouble();

                    // Scanner nextInt veya nextDouble'dan sonra yeni satırı okumaz.
                    // nextLine() çağırarak bu sorunu çözüyoruz.
                    scanner.nextLine();
                    // 2. Constructor kullanarak objeyi oluştur
                    yeniHayvan = new Hayvan(h_tur, h_ad, h_yas, h_agirlik);

                    System.out.println("\nHayvan oluşturuldu.");
                    hayvan = true;
                    break;
                case 2:
                    if(hayvan) {
                        yeniHayvan.OzellikleriGoster();
                    }
                    else {
                        System.out.println("Önce hayvan oluşturmanız gerekmektedir.");
                    }
                    break;
                case 3:
                    if(hayvan) {
                        Scanner yemekScanner = new Scanner(System.in);
                        String yemek = yemekScanner.nextLine();
                        yeniHayvan.YemekYe(yemek);
                    }
                    else {
                        System.out.println("Önce hayvan oluşturmanız gerekmektedir.");
                    }
                    break;
                case 4:
                    if(hayvan) {
                        yeniHayvan.SesCikar();
                    }
                    else {
                        System.out.println("Önce hayvan oluşturmanız gerekmektedir.");
                    }
                    break;
                case 5:
                    if(hayvan) {
                        yeniHayvan.UyuVeyaUyan();
                    }
                    else {
                        System.out.println("Önce hayvan oluşturmanız gerekmektedir.");
                    }
                    break;
                case 6:
                    continue;
                default:
                    System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
            }
        }
    }
    public static void LambaSecenek() {
        Scanner scanner = new Scanner(System.in);
        boolean lamba = false;
        Lamba yeniLamba = null;
        int secenek = 0;
        while(secenek != 6) {
            System.out.println("------------------------------------");
            System.out.println("------ Lamba Seçenekleri ------");
            System.out.println("1. Lamba Oluştur");
            System.out.println("2. Oluşturulan Lambanın Durumunu Göster");
            System.out.println("3. Oluşturulan Lambayı Aç");
            System.out.println("4. Oluşturulan Lambayı Kapa");
            System.out.println("5. Oluşturulan Lambanın Parlaklık Seviyesini Belirle");
            System.out.println("6. Geri Dön (Geri Dönmek Lambayı Siler)");
            System.out.println("------------------------------------");

            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    // 1. Kullanıcıdan verileri oku
                    System.out.print("Gücü girin: ");

                    scanner.nextLine();

                    int l_guc = scanner.nextInt();

                    System.out.print("Renk sıcaklığını girin: ");
                    int l_renkSicakligi = scanner.nextInt();

                    // Scanner nextInt veya nextDouble'dan sonra yeni satırı okumaz.
                    // nextLine() çağırarak bu sorunu çözüyoruz.
                    scanner.nextLine();

                    // 2. Constructor kullanarak objeyi oluştur
                    yeniLamba = new Lamba(l_guc, l_renkSicakligi);

                    System.out.println("\nLambanız oluşturuldu.");
                    lamba = true;
                    break;
                case 2:
                    if(lamba) {
                        yeniLamba.DurumuYazdir();
                    }
                    else {
                        System.out.println("Önce lamba oluşturmanız gerekmektedir.");
                    }
                    break;
                case 3:
                    if(lamba) {
                        yeniLamba.Ac();
                    }
                    else {
                        System.out.println("Önce lamba oluşturmanız gerekmektedir.");
                    }
                    break;
                case 4:
                    if(lamba) {
                        yeniLamba.Kapat();
                    }
                    else {
                        System.out.println("Önce lamba oluşturmanız gerekmektedir.");
                    }
                    break;
                case 5:
                    if(lamba) {
                        Scanner seviyeScanner = new Scanner(System.in);
                        System.out.print("Parlaklık seviyesi belirleyin (1-100): ");
                        int seviye = scanner.nextInt();
                        yeniLamba.ParlaklikAyarla(seviye);
                    }
                    else {
                        System.out.println("Önce lamba oluşturmanız gerekmektedir.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
            }
        }
    }
    public static void TopSecenek() {
        Scanner scanner = new Scanner(System.in);
        boolean top = false;
        Top yeniTop = null;
        int secenek = 0;
        while(secenek != 6) {
            System.out.println("------------------------------------");
            System.out.println("------ Top Seçenekleri ------");
            System.out.println("1. Top Oluştur");
            System.out.println("2. Oluşturulan Topun Özelliklerini Göster");
            System.out.println("3. Oluşturulan Topu Yuvarla");
            System.out.println("4. Oluşturulan Topu Şişir");
            System.out.println("5. Oluşturulan Topun Sektir");
            System.out.println("6. Geri Dön (Geri Dönmek Topu Siler)");
            System.out.println("------------------------------------");

            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    // 1. Kullanıcıdan verileri oku
                    System.out.print("Tipini girin: ");

                    scanner.nextLine();

                    String t_tip = scanner.nextLine();

                    System.out.print("Çapını girin: ");
                    double t_cap = scanner.nextDouble();

                    System.out.print("Ağırlığını girin: ");
                    double t_agirlik = scanner.nextDouble();

                    System.out.print("Basıncını girin: ");
                    double t_basinc = scanner.nextDouble();

                    // Scanner nextInt veya nextDouble'dan sonra yeni satırı okumaz.
                    // nextLine() çağırarak bu sorunu çözüyoruz.
                    scanner.nextLine();

                    // 2. Constructor kullanarak objeyi oluştur
                    yeniTop = new Top(t_tip,t_cap,t_agirlik,t_basinc);

                    System.out.println("\nTopunuz oluşturuldu.");
                    top = true;
                    break;
                case 2:
                    if(top) {
                        yeniTop.OzellikleriGoster();
                    }
                    else {
                        System.out.println("Önce top oluşturmanız gerekmektedir.");
                    }
                    break;
                case 3:
                    if(top) {
                        yeniTop.Yuvarlan();
                    }
                    else {
                        System.out.println("Önce top oluşturmanız gerekmektedir.");
                    }
                    break;
                case 4:
                    if(top) {
                        Scanner basicScanner = new Scanner(System.in);
                        System.out.print("Şişirmek için basınç belirle: ");
                        int basincMiktar = scanner.nextInt();
                        yeniTop.Sisir(basincMiktar);
                    }
                    else {
                        System.out.println("Önce top oluşturmanız gerekmektedir.");
                    }
                    break;
                case 5:
                    if(top) {
                        Scanner kuvvetScanner = new Scanner(System.in);
                        System.out.print("Sektirmek için kuvvet belirle: ");
                        int kuvvet = kuvvetScanner.nextInt();
                        yeniTop.Sicra(kuvvet);
                    }
                    else {
                        System.out.println("Önce top oluşturmanız gerekmektedir.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
            }
        }
    }
    public static void TornavidaSecenek() {
        Scanner scanner = new Scanner(System.in);
        boolean tornavida = false;
        Tornavida yeniTornavida = null;
        int secenek = 0;
        while(secenek != 6) {
            System.out.println("------------------------------------");
            System.out.println("------ Tornavida Seçenekleri ------");
            System.out.println("1. Tornavida Oluştur");
            System.out.println("2. Oluşturulan Tornavidanın Özelliklerini Göster");
            System.out.println("3. Oluşturulan Tornavidayı Sık");
            System.out.println("4. Oluşturulan Tornavidayı Gevşet");
            System.out.println("5. Oluşturulan Tornavidanın İzolasyonunu Kontrol Et");
            System.out.println("6. Geri Dön (Geri Dönmek Tornavidayı Siler)");
            System.out.println("------------------------------------");

            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    // 1. Kullanıcıdan verileri oku
                    System.out.print("Tipini girin: ");

                    scanner.nextLine();

                    String tv_tip = scanner.nextLine();

                    System.out.print("Malzeme girin: ");

                    scanner.nextLine();

                    String tv_malzeme = scanner.nextLine();

                    System.out.print("Sap rengi girin: ");

                    scanner.nextLine();

                    String tv_sapRengi = scanner.nextLine();

                    System.out.print("Uzunluk girin: ");
                    double tv_uzunluk = scanner.nextDouble();

                    System.out.print("İzolasyonlu mu? (true/false): ");
                    boolean tv_izolasyon = scanner.nextBoolean();

                    // Scanner nextInt veya nextDouble'dan sonra yeni satırı okumaz.
                    // nextLine() çağırarak bu sorunu çözüyoruz.
                    scanner.nextLine();

                    // 2. Constructor kullanarak objeyi oluştur
                    yeniTornavida = new Tornavida(tv_tip,tv_uzunluk,tv_malzeme,tv_izolasyon,tv_sapRengi);

                    System.out.println("\nTornavidanız oluşturuldu.");
                    tornavida = true;
                    break;
                case 2:
                    if(tornavida) {
                        yeniTornavida.OzellikleriGoster();
                    }
                    else {
                        System.out.println("Önce tornavida oluşturmanız gerekmektedir.");
                    }
                    break;
                case 3:
                    if(tornavida) {
                        yeniTornavida.Sık();
                    }
                    else {
                        System.out.println("Önce tornavida oluşturmanız gerekmektedir.");
                    }
                    break;
                case 4:
                    if(tornavida) {
                        yeniTornavida.Gevset();
                    }
                    else {
                        System.out.println("Önce tornavida oluşturmanız gerekmektedir.");
                    }
                    break;
                case 5:
                    if(tornavida) {
                        yeniTornavida.IzolasyonuKontrolEt();
                    }
                    else {
                        System.out.println("Önce tornavida oluşturmanız gerekmektedir.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
            }
        }
    }
}