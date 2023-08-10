package day03;

import java.util.Scanner;

public class P03_IfStatements {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

      // System.out.println("Bugun gunlerden hangi gun :");
      // String gunAdi = scan.next().toLowerCase();
      // if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
      //     System.out.println("Bu gun Hafta Sonu");
      // }
      // if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") ||
      //         gunAdi.equals("persembe") || gunAdi.equals("cuma")) {
      //     System.out.println("Bu gun Hafta ici");
      //     if (!(gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") ||
      //             gunAdi.equals("persembe") || gunAdi.equals("cuma") || (gunAdi.equals("cumartesi") ||
      //             gunAdi.equals("pazar")) {
      //         System.out.println("Yanlis giris yaptiniz -" + gunAdi + "- bir gun ismi degildir");
        //    }

              /*
   2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
    Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
    50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
    Ad:
    Soyad:
    1.Vize:
    2. Vize:
    Final :
    Yıl Sonu Notu:
    Ders Durumu :
     */


        System.out.println("Lutfen adinizi giriniz: ");
        String name= scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz: ");
        String surname= scan.nextLine();
        System.out.println("Lutfen vize ve final notlarinizi sirasiyle giriniz: ");
        System.out.println("1.vize:");
        double vize1= scan.nextDouble();
        System.out.println("2.vize:");
        double vize2= scan.nextDouble();
        System.out.println("Final Notu:");
        double finalNotu= scan.nextDouble();
        double yilSonuNotu=(((vize1+vize2)/2)*40/100)+(finalNotu*60/100);
        System.out.println("Adiniz:"+name);
        System.out.println("Soyadiniz:"+surname);
        System.out.println("1.vize notu:"+vize1);
        System.out.println("2.vize notu:"+vize2);
        System.out.println("final notu:"+finalNotu);
        System.out.println("Yil Sonu notu:"+yilSonuNotu);
        if (yilSonuNotu>=50)
            System.out.println("Ders Durumu: Gectiniz tebrikler.");
        if (yilSonuNotu<50)
            System.out.println("Ders Durumu: Maalersef kaldiniz.");


        }
    }

