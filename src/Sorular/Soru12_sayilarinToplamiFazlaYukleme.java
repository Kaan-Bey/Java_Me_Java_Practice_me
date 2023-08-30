package Sorular;

import java.util.Scanner;

public class Soru12_sayilarinToplamiFazlaYukleme {

    public static void main(String[] args) {

         /*
        Soru 12-)
            Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
            hesaplamak ve yazdırmak için bir program oluşturalım
            Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa,
            "Fazla Yüklenme" yazdıralım
            Ipucu:  IF/Else kullanabilirsiniz.
            Örnek:
            İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
            Konsolda Çıktı :
            Sayıların toplamı: 71  veya  Fazla Yüklenme
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifirdan  buyuk iki tam sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int toplam= sayi1+sayi2;
        String strsayi1 = ""+sayi1;
        String strsayi2 = ""+sayi2;
        String strtoplam = ""+toplam;
        if (sayi1>=0 && sayi2>=0){
            if (strsayi1.length()>=10 || strsayi2.length()>=10 || strtoplam.length()>=10){
                System.out.println("Fazla Yüklenme : " + toplam);
            } else {
                System.out.println("iki sayinin toplami : " + toplam);
            }
        }else{
            System.out.println(" Girdiginiz sayilar sifira esit veya buyuk olmali");
        }
    }
}
