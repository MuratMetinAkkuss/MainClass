package Day11_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C06_Whileloop {
    // Kullanicidan toplanmak uzere sayilar alin
// toplam 500 olur veya gecerse deger almayi durdurup
// kac sayi girildigini ve toplamin kac oldugunu yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayac = 0 ;
        int toplam = 0 ;
        int sayi = 0 ;

        while (toplam < 500){
            System.out.println("toplanmak icin tam sayi giriniz");
            sayi = scanner.nextInt();

            sayac++;
            toplam += sayi;

        }
    }
}
