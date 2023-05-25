package Day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_tryCatch {
    public static void main(String[] args) {
        /*
            Kullanicidan toplanmak uzere sayi alin
            kullanici tamsayi girmezse hata mesaji verip yeniden tamsayi isteyin
            kullanici islemi bitirmek icin Q veya q ya basacaktir
            kullanici islemi bitirdiginde
            kac tane gecerli sayi girdigini ve bu sayilarin toplaminin kac
            oldugunu yazdirin

         */
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int counted = 0 ;
        int s1 = 0;
        int toplam = 0 ;
        while (flag) {
            try {
                System.out.println("Lutfen toplanacak tamsayiyi yazin");
                s1 = scanner.nextInt();
                toplam+=s1;
                counted++;
            } catch (InputMismatchException e) {
                String wrongInput = scanner.next();
                if (wrongInput.equalsIgnoreCase("q")){
                    System.out.println("toplam " + toplam +"\n"+ counted +  " defa da ");
                    flag = false;
                }else {
                    System.out.println("Hatali giris yaptiniz ! ");

                }
            }
        }


    }
}
