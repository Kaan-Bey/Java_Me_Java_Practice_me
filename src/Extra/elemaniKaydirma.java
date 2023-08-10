package Extra;

import java.util.Arrays;

public class elemaniKaydirma {

    public static void main(String[] args) {

        /*

        Soru: verilen bir array'in tüm elementleri bir sağa kaydirip,
        sondaki elementi de basa tasıyacak bir method olusturun, array'i yeni haliyle kaydedin
         */

        int []  arr = {13, 20, 50, 43};

        arr = elemanlariBirKaydirma(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] elemanlariBirKaydirma(int [] arr) {

        int gecici = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0 ; i--) {
            arr[i+1]=arr[i];



        }
        arr[0]=gecici;
        return arr;
    }

}
