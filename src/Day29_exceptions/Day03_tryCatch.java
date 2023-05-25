package Day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day03_tryCatch {
    //kullanicidan iki tam sayi alip
    //kullanici tam sayi girmezse hata mesaji verip yeniden sayi isteyiniz.
    //ilk sayiyi ikicniye bolun
    //sonucu yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int s1 = 0;
        while (flag) {

            try {
                System.out.println("Lutfen bolunecek tamsayiyi yazin");
                s1 = scanner.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                String wrongInput = scanner.next();
                System.out.println("Hatali giris yaptiniz ! ");
            }

        }

        flag = true;
        int s2 = 0;
        while (flag) {

            try {
                System.out.println("Lutfen bolecek tamsayiyi yazin");
                s2 = scanner.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                String wrongInput = scanner.next();
                System.out.println("Hatali giris yaptiniz ! ");
            }

        }
        try {
            System.out.println("iki sayinin bolme sonucu : " + s1/s2);
        } catch (ArithmeticException e) {
            System.out.println("hatatali islem yaptiniz.");
        }



    }
}
