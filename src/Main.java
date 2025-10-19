import package1.*;

import java.util.InputMismatchException;
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
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        paketSecenek = 2;
                        break;
                    case 7:
                        continue;
                    default:
                        System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
                }
            }
            else if (paketSecenek ==2) {
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
                    continue;
                default:
                    System.out.println("Üzgünüm! Girdiğiniz değer seçeneklerle uyuşmamaktadır.");
            }
        }

        scanner.close(); // Scanner nesnesini kapatmayı unutmayın
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
            System.out.println("3. Oluşturulan Hayvana Yemek (Elma) Yedir");
            System.out.println("4. Oluşturulan Hayvana Ses Çıkarttır");
            System.out.println("5. Oluşturulan Hayvanı Uyandır Veya Uyut");
            System.out.println("6. Geri Dön (Geri Dönmek Hayvanı Siler)");
            System.out.println("------------------------------------");

            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    // 1. Kullanıcıdan verileri oku
                    System.out.print("Türü girin: ");
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
                        String elma = "Elma";
                        yeniHayvan.YemekYe(elma);
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
        scanner.close(); // Scanner nesnesini kapatmayı unutmayın
    }
}