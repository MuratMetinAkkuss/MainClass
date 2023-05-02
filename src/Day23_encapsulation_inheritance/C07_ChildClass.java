package Day23_encapsulation_inheritance;

public class C07_ChildClass extends C06_Parent{
    /*
        Jva'da child class'lar parent edinir.
        eger bir class'daki tum ozelliklere otomatik olarak sahip olmak isterse
        o class'i extends keywords kullanarak PARENT edinebilir

        baska bir class'dan obje olusturuarak o class'tan class uyelerini
        kullanmak inheritance degildir.

     */

    public static void main(String[] args) {

        C07_ChildClass objKendiClass = new C07_ChildClass();
        System.out.println(objKendiClass.strDefault);
        objKendiClass.strProtected="naber";
        System.out.println(objKendiClass.strProtected);

        objKendiClass.defaultMethod();
        objKendiClass.publicMethod();
        //Demek ki bir Child Class access modifier goz onunde bulundurularak
        //parent class'daki tum ozeliklere otomatik olarak sahip olur

        /*
                Parent class'daki private class uyeleri INHERIT edilemez
                Default class uyeleri INHERIT edilir ancak ayni package icinde
                Protected class uyeleri her yerden INHERIT edilebilir
                Public olan class uyeleri her yerden INHERIT edilebilir.

                Public olanlar sadece child classlardan degil tum classlardan
                kullanilabilir
                Protected access modifier olanlarsa parent child iliskisi icin
                en iyi kullanilabilecek modifier'dir.

                *******
                parent child iliskisi iki durumda kullanilir;
               1- eger bir projeyi sifirdan olsuturuyorsaniz
                  tasarim asamasinda parent child class'lari dusunup uygulamayi
                  ona gore gelistirebiliriz. boylece reusability ve maintenance
                  saglanir
               2- sonradan bir class olusturuldugunda daha onceden olsuturulmus
                  bir class'daki tum ozelliklere sahip olmasi istenirse o class'a
                  child yapabiliriz/


               -bir child class parent class'daki tum ozelliklere otomatik olarak
               sahip olur.
               -Isterse parent class'daki ozelliklerden bazilarini kendisine uyarlar
               -isterse de parent class'larinda olmayan yeni ozellikler ekleyebilir

         */

        }

    public void publicMethod(){
        System.out.println("Child Class public Method");
    }

}
