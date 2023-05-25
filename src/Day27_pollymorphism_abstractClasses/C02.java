package Day27_pollymorphism_abstractClasses;

import java.util.ArrayList;

public class C02 extends C01_OverridingReturnType{

    void method1() {

    }


    double method2() {
        //Return type void veya primitive data turu ise ise
        //overridden method ile overriding method'un return type'lari
        //AYNI OLMALIDIR.
        return 3;
    }
    String method3(){

        return "Selenium Heyecandir.";
    }

    ArrayList<String> method4(){
        //Return type none-Primitive ise
        //child class'daki method'un return type'i
        //parent class'daki overridden method'un return type'nin aynisi
        //veya CHILD CLASSI'i olmalidir.
        //IS-A reletionship ile kontrol edilebilir.
        //COVARIANT java icerisinde adlandirilmasidir.
        return new ArrayList<>();
    }
}
