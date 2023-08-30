package Sorular;

import java.util.Scanner;

public class Soru9_saniyeyeCevirme {

    public static void main(String[] args) {

         /*
        Soru 9-)  Girilen zamanı saniyeye çeviriniz.
               Örnek: 2 saat 3 dakika 10 saniye ==>  7390 saniye
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen saniyeye cevrilecek zamani saat, dakika ve saniye olarak giriniz. ");
        System.out.println("Lutfen saati giriniz : ");
        int saat = scanner.nextInt();
        System.out.println("Lutfen dakikayi giriniz : ");
        int dakika = scanner.nextInt();
        System.out.println("Lutfen saniyeyi giriniz : ");
        int saniye = scanner.nextInt();
        System.out.println("Girdiginiz zaman bilgisinin saniye olarak karsiligi : " + ((saat*3600)+(dakika*60)+saniye)+ " dir.");
    }
}
