package Extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tekrarsizListe {

    public static void main(String[] args) {

        List<Integer> tekrarsizListe = TekrarsizListeOlustur();
        Collections.sort(tekrarsizListe);
        System.out.println(tekrarsizListe);


    }
    public static List<Integer> TekrarsizListeOlustur() {
        Scanner scanner=new Scanner(System.in);
        List<Integer> tekrarsizListe = new ArrayList<>();
        int girilenSayi;
        int sayac=0;
        System.out.println("Lütfen pozitif tam sayılar giriniz.\n" +
                "10 tane sayı girdiğinizde tekrarsız liste olusturulacak ve yazdırılacaktır.");
        while (sayac<10){
            girilenSayi=scanner.nextInt();
            sayac++;
            if (!tekrarsizListe.contains(girilenSayi)){
                tekrarsizListe.add(girilenSayi);
            }
        }return tekrarsizListe;

    }

}
