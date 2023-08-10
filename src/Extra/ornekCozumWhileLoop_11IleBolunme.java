package Extra;

import java.util.Scanner;

public class ornekCozumWhileLoop_11IleBolunme {

    public static void main(String[] args) {

        /*

        Soru l
        kullanicidan alinan uc basamakli sayinin 11 ile bolunebilen pozitif tamsayilar oldugunu yazdiralim.

         */


        Scanner scanner;

        int sayi=123;



        while (sayi >=100  && sayi<1000){

            scanner=new Scanner(System.in);
            System.out.println("Lutfen uc basamakli bir sayi giriniz :");
            sayi= scanner.nextInt();
            if ( sayi>=1000  || sayi<100){
                System.out.println("Girdiginiz sayi uc basamakli degil.\n Lutfen uc basamakli bir sayi giriniz.");
            }else {
                if (sayi%11==0){
                    System.out.println("11 ile tam bolunebilinen sayi: " + sayi);
                }else {
                    System.out.println("Girdiginiz sayi 11 ile bolunemez.");
                }
            }sayi++;
        }
    }
}
