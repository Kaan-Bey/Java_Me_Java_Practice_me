package Sorular;

public class Soru5_kareninCevresiAlani {

    /*
       Soru 5-)   SCANNER
           Kullanıcıdan karenin kenar uzunluğunu alın.
           Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
       */
    Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen karenin kenarini giriniz :");
    double kenar =scanner.nextDouble();
    double cevresi = (4*kenar);
        System.out.println("Kenar uzunluklari; " + kenar+ " ve "+ kenar+ " olan karenin cevresi  "+ cevresi+ "'dir.");
    double alani = (kenar*kenar);
        System.out.println("Kenar uzunluklari; " + kenar+" ve "+ kenar+ " olan karenin cevresi  "+ alani+ "'dir.");
}
