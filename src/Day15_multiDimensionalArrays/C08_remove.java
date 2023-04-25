package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_remove {
    public static void main(String[] args) {

        /*
            eger listemiz sayilardan olusuyorsa java girilen sayi index mi
            yoksa obje mi diye dusunmez direkt index olarak kabul eder

            illa da objeyi vermek isterseniz;
            once silmek istediginiz objeyi olusturup
            sonra integer degeri degil
            obje ismini yazarak remove edebilirsiniz

            eger silmek istediginiz birden fazla ise ilkini siler

         */

        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList);

        System.out.println(sayiList.remove(5));
        System.out.println(sayiList);

        System.out.println(sayiList.remove("3"));
        System.out.println(sayiList);

        Integer silinecekObje = 5 ;
        System.out.println(sayiList.remove(silinecekObje));
        System.out.println(sayiList);
    }
}
