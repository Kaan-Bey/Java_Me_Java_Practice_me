package Extra;



    import java.util.Scanner;

    public class ATM_AliHoca {

        static String kartNo = "123456";
        static String sifre = "1234";
        static Scanner scan = new Scanner(System.in);
        static double bakiye = 50000;

        static int girisSayaci=0;


        public static void main(String[] args) {


            giris();
        }

        public static void giris() {
            System.out.print("LUTFEN KART NUMARANIZI GİRİN:");
            String kKartNo = scan.nextLine().replace(" ", "");
            System.out.print("LUTFEN KART ŞİFRENİZİ GİRİN:");
            String kSifre = scan.nextLine();

            if (kKartNo.equals(kartNo) && kSifre.equals(sifre)) {
                menu();
            } else {
                System.out.println("HATALI GİRİŞ YAPTINIZ.");

                for (int i = 1; girisSayaci < 3 ; i++) {

                    girisSayaci++;
                    giris();

                }
                System.out.println("3 hatalı giriş yaptınız. \n" +
                        "Kartınız bloke edildi.\n" +
                        "Şubenize başvurun.");
                System.exit(0);


            }


        }




        public static void menu() {
            System.out.println("******YUKSEL BANK'A HOSGELDINIZ:******\n" +
                    "1. Bakiye Sorgulama \n" +
                    "2. Para Yatırma \n" +
                    "3. Para Çekme \n" +
                    "4. Para Gönderme \n" +
                    "5. Şifre Değiştirme\n" +
                    "6. Çıkış \n" +
                    "SEÇİMİZİNİ YAPIN:  ");
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    bakiyeSorgula();
                }

                case 2: {
                    System.out.println("Yatırmak istediğiniz miktarı girin:");
                    double miktar = scan.nextDouble();
                    paraYatirma(miktar);

                }


                case 3: {
                    System.out.println("Çekmek istediğiniz miktarı girin:");
                    double cekilen = scan.nextDouble();
                    paraCekme(cekilen);
                }

                case 4: {

                    paraGonderme();
                }
                case 5: {
                    sifreDegistirme();
                }
                case 6: {
                    System.out.println("Bizi sectiğiniz için teşekkürler...");
                    System.exit(0);
                }
                default:
                    System.out.println("Yanlış giriş yaptınız");
                    menu();

            }
        }

        private static void sifreDegistirme() {
            System.out.println("Mevcut sifrenizi giriniz: ");
            String mevcutSifre = scan.next();
            if (mevcutSifre.equals(sifre)) {
                System.out.print("Yeni Sifre Giriniz:");
                sifre =scan.next();
                giris();


            } else {
                System.out.println("Sifrenizi değiştiremezsiniz.");
                sifreDegistirme();
            }
        }


        public static void paraGonderme() {
            scan.nextLine(); // dummy
            System.out.println("Para göndermek istediğiniz IBAN nosunu girin: ");
            String ibanNo = scan.nextLine().toUpperCase().replaceAll(" ", "");
            if (ibanNo.startsWith("TR") && ibanNo.length() == 26) {
                System.out.println("Göndermek istediğiniz miktarı girin:");
                double gonderilen = scan.nextDouble();
                if (gonderilen <= bakiye) {
                    bakiye -= gonderilen;
                    bakiyeSorgula();
                } else {
                    System.out.print("Bakiye yetersiz\n" +
                            "Yeni miktar giriniz: ");
                    double yeniGonderilen = scan.nextDouble();
                    paraGonderme();
                }

            } else {
                System.out.println("Hatalı IBAN girdiniz..\n" +
                        "IBAN'ı yeniden girin:");
                paraGonderme();


            }


        }

        private static void paraCekme(double cekilen) {
            if (cekilen <= bakiye) {
                bakiye -= cekilen;
                bakiyeSorgula();
            } else {
                System.out.print("Bakiye yetersiz\n" +
                        "Yeni miktar giriniz: ");
                double yeniMiktar = scan.nextDouble();
                paraCekme(yeniMiktar);
            }
        }

        public static void bakiyeSorgula() {
            System.out.println("Bakiyeniz: " + bakiye + " $");
            menu();
        }

        public static void paraYatirma(double miktar) {
            bakiye += miktar;
            bakiyeSorgula();
            System.out.println("\n" +
                    " ");

        }

    }