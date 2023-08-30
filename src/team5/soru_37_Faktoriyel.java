package team5;
import java.util.Scanner;
public class soru_37_Faktoriyel {
    //Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
    //        Method bize çıktıyı döndürsün.
    //     Örnek:
    //     Girdi: 6
    //     Çıktı: 6!=654321=720
    //     ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
    //     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz:");
        int sayi= scanner.nextInt();
        faktoriyelHesapla(sayi);
    }
    public static void faktoriyelHesapla(int sayi) {
        int carpim=1;
        for (int i = 1; i <=sayi ; i++) {
            carpim*=i;
        }
        String sayidagilimi = "";
        for (int i =sayi; i>0 ; i--) {
            sayidagilimi+=i+"*";
        }
        sayidagilimi=sayidagilimi.substring(0,sayidagilimi.length()-1);
        System.out.println("faktöriyeli istenen deger:"+sayi+"!= " + sayidagilimi+ "=" +carpim);
    }
}