package Sorular;

import java.util.Scanner;

public class Soru4_sayininKupununYarisi {

    public static void main(String[] args) {

        /*

        Soru 4-)   SCANNER
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen küpünün yarısini hesaplayacaginiz pozitif tam sayiyi giriniz :");
        int sayi =scanner.nextInt();
        int kupununYarisi  = ((sayi*sayi*sayi)/2);
        System.out.println("Girdiginiz pozitif tam sayi olan "+ sayi+ " 'nin küpünün yarısi " + kupununYarisi + " dir.");
    }
}
