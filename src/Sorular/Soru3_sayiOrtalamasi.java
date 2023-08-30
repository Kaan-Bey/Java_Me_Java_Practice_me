package Sorular;

import java.util.Scanner;

public class Soru3_sayiOrtalamasi {

    /*
    Soru 3-)   SCANNER
            Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
     */
    Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ortalamasini hesaplayacaginiz pozitif 5 tam sayi giriniz :");
    int sayi1 =scanner.nextInt();
    int sayi2 =scanner.nextInt();
    int sayi3 =scanner.nextInt();
    int sayi4 =scanner.nextInt();
    int sayi5 =scanner.nextInt();
    int ort  = ((sayi1+sayi2+sayi3+sayi4+sayi5)/5);
        System.out.println("Girdiginiz pozitif 5 sayinin ortalamasi " + ort + " dir.");



}
