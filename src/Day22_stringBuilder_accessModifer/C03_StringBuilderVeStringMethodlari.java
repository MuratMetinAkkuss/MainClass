package Day22_stringBuilder_accessModifer;

public class C03_StringBuilderVeStringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder'da bazi method'lar String dondurur.
            bu method'lar String dondurdugu icin
            String'deki immutablity'ye uyarlar
            ve StringBuilder'i degistirmezler

            bazen de StringBuilder'da olmayan ancak
            String'de olan method'lari kullanmak isteyebiliriz
            bu durumda once StringBuilder'i String'e donusturmek gerekir

            Eger String method'lar kullanarak StringBuilder'i
            kalici olarak degistirmek istersek
                    -once toString() yapip String'e ceviririz
                    -String olan bu halinde istedigimiz method'lari manipulation
                    yapariz.
                    -String olan yeni deferi eski StringBuilder'a atama yapariz
                    sb = new StringBuilder(DegistirilmisStringHali)


         */
        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.substring(5));
        System.out.println(sb1);

        String str = "Javaa";

        System.out.println(sb1.toString().toUpperCase());

        //bunu yeni bir Stringbuilder'a atayabilir miyiz?

        //sb1 = sb1.toString().toUpperCase();
        sb1 = new StringBuilder(sb1.toString().toUpperCase());

        System.out.println(sb1);

    }
}
