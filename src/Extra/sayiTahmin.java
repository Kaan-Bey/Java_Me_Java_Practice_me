package Extra;

import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {

    public static void main(String[] args) {

        /*
        Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
        Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
        bilince de tebrik edip durduran bir kod yazalim
 */


        //int sayi= 123;
        Random random = new Random();
        int sayi = random.nextInt(150);
        System.out.println("Aklinda bir sayi tuttum. Hadi bul bakalim");
        Scanner scanner = new Scanner(System.in);
        boolean dogruMu = false;

        while (!dogruMu) {
            int tahmin = scanner.nextInt();
            if (tahmin > sayi) {
                System.out.println("Tahmininiz gerçek sayidan buyuktur.");
            } else if (tahmin < sayi) {
                System.out.println("Tahmininiz gerçek sayidan kucuktur.");
            } else if (tahmin == sayi) {
                System.out.println("Tebrikler, dogru bildiniz.");
                dogruMu = true;

            } else {
                dogruMu = false;

            }
        }
    }
}







