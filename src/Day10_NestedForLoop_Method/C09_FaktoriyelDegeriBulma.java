package Day10_NestedForLoop_Method;

public class C09_FaktoriyelDegeriBulma {
    /*
    verdigimiz bir sayinin faktoriyel degerini yazdiran
    bir method olusturun

     */
    public static void main(String[] args) {

    }

    public static void faktoryelDegeriYazdir(int sayi){
        int faktoryel = 1 ;

        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i ;
        }
        System.out.println(sayi + "! : " + faktoryel);
    }

}
