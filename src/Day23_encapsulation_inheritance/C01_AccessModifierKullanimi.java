package Day23_encapsulation_inheritance;

import Day22_stringBuilder_accessModifer.C05_AccessModifier;

public class C01_AccessModifierKullanimi {
    public static void main(String[] args) {

        //Baska package'daki bir class'dan class uyelerini
        //saadece public olanlari kullanabiliriz
        //eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        //parent-child ilsikisi varsa classs uyelerine erisim mumkundur.

        System.out.println(C05_AccessModifier.publicStaticSayi);
        C05_AccessModifier.publicStaticMethod();

    }
}
