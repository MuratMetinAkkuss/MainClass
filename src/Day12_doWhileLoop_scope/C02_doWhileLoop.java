package Day12_doWhileLoop_scope;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        /*
        While Loop'ta kullanacagamiz variable'lara bastan deger atamamiz gerekir
        eger bu variable'lara yanlis deger atamasi yaparsak While Loop body'si
        hic calismayabilir.
         */
        /*
        kullanicidan sayi degerleri alip toplayalim
        kullanici sifira bastiginda islem bitsin
        ve toplami yazdirsin


        while loop'da loop bodysinin hic calismama ihtimali var midir?
        VARDIR.
        do While Loop'da loop bodysinin hic calismama ihtimali YOKTUR
        loop body'si en az bir kere calisir.

          */
        Scanner scanner = new Scanner(System.in);
        int sayi = 0 ;
        int toplam = 0 ;




        do {
            System.out.println("toplanmasi icin bir sayi yaziniz:" +
                    "\nbitirmek icin 0 a basin");
            sayi = scanner.nextInt() ;
            toplam+=sayi;
        }while (sayi != 0);
    }
}
