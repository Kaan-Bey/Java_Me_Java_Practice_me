package day07;

import java.util.Scanner;

public class soru_37 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Array in uzunlugunu giriniz: ");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];
        for (int i = 0; i < arr.length; i++) {
            scanner = new Scanner(System.in);
            System.out.println("Arrayin " + (i + 1) + "'nci elemanini giriniz:");
            arr[i] = scanner.nextInt();
        }

        System.out.println(ortadakiSayiyiBulma(arr));

    }

    public static String ortadakiSayiyiBulma(int[] arr) {

        int ortaIndex1 = arr.length / 2;
        int ortaIndex2 = arr.length / 2 - 1;

        if (arr.length % 2 == 0) {

            System.out.print("Çift sayi uzunlugundaki ARRAY'imizin ortasindaki elemanlari: " + arr[ortaIndex2] + " ve " + arr[ortaIndex1]);
            return "";
        } else {
            int ortaIndex = arr.length / 2;
            System.out.print("Tek sayi uzunlugundaki ARRAY'imizin ortasindaki elemani: " + arr[ortaIndex]);
            return "";

        }
    }
}

