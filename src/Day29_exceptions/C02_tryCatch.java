package Day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatch {
    //kullanicidan iki tam sayi alip
    //ilk sayiyi ikicniye bolun
    //sonucu yazdirin
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Lutfen bolunecek tamsayiyi yazin");
        int s1 = 0;
        try {
            s1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatali girdiniz!");
        }

        System.out.println("Bolecek sayiyi yaziniz: ");
        int s2 = 0;
        try {
            s2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatali giris yaptiniz! ");
        }
        /*
            kodumuzu yazarken
            bir exception olusma ihtimali goruyorsak
            sorun cikmasi muhtemel kodumuzu
            try-catch ile cevreleriz

            try-Catch temel uc bloktan olusur.
            1-try blogu : exception olusmasi muhtemel kodlarin
            konuldugu bolum
            2-catch (exception e ):catch keyword ve beklenen exception turunu
            yazdigim bolum
            3- catch blogu : on godrudugmuz exception olsutugunda javaya
            calismaasini istedgimiz kodlari verir.

            kullanicinin yapmasi muhtemel hatalari
            tamamiyla ayiklamak icin
            genis kapsamli dusunup
            tum ihtimalleri cozmek gerekir.
         */

        try {
            System.out.println("iki sayinin bolme sonucu : " + s1/s2);
        } catch (ArithmeticException e) {
            System.out.println("hatatali islem yaptiniz.");
        }
    }
}
