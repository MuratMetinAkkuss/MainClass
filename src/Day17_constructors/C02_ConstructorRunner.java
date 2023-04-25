package Day17_constructors;

public class C02_ConstructorRunner {

    public static void main(String[] args) {
        // bu class'tan C01 class'indaki variable ve methodlara ulasmak istiyorum

        System.out.println(C01_Constructors.isHappy);
        C01_Constructors.staticMethod();

        //Static olmayan class uyelerine ulasmak icin
        //o class'tan obje olusturmamiz lazim

        C01_Constructors obje = new C01_Constructors();

        //bastaki C01_Constructors ==> class adi ve
        //objenin data turudur.
        // new ==>keyword olarak kullanilir yeni objede
        /*
            C01_Constructor() ==> constructor
            Bir objenin olusturulmasi ve ilk deger atamasinin
            (initialize) yapilmasi icin mutlaka
            constructor calismalidir.




            Java bir class olusturuldugunda
            o class'tan obje olusturulabilmesi icin
            her class'a otomatik olarak
            default bir constructor yerlestirir

            bu default constructor'lar gorunmez

         */
        System.out.println(obje.str);
        obje.sayi=20;
        obje.staticOlmayanmethod();



    }

}
