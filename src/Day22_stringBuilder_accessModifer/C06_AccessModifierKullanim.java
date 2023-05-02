package Day22_stringBuilder_accessModifer;

public class C06_AccessModifierKullanim extends C05_AccessModifier{
    public static void main(String[] args) {
        //Baska class'taki static class uyelerinden private olmayanlara
        //direkt class ismi ile ulasabiliriz.


        System.out.println(C05_AccessModifier.defaultStaticSayi);
        C05_AccessModifier.defaultStaticMethod();

        //ayni package icinde baska class'taki static olmayan class uyelerinden
        //private olanlar haric tamamina object ile erisebilir.

        C05_AccessModifier obj = new C05_AccessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();

    }
}
