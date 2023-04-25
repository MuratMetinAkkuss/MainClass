package Day20_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        String str = "Java candir";

        System.out.println(str.toUpperCase());
        System.out.println(str);

        str.toLowerCase();
        System.out.println(str.replaceAll("a", "e"));
        str.repeat(4);

        System.out.println(str);

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(5);

        System.out.println(sayilar);

        sayilar.set(0,10);

        System.out.println(sayilar);

    }
}
