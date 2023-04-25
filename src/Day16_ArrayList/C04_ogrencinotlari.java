package Day16_ArrayList;

import java.util.List;

public class C04_ogrencinotlari {
    public static <list> void main(String[] args) {
        //ogretmenden alinan ogrenci notlarini
        //ortalamasini ve kac ogrencinin ortalama ustunde not aldigini
        //bize ulastiran method olusturun


        List<Integer> notlar = C04_kullanicidanIntegerListOlusturma.sayiAlma();
        notOrtVerOrtUstuOgrencisayisi(notlar);
    }
    public static void notOrtVerOrtUstuOgrencisayisi (List<Integer> notlarListesi){
        //not ortalamasi
        int toplamNot = 0 ;
        int notOrt = 0 ;
        int sayac = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            toplamNot +=  toplamNot + notlarListesi.get(i);
        }
        notOrt =  toplamNot/notlarListesi.size();

        //not ortalamasi uzerindeki ogrenciler

        for (int i = 0; i < notlarListesi.size(); i++) {
            if (notlarListesi.get(i)>notOrt){
                sayac++;
            }
        }
        System.out.println( sayac);
        System.out.println( notOrt);

    }

}
