package Day11_methodOverloading_WhileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        /*
        java overloading yapilmis methodlardan hangisinin calisacagina
        karar verirken adim adim ilerler
        1- eger argument'ler ile parametreler tamamen uyumluysa onu calistirir
        2- eger argument ve parametreler %100 uyumlu degilse,
        casting yapabilir miyim diye bakar
        3-casting ile calistiracagi birden fazla method bulursa,
            en az casting ile calistiracagini tercih eder.
         */

        topla(4.2,1.4);

    }



    public static void topla (double sayi1, double sayi2){
        System.out.println("iki double in toplami: " + (sayi1+sayi2));

    }
    public static void topla (int sayi1 , float sayi2){
        System.out.println("int ve float in toplami : " + (sayi1+sayi2));
    }
     static void topla (int sayi1 , int sayi2){
        System.out.println("int ve int in toplami : " + (sayi1+sayi2));
    }
}
