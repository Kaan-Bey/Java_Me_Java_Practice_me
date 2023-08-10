package day03;

import java.util.Scanner;

public class day03_Scanner {

    public static void main(String[] args) {


 /*
1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
sisteme kaydedildiğini aşağıdaki formatta yazdırın.
 *****       KAYIT BAŞARILI      *****
Adınız: Tarık
Soyadınız: Yiğit
Yaşınız:42
Mail Adresiniz:tarik@yigit.com
Şifreniz: A2e365
şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
 */

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen asagidaki bilgileri giriniz:");
        System.out.print("Adiniz: ");
        String name= scanner.next();
        System.out.println("");
        System.out.print("Soyadiniz: ");
        String surname = scanner.next();
        System.out.println("");
        System.out.print("Yasiniz: ");
        String yas = scanner.next();
        System.out.println("");
        System.out.print("Mail Adresiniz: ");
        String mail = scanner.next();
        System.out.println("");
        System.out.print("Sifreniz: ");
        String sifre = scanner.next();
        System.out.println("");

        System.out.println("*****       KAYIT BAŞARILI      *****");


    }
}
