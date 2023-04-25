package Day12_doWhileLoop_scope;

public class C06_classLevelVariables {
    /*
        Bir class'in tamaminda gecerli variabl'lar olusturmak istersek
        bu variable'lari class level'da olustururuz
        yani class in icinde ama methodun disinda olmali

        bu variable'lar en ustte olmasi saart degildir
        ancak genel kullanimda class level variable'lar
        class'in en ust kisminda olusturulur

        class level variable'lar static ve static olmayan (instance)
        seklinde iki farkli sekilde olusturulabilir

        static variable'lar static klubune  uye olduklari icin
        tum method'lara gidebilir ve tum method'lardan kullanilabilirler

        instance variable'lar static olmadiklari icin
        bu defa karar verici olarak method'lar devreye girer
     */
    static int sayi = 10; // static variable -- class level
    String str = "java"; // instance variable -- class level



    public static void main(String[] args) {


    }
    public static void staticMethod(){

    }
    public void staticOlmayanMethod(){


    }
}
