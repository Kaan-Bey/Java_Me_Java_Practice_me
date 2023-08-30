package Sorular;

import java.util.Scanner;

public class Soru8_rakamlarToplami {

    /*
     Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
            Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
             ipuclari:
             Matematiksel Islemler konusuna bakalim.
             Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.
      */
    Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz :");
    int girilenSayi = scan.nextInt();
    int sayi = girilenSayi;
    int birlerBasamagi = 0;
    int rakamSayisi = (girilenSayi + ("")).length();
    int toplam = 0;
        for (int i = 1; i <= rakamSayisi; i++) {
        birlerBasamagi = sayi % 10;
        toplam +=  birlerBasamagi;
        sayi = sayi / 10;
    }
        System.out.println("Girdiginiz uc basamakli " + girilenSayi + " sayisinin rakamlari toplami : " + toplam + " 'dir.");
}
