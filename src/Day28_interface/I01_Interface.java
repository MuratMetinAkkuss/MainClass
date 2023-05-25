package Day28_interface;

public interface I01_Interface {
    /*
        Interface'ler class degildir
        interface full abstraction sagladigi icin
        interface'in deklarasyonunda abstract yazmamiza gerek yoktur

        Ayni sekilde interface'ler icerisinde olusturulan method'lar icin de
        public veya abstract yazmaya gerek yoktur.
        java tum method'lari public ve abstract olarak kabul eder

        interface'ler child class'lar icin bir sablon ozelligi tasirlar
        yani TO-DO List olarak islev gorurler.

     */
    int SAYI = 20;
    /*
        JAVA'DA Static ve final variable isimleri buyuk harf ile olusturulur.
     */
    public abstract void method1();
    abstract int merthod2();
    public String method3();
    //double method4();


}
