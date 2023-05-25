package Day30_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {

    public static void main(String[] args) {

        //kullanicidan yasini alip
        //65'den buyuksa emekli olabilecegini yazdirin
        //eger kullanici 20'den kucuk bir yas girerse
        //exception firlatsin

        Scanner scanner = new Scanner(System.in);
        System.out.println("yas giriniz");
        int yas = scanner.nextInt();

        try {
            if (yas < 20 ){
                throw new IllegalArgumentException("Yas 20'den kucuk olamaz");
            } else if (yas <65) {
                System.out.println("emekli olmana daha var");
            }else {
                System.out.println("emekli ol");
            }
             /*
        burada da 30 satir emeklilik ile ilgili islemler olsun
         */
        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }


    }
}
