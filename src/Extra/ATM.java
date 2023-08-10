package Extra;

import java.util.Scanner;

public class ATM {
/*
    public static void main(String[] args) {

        enter();

    }

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



    static String cartNo = "123456";
    static String passNo = "1234";
    static Scanner scanner = new Scanner(System.in);

    public static void enter() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your card number : ");
        String ucartNo = scanner.nextLine().replace(" ", "");
        System.out.println("Please enter your password : ");
        String upassNo = scanner.nextLine();

        if ((cartNo.equals(cartNo)  && (passNo.equals(passNo)){
        menu();
        }else {
            System.out.println("your entered values is wrong , please correct enter your information");
        }
    }
    
    public static void menu(){

        System.out.println("================= KAAN BANK ATM =================");
        System.out.println("=================    Wellcome     =================");
        System.out.println("-----------------       Menu         -----------------");
        System.out.println("  Please do select your process :  ");
        System.out.println(" 1-Check balance \n 2-deposit\n 3-withdraw \n 4-send money \n 5-change password \n 6-exit");

        int select= scanner.nextInt();
        switch (select){
            
            case 1:{checkBalance();
            }
            case 2:{
                System.out.println(" Enter the amount of deposit ");
                double amount= scanner.nextDouble();
                deposit(amount);
            }
            case 3:{
                System.out.println("Enter the amount of withDraw : ");
                double amount= scanner.nextDouble();
                withDraw(amount);
                
            }
            case 4:{
                sendMoney();
                
            }
            case 5:{
                
            }
            case 6:{
                
            }
            
        }
    }

    private static void sendMoney() {
        System.out.println("Please enter the IBAN to send money :");
    }

    private static void withDraw(double amount) {
        int balance;
        if (amount<=balance){
            balance-= amount;
            checkBalance();
        }else {
            System.out.println(" You cannot withdraw money bigger than balance "
            + "\n Enter new amount:");
            double newamount= scanner.nextDouble();
            withDraw(newamount);
        }
    }

    private static void deposit(double amount) {
        double deposit;
        deposit= scanner.nextDouble();
        deposit += amount;
        menu();
    }

    private static void checkBalance() {
        System.out.println("depozit : "+ deposit + "$");
        menu();
        
    }

     */
}

