package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11_equals {
    public static void main(String[] args) {
        List<String> isimler1 = new ArrayList<>();

        isimler1.add("selgun");
        isimler1.add("saida");
        isimler1.add("sevda");

        List<String> isimler2 = new ArrayList<>();

        isimler2.add("saida");
        isimler2.add("selgun");
        isimler2.add("sevda");

        System.out.println(isimler1);
        System.out.println(isimler2);

        System.out.println(isimler2.equals(isimler1));

        //Array List bir Collection oldugu icin sort method'nu oradan kullanir

        Collections.sort(isimler1);
        Collections.sort(isimler2);

        System.out.println(isimler1.equals(isimler2));

    }
}
