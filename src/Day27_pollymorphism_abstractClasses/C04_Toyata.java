package Day27_pollymorphism_abstractClasses;

public class C04_Toyata extends C03_Araba{

    public static void main(String[] args) {
/*
        Satisa cikan tum araclar icin somut degerler atanmalidir.
        child class'lar parent class'daki TUM METHOD'LARI OVERRIDE ETMEK ZORUNDA
        OLSUN.

        normal parent child iliskisinde MECBURIYET yoktur.
        Child class isterse OVERRIDE eder isterse etmez.

        ABSTRACTION'in temel amaci
        child class'larin MUTLAKA KENDISINE UYARLAMASI GEREKEN method'larin
        override edilmesini SAGLAMAKTIR.

        Bir class abstract yapilip
        icerisine abstract method'lar konursa
        o class'i parent edinen
        tum child class'lar
        parent class'daki abstract method'lari OVERRIDE etmelidir
        aksi durumda CTE olusur.

 */
        C04_Toyata arac1 = new C04_Toyata();
        arac1.teker();
        arac1.klima();
        arac1.motor();


    }

    @Override
    void teker() {
        System.out.println("Toyata aracalr pirelli teker kullanir.");
    }

    @Override
    void motor() {
        System.out.println("Toyata araclar cevreci motorlar kullanir");
    }

    @Override
    void gosterge() {
        System.out.println("Toyata aracalarda tum gostergeler vardir.");
    }
}
