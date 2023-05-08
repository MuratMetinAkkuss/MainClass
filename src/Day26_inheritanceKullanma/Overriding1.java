package Day26_inheritanceKullanma;

public class Overriding1 {
    /*
        Overriding, child class'da olusturulan bir method'un
        parent class'daki ayni isim be signature'a sahip olan
        method'u gecersiz kilmasidir.

        *****Returun type signature'a dahil degildir
        yani return type'larin ayni olmasi sart degildir
        ancak return type'lar icin ozel bir kural vardir.

        *****Access modifier'da signature'a dahil degildir.
        yani access modifieer'larin ayni olmasi sart degildir.
        ancak buna da ozel bir kural vardir.

     */

     void method1(){
        System.out.println("Overriding1 method1");
    }

    Object method2(){
        System.out.println("Overriding1 method2");
        return 5;
    }
}
