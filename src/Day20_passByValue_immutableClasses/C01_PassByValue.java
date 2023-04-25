package Day20_passByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {
        int sayi = 20 ;

        sayi = method2(sayi);
        System.out.println(sayi);


        System.out.println("Method call sonucu: " +method1(sayi));

    }

    public static int method2(int sayi){
        sayi = 25 ;
        System.out.println("Method icinde sayi: " + sayi);

        return sayi ;
    }

    public static int method1(int sayi){
        sayi = 25 ;
        System.out.println("Method icinde sayi: " + sayi);

        return sayi ;
    }

}
