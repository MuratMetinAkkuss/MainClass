package Day16_ArrayList;

import java.util.List;

public class C03_kullanicidanAlinanIsimlerdenBelliIsimleriYazdirma {
    public static void main(String[] args) {

        //kullanicidan alinan isimlerden olusan listede
        //3 harfli olan isimleri yazdirin

        List<String> yeniIsimler = C02_kullaniciListOlusturma.kullanicidanStringAlarakListeOlusturma();


        //Listenin elemanlarina ulasmak icin bir loop
        //listenin elemanlari if 3 harf fazlaysa yazdiran code

        for (int i = 0; i <yeniIsimler.size() ; i++) {

            if (yeniIsimler.get(i).length()>=3){
                System.out.print(yeniIsimler.get(i) + ", ");
            }
        }



    }
}
