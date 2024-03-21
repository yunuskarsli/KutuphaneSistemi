import java.util.Scanner;

public class KütüphaneGorevlisi {
    public static void kitapEkle() {
        Scanner scanner = new Scanner(System.in);
        Kitap kitap = new Kitap();
        System.out.println("Hangi kitabı eklemek istiyorsunuz");
        String kitapName = scanner.nextLine();
        kitap.kitapList().add(kitapName);
    }


    public static void kitapSil() {
        Scanner scanner = new Scanner(System.in);
        Kitap kitap = new Kitap();
        System.out.println("Hangi kitabı silmek istiyorsunuz");
        String kitapName = scanner.nextLine();
        if (kitap.kitapList().contains(kitapName)) {

            kitap.kitapList().remove(kitapName);
            System.out.println("kitap silindi");

        } else System.out.println("kitap yok ki silinsin");

    }
}
