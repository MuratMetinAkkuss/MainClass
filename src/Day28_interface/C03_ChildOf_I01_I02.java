package Day28_interface;


public class C03_ChildOf_I01_I02 implements I01_Interface, I02_Interface{
    @Override
    public void method1() {

    }

    @Override
    public int merthod2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }
    /*
        Bir class birden fazla class'i inherit edebilir mi?
        java multi leveldir

        Ancak bir child class bir class'i inherite ederken,
        ayni zamanda baska interface'leri de inherit edebilir

        Birden fazla interface'i inherit etmek istedigimiz de
        dikkat etmemiz gerek konu :

        Eger inherit etmek istedigimiz farkli interface'lerde
        ayni isimde ama farkli return type'a sahip method varsa
        iki interface'i birden IMPLEMENT edemeyiz
     */
    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI);
        System.out.println(I02_Interface.SAYI);
        /*
            Interface'lerde olusturulan variable'lar public static ve finaldir
            yani her yerden ulasilabilir ama degistirilemezler.

            eger bir child class'in implement ettigi farkli interface'lerinde
            ayni isimde variable varsa static yontem kullanilarak
            interfaceismi.variable ismi kullanilarak getirilir.
         */



    }
}
