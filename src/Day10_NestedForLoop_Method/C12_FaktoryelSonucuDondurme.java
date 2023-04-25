package Day10_NestedForLoop_Method;

public class C12_FaktoryelSonucuDondurme {
    /*
    verilen sayinin faktoryel degerini hesaplayip
    sonucu donduren bir method olusturun
     */
    public static void main(String[] args) {
        System.out.println(faktoryelhesap(20));

    }

    public static int faktoryelhesap (int sayi) {

        int faktoryel = 1;

        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
        }
        return faktoryel;
    }
}
