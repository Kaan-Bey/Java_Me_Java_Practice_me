import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class genel {
    public static void main(String[] args) {


        /*


        List<String> list = new ArrayList<>();
        list.add("Ali");
        // liste eklenen elemanlar en sona eklenir.
        // eğer listin uzunlugu yazdirilacaksa, toString ile yazdirilir. list.lengt OLMAZ. size OLUR.

        ArrayList<String> list2 = new ArrayList<String>();

        ArrayList<Integer> list3 = new ArrayList<Integer>();

    }

   // * toString metodu;



}

  /*
       * instance variable
       * Obje deklarasyonu
       * objeler main clasın içinde oluşturulur.
       * cons. içinde obje oluşturulmaz
       * aynı isimde ve parametrede hem metod hemde cons varsa, önüne new yazınca cons. calisir
       * aynı isimde ve parametrede hem metod hemde cons varsa, java önceligi metoda verir.
       * java'da bir constructor'in icinde baska bir constructor'i cagirmamiz gerekebilir
        bu durumda
        C01_ConstructorCall(4);  yazarsak,
        Java bunu cons. call olarak degil, method call olarak kabul eder

        Eger bir constructor'in icinden baska bir constructor cagirmamiz gerekirse
        ClassIsmi(ilgiliArgumentler) yerine this(ilgiliArgumentler) kullanilir
        * this() ilk satırda olması lazım.
        * kuralın sebebi olmaz.
        * bir cons. icinde, birden fazl cons. kullanamayiz, cunku biri ilk satirda olamayacaktır.
        * Metodlar kucuk harfle, cons.lar buyuk harfle baslar.
        * static metodun icinde statik olmayan bir variable kullanılamaz.
        * static main metodun icinde, static olmayan metod cagrlamaz.
        * Bir method’u static yapmak icin return
        * type’dan once static keyword yazilmalidir.

        *- Bir static method’dan static olmayan
        variable kullanamazsiniz.

        * Bir static method static olan veya olmayan
        tum method’lardan cagrilabilir.

        * Static olarak etiketlenen method’a baska
        class’dan ulasmak icin classIsmi.methodIsmi
        yazmaniz yeterli olacaktir.



   */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        List<Integer> elemanlarSilindi = new ArrayList<>();
        for (Integer sayi : sayilar) {
            if (sayi <= 10) {
                elemanlarSilindi.add(sayi);
            }
        }
        sayilar.clear();
        sayilar.addAll(elemanlarSilindi);
        System.out.println("Yeni Liste: " + sayilar);


    }
}