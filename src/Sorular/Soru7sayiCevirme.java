package Sorular;

import java.util.Scanner;

public class Soru7sayiCevirme {

    public static void main(String[] args) {

         /*
        Soru 7-)  Kullanicidan Double türünde bir sayi alin.
                    Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
                    (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
                    ipuclari:
                    ( Data Casting -> Auto Widening ve Explicit Narrowing )
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen double bir sayi giriniz :");
        double sayiDouble = scan.nextDouble();
        int sayiTam = (int) sayiDouble;
        System.out.println("Girdiginiz double sayi olan "+sayiDouble+ " 'nin, tam sayi karsiligi : " +sayiTam);
        System.out.println("Lutfen float bir sayi giriniz :");
        float sayiFloat = scan.nextFloat();
        short sayiShort = (short) sayiFloat;
        System.out.println("Girdiginiz float sayi olan "+sayiFloat+ "f'nin,  short sayi karsiligi : " +sayiShort);
    }
}
