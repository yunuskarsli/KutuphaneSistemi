import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Okuyucu {
    private static List<Okuyucu> kullaniciListesi = new ArrayList<>();
    private String isim;
    private String soyisim;
    private int tc;
    private int tel;

    public Okuyucu(String isim, String soyisim, int tc, int tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tc = tc;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return isim + " isim " + soyisim + " soyisim " + tc + " tc " + tel + " tel ";
    }

    public Okuyucu() {

    }

    public void kullaniciBilgileri() {
        for (Okuyucu okuyucular : kullaniciListesi) {
            System.out.println(okuyucular);
        }

    }

    public static void okuyucuKaydı() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim = scanner.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim = scanner.nextLine();
        System.out.println("tc giriniz");
        int tc = scanner.nextInt();
        System.out.println("telefon giriniz");
        int tel = scanner.nextInt();
        System.out.println("KAYDINIZ OLUŞTURULMUŞTUR");
        Okuyucu okuyucu = new Okuyucu(isim, soyisim, tc, tel);
        kullaniciListesi.add(okuyucu);
    }


    public static void kitapIslemleri() {
        Kitap kitap = new Kitap();
        List<String> kitaplar = new ArrayList<>();
        kitaplar.add("Yolda");
        kitaplar.add("Safahat");
        kitaplar.add("Cile");
        kitaplar.add("Seyehatname");
        kitaplar.add("Patagonya");
        kitaplar.add("Arabasevdası");
        kitaplar.add("Sahsultan");
        kitaplar.add("Demir");
        kitaplar.add("Uvercinka");
        Scanner scanner = new Scanner(System.in);
        System.out.println("kitap işlemleri\n" +
                "hangi işlemi yapmak istiyorsunuz\n" +
                "1-Kitap arama\n" +
                "2-Ödünç alma\n" +
                "3-Kitap değerlendirme");
        int sec1 = scanner.nextInt();
        scanner.nextLine();

        if (sec1 == 1) {
            System.out.println("aramak istediğiniz kitap");
            String arama = scanner.nextLine();
            if (kitaplar.contains(arama)) {
                System.out.println("kitap bulunuyor");
            } else {
                System.out.println("kitap bulunmuyor ");
            }
        }

        if (sec1 == 2) {
            System.out.println("Kütüphane kaydınız var mı \n" +
                    "1- evet \n" +
                    "2- hayır \n");
            int yanıt = scanner.nextInt();

            switch (yanıt) {
                case 1:
                    System.out.println("Ödünç almak istediğiniz kitabı ismini giriniz");
                    String isim1 = scanner.nextLine();
                    if (kitaplar.contains(isim1)) {
                        System.out.println("kitap bulunuyor alabilirsiniz");
                    } else {
                        System.out.println("Maalesef kitap bulunmuyor");
                    }
                    break;


                case 2:
                    System.out.println("Kullanıcı Kaydı oluşturmalısınız");
                    okuyucuKaydı();
                    System.out.println("Ödünç almak istediğiniz kitabı ismini giriniz");
                    scanner.nextLine();
                    String isim2 = scanner.nextLine();
                    if (kitaplar.contains(isim2)) {
                        System.out.println("kitap bulunuyor alabilirsiniz");
                    } else {
                        System.out.println("Maalesef kitap bulunmuyor");
                    }
                    break;
                default:
            }
        }
        if (sec1 == 3) {
            Kitap.yorumYap();
        }
    }

    public void favoriEkleme() {
        Kitap.favoriList();
    }
}