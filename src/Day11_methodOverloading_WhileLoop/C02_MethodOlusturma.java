package Day11_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup
        // bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println(pozitifBooleanSayisiBul(sayi));
        //verilen sayinin asal olup olmadigini bu methodu kullanarak yazdirin
        int ptbs = pozitifBooleanSayisiBul(sayi);
        if (ptbs == 2 ){
            System.out.println("verilen sayi asal");
        }else {
            System.out.println("verilen sayi asal degil");
        }
    }

    public static int pozitifBooleanSayisiBul(int sayi){
        int sayac = 0 ;

        for (int i = 1; i <=sayi ; i++) {
            if ( sayi % i == 0){
                sayac++;
            }
        }
        return sayac;
    }


}
