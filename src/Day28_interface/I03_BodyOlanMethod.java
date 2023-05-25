package Day28_interface;

public interface I03_BodyOlanMethod {
    /*
        Interface'deki tum methodlar public ve abstractir
        yazsakta yazamsakta bu kural boyledir
        Java kendisine gelen talepler dogrultusunda interface'e sonradan eklenen
        bazi methodlari eski class'larin impement etme zorunlulugunu kaldiran
        bir keyword eklemistir

        bunun icin;
        method deklarasyonuna default veya static keyword eklenirse
        method'un body'si olanilir ve child class implement etme
        mecburiyeti olmaz

        burada kullanilan default keyword
        access modifier degildir.
        method5'de de gorulecegi uzere public access modifier'dan
        sonra yazilmistir


     */
    public abstract void method1();
    abstract int merthod2();
    public String method3();
    double method4();

    public default void method5(){

    }
    public static void method6(){

    }
}
