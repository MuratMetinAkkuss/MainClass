package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C10_set {
    public static void main(String[] args) {

        /*
            Java'da
            get() method'lari biz bilgi GETIRIR
            set() method'lari bize update yapar
            var olan bir elemetin degerini degistirir
         */
        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList);

        System.out.println(sayiList.set(0, 10));

        System.out.println(sayiList);
    }
}
