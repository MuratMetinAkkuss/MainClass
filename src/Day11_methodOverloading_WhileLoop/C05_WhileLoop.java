package Day11_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alip 3 ile bolunup bolunemedigini yazdirin
        //kullanici 3 ile bolunebilen bir sayi girinceye kadar tekrar
        //deger isteyin

        /*
        tekrar sayisi tam olarak bilinmeyen
        tekrar sayisi farkli bir sarta bagli olan durumlarda
        While loop kullaniriz
         */
        Scanner scanner = new Scanner(System.in);

        //girilen sayi 3'e bolunebilene kadar tekrar et
        //while loop'da () icine yazilan sart saglanmadigi surece
        //kod tekrar calisacaktir.

        //int sayi = 2 ;

       // while (sayi % 3 != 0){
            System.out.println("lutfen bir pozitif tam sayi giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi % 3 == 0){
                System.out.println("bolunur");
            }else {
                System.out.println("bolunemiyor");
            //}
        }
    }
}
