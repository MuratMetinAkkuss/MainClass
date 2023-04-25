package Day09_Strıng.manıpulatıons_ForLoop;

public class C10_ForLoopFaktoriyel {
    public static void main(String[] args) {
        //verilen bir sayinin faktoriyel degerini bulun
        // 5 ! = 5 * 4 * 3 * 2 * = 128

        int sayi = 7 ;
        int faktoriyel = 1 ;

        for (int i = sayi; i >= 1 ; i--) {
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);
        faktoriyel = 1;

        //sonucu 5 ! = 5 * 4 * 3 * 2 * 1 = 128 seklinde yazdirin
        String sonuc = sayi + " ! = ";
        System.out.print(sonuc);
        for (int i = sayi; i >= 1 ; i--) {
            faktoriyel*=i;

            if (i != 1) System.out.print(i + " * " );
            else {
                System.out.print("1 = ");
            }
        }
        System.out.println(faktoriyel);







    }
}
