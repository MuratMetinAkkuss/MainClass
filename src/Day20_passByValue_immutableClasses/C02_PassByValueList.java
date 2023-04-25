package Day20_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("Z");

        System.out.println(harfler);

        method1(harfler);

        System.out.println(harfler);
    }

    public static List<String> method1(List<String> harfler){

        harfler.set(0,"T");
        harfler.set(1,"C");
        System.out.println("Method1 icinde List: " + harfler );

        return harfler;
    }

    public static List<String> method2(List<String> harfler){
        harfler=new ArrayList<>();
        harfler.add("P");
        System.out.println(harfler);
        return harfler;

    }

}
