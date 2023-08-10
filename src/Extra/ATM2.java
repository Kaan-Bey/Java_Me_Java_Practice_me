package Extra;

import java.util.Scanner;

public class ATM2 {

    /*
    ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.


Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,


    public static void main(String[] args) {

        String cartNo;
        String passNo;
        Scanner scanner = new Scanner(System.in);

        boolean result = false;

        while (result == false) {
            cartNo = scanner.nextLine();
            passNo = scanner.nextLine();
            if (!(cartNo.length() < 16) && (passNo.length() < 4)) ;
            System.out.println("your entered values is wrong , please correct enter your information");
            System.out.println("Please enter your card number : ");
            System.out.println("Please enter your password : ");

        }


        result=true;

        if ((cartNo.length() == 16) && (passNo.length() == 4)) {


                System.out.println("================= KAAN BANK ATM =================");
                System.out.println("=================    Wellcome     =================");
                System.out.println("-----------------       Menu         -----------------");
                System.out.println("  Please do select your process :  ");
                System.out.println(" 1-Check balance \n 2-deposit\n 3-withdraw \n 4-send money \n 5-change password \n 6-exit");


            }

        }

     */
    }

