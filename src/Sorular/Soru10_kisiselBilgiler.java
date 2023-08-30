package Sorular;

import java.util.Scanner;

public class Soru10_kisiselBilgiler {

    public static void main(String[] args) {


        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                    Ipucu: IF ile çözebilirsiniz.
                    Giriş :
                             > Gandalf Grey 563245879632
                    Çıktı :
                             > İsim : G****** G***
                             > CCN : **** **** 9632
                    -----------------------------------------------------------------------------------------------------------------------------------
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi, soyadinizi ve kart bilgilerinizi giriniz : \n" + "Adınız: ");
        String isim = scanner.nextLine();
        System.out.println("Soyadiniz : ");
        String soyIsim = scanner.nextLine();
        System.out.println("Kredi Kartı No :");
        String kartno = scanner.next();
        System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " +
                soyIsim.toUpperCase().substring(0, 1).toUpperCase() + soyIsim.substring(1).toLowerCase());
        if (kartno.length() == 16) {
            System.out.println("KKN : " + kartno.substring(0, 4) + (" ") + kartno.substring(4, 8) + (" ") +
                    kartno.substring(8, 12) + (" ") + kartno.substring(12, 16));
        } else {
            System.out.println("Geçersiz kredi kartı numarası");
        }
    }

}
