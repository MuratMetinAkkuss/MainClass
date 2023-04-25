package Day09_Strıng.manıpulatıons_ForLoop;

import java.util.Scanner;

public class C12_forLoop_RakamlarToplami {
    //Soru 7- Kullanicidan pozitif bir tamsayi alip,
    // rakamlar toplamini yazdirin.

    public static void main(String[] args) {

        int sayi = 452342312;
        int basamaksayisi = (""+sayi).length();

        int rakam = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <=basamaksayisi ; i++) {
            rakam = sayi % 10 ;
            rakamlarToplami += rakam;

            sayi /= 10 ;

        }
        System.out.println("verilen sayinin rakamlari toplami: " +
                rakamlarToplami);









    }
}
