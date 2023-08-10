package day07;

import java.util.ArrayList;

public class P03ArraySondanYazdirma {

    // Bir ArrayList oluşturun ve içine 5 adet isim ekleyin.
// Daha sonra bu isimleri sondan başlayarak ekrana yazdırın.

// Örnek çıktı:
// Son isim: Ahmet
// Son ikinci isim: Mehmet
// ...


    public static void main(String[] args) {
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Kaan");
        isimler.add("Beyza");
        isimler.add("Yavuz");
        isimler.add("Yeter");


        for (int i = isimler.size()-1; i >=0 ; i--) {
            System.out.println("Sondan " + (isimler.size()-i) + "'nci isim : " +  " "+ isimler.get(i));

        }
    }
}
