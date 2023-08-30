package Sorular;

import java.util.Scanner;

public class Soru1_DaireninCevresiAlani {
    public static void main(String[] args) {

         /*
        Soru 1-)   SOUT/SYSO
                Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
                Ipuclari:
                * r=7;
                * Pi=3.14
                * Dairenin Cevresi : 2*Pi*r
                * Dairenin Alani : Pi*r*r
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dairenin yaricapini giriniz :");
        double yaricap =scanner.nextDouble();
        double pi = 3.14;
        double cevresi = (2*pi*yaricap);
        System.out.println("Yaricapı " + yaricap+ " olan dairenin cevresi  "+ cevresi+ "'dir.");
        double alani = (pi*yaricap*yaricap);
        System.out.println("Yaricapı " + yaricap+ " olan dairenin alani  "+ alani+ "'dir.");


    }
}
