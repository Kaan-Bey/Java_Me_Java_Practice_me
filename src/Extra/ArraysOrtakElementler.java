package Extra;

import java.util.ArrayList;

public class ArraysOrtakElementler {

    public static void main(String[] args) {

        // Soru- Verilen iki array’in elementlerini karsilastirip,
        //       ikisinde ortak olan elementleri ayri bir liste olarak vermesini saglayin.

        String[] str1 = {"Esra","Ali","Neriman","Selim","Inci","Yigit","Ayse"};
        String[] str2 = {"Emine","Neriman","Inci","ali","Selim","Hilmi"};


        ArrayList<String> ortakElementler = new ArrayList<>();
        for (String each1: str1
        ) {
            for (String each2: str2
            ) {
                if (each1.equalsIgnoreCase(each2) && !(ortakElementler.contains(each1))) {
                    ortakElementler.add(each1);
                }
            }
        }
        System.out.println(ortakElementler);

    }
}
