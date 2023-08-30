package MAPs;

import java.util.Map;
import java.util.TreeMap;

public class C04_IsimSoyisimileOgrenciBulma {

    /*

    ogrenci map'inde verilen isim ve soyisme sahip ogrencilerin;
     isim, soyisim, sinif, ve subelerinin listesini yazdiralim.
     */

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.isimSoyisimIleOgrenciBul(ogrenciMap, "ALI", "CAN");


    }
}
