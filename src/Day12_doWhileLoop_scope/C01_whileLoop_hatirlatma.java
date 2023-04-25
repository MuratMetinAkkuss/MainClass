package Day12_doWhileLoop_scope;

import java.util.Scanner;

public class C01_whileLoop_hatirlatma {
    public static void main(String[] args) {
        /*
        While Loop'ta kullanacagamiz variable'lara bastan deger atamamiz gerekir
        eger bu variable'lara yanlis deger atamasi yaparsak While Loop body'si
        hic calismayabilir.

        java bu dezavantaji ortadan kaldirmak icin do while loop
        olusturmustur

        do-while loop
        ilk kontrolu yapmadan kodu bir kez calistirir
        sonra kontrol yapar



         */
        /*
        kullanicidan sayi degerleri alip toplayalim
        kullanici sifira bastiginda islem bitsin
        ve toplami yazdirsin
          */
        Scanner scanner = new Scanner(System.in);
        int sayi = 1;
        int toplam =0;



        while (sayi != 0){
            System.out.println("toplanmasi icin bir sayi yaziniz:" +
                    "\nbitirmek icin 0 a basin");
            sayi = scanner.nextInt() ;
            toplam+=sayi;
        }
    }
}
