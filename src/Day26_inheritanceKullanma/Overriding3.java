package Day26_inheritanceKullanma;

public class Overriding3 extends Overriding2{
    /*
        Overriding method'unu intellije e de olusturabiliriz
        bu durumda intellij 2 sey ekler
        1- @Override annotation
           kullanmak zorunda degiliz
           silerseniz CTE olmaz
           @Override notasyonu parent class'daki
           overriden method'u kontrol eder ve silinirsa CTE verir

        2- super().method3()
           mevburi degildir,
           silerseniz CTE olmaz
           bir class'da hem overridden method hem overridding method calismaz

           Eger en guncel method ile birlikte
           parent class'da gecersiz kilinan (overridden)
           method'un da calismasini isterseniz
           super().method3() kullanabilirsiniz.
     */

    public void method1(){
        System.out.println("Overriding3 method1");
    }

    public static void main(String[] args) {

        Overriding3 obj1 = new Overriding3();
        obj1.method1();//
        obj1.method2();

        Overriding2 obj2 = new Overriding3();
        obj1.method1();//
        obj1.method2();

        Overriding1 obj3 = new Overriding3();
        obj1.method1();//
        obj1.method2();

        Overriding1 obj4 = new Overriding1();
        obj1.method1();//
        obj1.method2();
    }
}
