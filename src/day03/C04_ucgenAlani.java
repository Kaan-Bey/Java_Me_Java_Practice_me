package day03;

import java.util.Scanner;

public class C04_ucgenAlani {


    public static void main(String[] args) {

        /*
2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
üçgenin alanını hesaplayıp yazdırın


         */

      //Scanner scanner=new Scanner(System.in);
      //System.out.println("Lutfen alni hesaplanacak ucgenin ayrit degerlerini giriniz :");
      //System.out.println("Ucgenin bir kenarinin uzunlugunu giriniz:");
      //double kenar =scanner.nextDouble();
      //System.out.println("o kenara ait yuksekligi giriniz:");
      //double yukseklik =scanner.nextDouble();
      //System.out.println("=============Bilgileri grilen Ucgenin Alani Hesabi  Sonucu ==========");

       // System.out.println("Ucgenin QAlani :" + ((kenar*yukseklik)/2));

        /*
2- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
sonucu tam sayı yazdırın
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki adet ondalikli sayi giriniz:");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        int sonuc = (int)(sayi1/sayi2);
        System.out.println("sonuc = " + sonuc);

    }

}
