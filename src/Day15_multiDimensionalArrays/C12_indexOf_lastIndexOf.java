package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C12_indexOf_lastIndexOf {
    public static void main(String[] args) {
        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList);

        System.out.println(sayiList.indexOf(5));

        System.out.println(sayiList.lastIndexOf(5));

        System.out.println(sayiList.indexOf(9));

        System.out.println(sayiList.lastIndexOf(9));
        //olmayan bir elemnet ariyorsaniz size yine -1 doner



    }
}
