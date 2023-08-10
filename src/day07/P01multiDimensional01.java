package day07;

public class P01multiDimensional01 {

    /*
    Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
 bir program yapmanız gerekmektedir. Her öğrenci için 
 iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için 
 kullanmanız gerekmektedir. öğrencilere ait notları ve yil ortalamasını hesaplayan
  Java programını yazınız:
     */

    public static void main(String[] args) {


        int[][] sinavNotlari = {
                {80, 100},
                {75, 90},
                {100, 100},
                {60, 60},
                {30, 90},
        };

        for (int i = 0; i < sinavNotlari.length; i++) {
            int ilkDonemNotu = sinavNotlari[i][0];
            int ikinciDonemNotu = sinavNotlari[i][1];
            System.out.println((i + 1) + ". Öğrencinin Notlari: ");


            System.out.println("Birinci Dönem Notu: " + ilkDonemNotu);
            System.out.println("İkinci Dönem Notu: " + ikinciDonemNotu);


            double yilSonuNotu = ((ilkDonemNotu + ikinciDonemNotu) / 2.0);
            System.out.println("Öğrencinin Yıl Sonu Ortalaması :"+ yilSonuNotu);

            System.out.println("=================================");
        }
    }
}

