package Day09_Strıng.manıpulatıons_ForLoop;

import java.util.Scanner;

public class C06forLoop {
    public static void main(String[] args) {
        //kullanicidan iki sayi alin ve bu sayilar dahil olarak
        //aralarindaki 3 ile bolunebilen sayilari yazdiriniz
        //ilk girilen sayi ikinci girilen sayidan buyuk
        //ise hata mesaji yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 1 pozitif tamsayi giriniz");
        int poz1 = scanner.nextInt();
        System.out.println("lutfen 1 pozitif tamsayi giriniz");
        int poz2 = scanner.nextInt();

        if (poz1>poz2){
            System.out.println("ilk sayi ikinci sayidan kucuk olmadir!!");
        }else {
            for (int i = poz1 ; i <= poz2 ; i++) {
                if (i%3==0){
                    System.out.println(i);
                }
            }
        }
    }
}
