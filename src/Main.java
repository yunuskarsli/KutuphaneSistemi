import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Okuyucu okuyucu = new Okuyucu();
        Kitap kitap = new Kitap();
        while (true) {
            System.out.println("ARVEN KÜTÜPHANESİNE HOŞGELDİNİZ\n" +
                    "Giriş için Kimlik Seçiniz\n" +
                    "1-Okuyucu \n" +
                    "2-Kütüphane Yeykilisi\n");
            int secim = scanner.nextInt();
            if (secim == 1) {
                System.out.println("okuyucu alanına hoşgeldiniz");
                System.out.println("ne yapmak istiyorsunuz");
                System.out.println("1-Kitap arayabilir, ödünç alabilir ve iade edebilir.\n" +
                        "2-İstediği kitapları favorilere ekleyebilir\n" +
                        "3-Kitaplar hakkında yorum yapabilir ve puan verebilir.");
                int okuyucuSecim = scanner.nextInt();
                switch (okuyucuSecim) {
                    case 1:
                        okuyucu.kitapIslemleri();
                        break;
                    case 2:
                        okuyucu.favoriEkleme();
                        break;
                    case 3:
                        Kitap.yorumYap();
                        break;
                }
            }
            if (secim == 2) {
                System.out.println("Yetkili kişi olarak ne yapmak istersiniz");
                System.out.println("ne yapmak istersiniz\n" +
                        "1-Kullanıcı bilgilerini göster.\n" +
                        "2-Hangi kitapların olduğunu göster\n" +
                        "3-Kitaplar hakkında yorum yapabilir ve puan verebilir.\n" +
                        "4-Kitap ekleme.\n" +
                        "5-Kitap silme\n");
                int yetkiliSecim = scanner.nextInt();
                switch (yetkiliSecim) {
                    case 1:
                        okuyucu.kullaniciBilgileri();
                        break;
                    case 2:
                        kitap.kitapList();
                        break;
                    case 3:
                        Kitap.yorumYap();
                        break;
                    case 4:
                        KütüphaneGorevlisi.kitapEkle();
                        break;
                    case 5:
                        KütüphaneGorevlisi.kitapSil();
                    default:
                }
            }
        }
    }
}