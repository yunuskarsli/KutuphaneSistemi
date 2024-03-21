import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitap extends Okuyucu {
    private static List<Okuyucu> yorumListesi = new ArrayList<>();


    public static void favoriList(){
        ArrayList<String> favori=new ArrayList<>();
    }
    public static void yorumList(){
        for (Okuyucu yorumList :yorumListesi ){
            System.out.println(yorumList);
        }
    }

    public static void yorumYap(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> yorumlar=new ArrayList<>();
        System.out.println("Kitap seçiniz");
        String kitapsec=scanner.nextLine();
        System.out.println("yorumunuz");
        String yorum=scanner.nextLine();
        yorumlar.add(kitapsec+" :"+yorum);
        int puan=scanner.nextInt();
        yorumlar.add(kitapsec+" : "+ puan);

    }
    public List<String> kitapList(){

        List<String> kitaplar=new ArrayList<>();
        kitaplar.add("Yolda");
        kitaplar.add("Safahat");
        kitaplar.add("Cile");
        kitaplar.add("Seyehatname");
        kitaplar.add("Patagonya");
        kitaplar.add("Arabasevdası");
        kitaplar.add("Sahsultan");
        kitaplar.add("Demir");
        kitaplar.add("Uvercinka");
        return kitaplar;
    }
}
