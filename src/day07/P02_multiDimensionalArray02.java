package day07;

import java.util.Scanner;

public class P02_multiDimensionalArray02 {

    // 5x2'lik bir multidimension (her birinin içinde 2'li eleman bulunduran 5 elemanlı array) array oluşturun
    // ve içine çeşitli şehir ve nüfus bilgileri ekleyin.
    // Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.

    public static void main(String[] args) {

        String[][] sehirNufusu = {

                {"Ankara:", "5.000.000"},
                {"Kırıkkale:", "280.000"},
                {"Adana:", "3.000.000"},
                {"Malatya:", "750.000"},
                {"Amsterdam:", "2.000.000"}
        };

        Scanner sehir = new Scanner(System.in);
        System.out.println("Nufusunu öğrenmek istediğiniz şehri yazınız: ");
        String arananSehir = sehir.next();

        boolean kontrol = false;

        for (int i = 0; i < sehirNufusu.length; i++) {
            if (arananSehir.equalsIgnoreCase(sehirNufusu[i][0])) {
                System.out.println(arananSehir + " şehrinin nufusu : " + sehirNufusu[i][1]);
                kontrol = true;
                break;

            }

        }
    //    if (!kontrol) {
      //      System.out.println("\nGirdiğiniz şehirin nufus bilgisi sistemimizde mevcut değildir.");

     //   }

    }
}


