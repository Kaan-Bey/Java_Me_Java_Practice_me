package Sorular;

import java.util.Scanner;

public class Soru2_DikdortgeninCevresiAlani {

    public static void main(String[] args) {

         /*
        Soru-2)   SOUT/SYSO
                Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
                * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
                * Dikdortgenin Alani : uzun kenar * kisa kenar
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz :");
        double uzunkenar =scanner.nextDouble();
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz :");
        double kisakenar =scanner.nextDouble();
        double cevresi = (2*(kisakenar+uzunkenar));
        System.out.println("Kenar uzunluklari; " + kisakenar+ " ve "+ uzunkenar+ " olan dikdortgenin cevresi  "+ cevresi+ "'dir.");
        double alani = (kisakenar*uzunkenar);
        System.out.println("Kenar uzunluklari; " + kisakenar+" ve "+ uzunkenar+ " olan dikdortgenin cevresi  "+ alani+ "'dir.");

    }
}
