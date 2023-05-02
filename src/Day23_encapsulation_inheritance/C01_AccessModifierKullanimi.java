package Day23_encapsulation_inheritance;

import Day22_stringBuilder_accessModifer.C05_AccessModifier;

public class C01_AccessModifierKullanimi extends C05_AccessModifier{
    public static void main(String[] args) {

        //Baska package'daki bir class'dan class uyelerini
        //saadece public olanlari kullanabiliriz
        //eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        //parent-child ilsikisi varsa classs uyelerine erisim mumkundur.

        System.out.println(C05_AccessModifier.publicStaticSayi);
        C05_AccessModifier.publicStaticMethod();

        C05_AccessModifier.protectedStaticSayi=10;
        C05_AccessModifier.publicStaticSayi=23;

        System.out.println(C05_AccessModifier.protectedStaticSayi);
        System.out.println(C05_AccessModifier.publicStaticSayi);


        /*
                access modifier ile erisimi duzenlenen bir class uyesine
                baska class'dan erisebilirsak
                hem deger atamasi yapabilir, hem de o class uyesinin degerini
                yazdirabiliriz.

         */

    }
}
