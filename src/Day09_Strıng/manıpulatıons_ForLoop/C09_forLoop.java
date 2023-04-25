package Day09_Strıng.manıpulatıons_ForLoop;

public class C09_forLoop {
    public static void main(String[] args) {
        //verilen bir metindeki
        //buyuk harf, kucuk harf ve space sayilarini bulun.
        //space sayisini goz onune alarak kac kelime oldugunu
        //kac tane buyuk ve kucuk harf oldugunu yazdirin

        String str = "Java ogrenen isi kapar";

        int buyukHarfSayisi = 0;
        int kucukHarfSayisi = 0;
        int spaceSayisi = 0;

        for (int index = 0; index < str.length() ; index++) {
            char karakter = str.charAt(index);

            if ('a' <= karakter && karakter <= 'z') {
                kucukHarfSayisi++;
            } else if ('A' <= karakter && karakter <= 'Z') {
                buyukHarfSayisi++;
            } else if (karakter == ' ') {
                spaceSayisi++;
            }
        }
            System.out.println("metindeki kelime sayisi : " + (spaceSayisi+1) +
                    "\nkucuk harf sayisi : " + kucukHarfSayisi +
                    "\nbuyuk harf sayisi : " + buyukHarfSayisi);


    }
}
