package Sorular;

public class soru42_Araba {

    /*

    Soru 42
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özelliklerini yazdırın
        Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp
        konsolda yazdıralım

     */


    String Renk = "Renk belirtilmedi";
    String Model = "Adi belirtilmedi";
    int Adet = 0;

    soru42_Araba() {         // parametresiz constructor


    }

    @Override
    public String toString() {
        return "soru42_Araba{" +
                "Renk='" + Renk + '\'' +
                ", Model='" + Model + '\'' +
                ", Adet=" + Adet +
                '}';
    }

    soru42_Araba(String renk, String Model, int adet) {          // parametreli constructor

    }


    public static void main(String[] args) {

        soru42_Araba arb1 = new soru42_Araba();

        System.out.println(arb1);


        System.out.println("==========================");



        soru42_Araba arb2 = new soru42_Araba();

        arb2.Renk="Kırmızı";
        arb2.Model= "BMW 216D";
        arb2.Adet= 12;

        System.out.println(arb2);
    }
}
