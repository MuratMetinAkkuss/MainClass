package Day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_tamBolenler {
    //girilen pozitif bir tam sayinin
    //tam bolenlerini liste olarak bize
    //donduren bir method yaziniz

    public static void main(String[] args) {
    int say = 10 ;

        System.out.println(tamBolenlerListesi(say));
    }
    //method sayilardan olusan bir liste dondurecek
    static public List<Integer> tamBolenlerListesi(Integer sayi){
        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if ( sayi %i == 0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}
