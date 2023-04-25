package Day18_parametreliConstructor_constructorCall;

public class C06 {
    C06(){
        System.out.println("parametresiz constructor");
    }
    C06(int sayi){
        //C06(); Java bu sekilde yazimi Method call kabul eder
        //yani constructor'lar ismi yazilarak CAGIRILAMAZ

        this();
        //bir constructor'in icinde baska bir constructor'i
        //calistirmak istersek
        //this(istenen argumentler) yazariz
        System.out.println("int parametreli constructor");
    }
    C06(String str){
        this(3);
        System.out.println("String parametreli constructor");
    }

    public static void main(String[] args) {
        C06 obj = new C06("Java");
    }
}
