package Day27_pollymorphism_abstractClasses;

public abstract class C03_Araba {
    /*
        Parent class'da istedigimiz herhanghi bir method'u
        Child class'larin TUMU override etsin istiyorsak
        o method'u ABSTRACT yapariz.

        eger abstract yapilan bir method
        tum child class'lar tarafindan override
        edilecekse parent class'daki abstract method
         hic bir zaman calismayacaktir
        override edildigi icin guncel olan
        child class'lardaki overridding method'lar calisacaktir.
        o zaman abstract method'larin body'ye ihtiyaci yoktur.

     */
    abstract void teker();

    abstract void motor();

    abstract void gosterge();

    void guvenlik() {
        System.out.println("arabalarin guvenlik onlemleri olsa iyi olur.");
    }

    void klima() {
        System.out.println("arabalarin klimalari olabilir.");
    }

}
