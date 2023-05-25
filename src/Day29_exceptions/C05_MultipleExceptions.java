package Day29_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    //elimzide input olarak verilmis bir string ve sayilardan olusan bir array var


    //kullanicidan pozitif bir tamsayi isteyin
    //verilen tamsayiyi index olarak kullanip
    //String ve Array den o index'deki harf ve sayilari yazdirin

    /*
        eger birden fazla exception olusma ihtimali varsa
        ve bu exceptionlar arasinda parent child iliskisi yoksa
        3 farkli yaklasim kullanabiliriz

        1- iki farkli exception ihtimali icin 2 farkli try-Catch olusturabiliriz.

        2- bir try iki tane catch blogu kullanarak bir duzen olusturabiliriz

        3-2 exceptioni kapsayan tek bir exception varsa onu kullanarak
        sorunu cozebiliriz.


     */

    public static void main(String[] args) {
        String str = "Java her seyi dusunmus";
        int[] sayilar = {2, 4, 1, 2, 3, 312, 321, 12, 21, 3, 34, 33};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olarak poziitif bir tamsayi giriniz:");
        //kullanici duzgun tam sayi girecek
        int index = scanner.nextInt();
        /*
        System.out.println("istenen indexdeki degerler " +
                str.charAt(index) + " " + sayilar[index]
        );

         */
/*
        //1. yontem
        System.out.println("istenen indexdeki degerler");
        scanner.nextLine();

        try {
            System.out.println(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("verilen index sinirlar disinda");
        }

        try {
            System.out.println(sayilar[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verilen index array sinirlari disinda");
        }

 */
        //2. Yontem olarak
        //bir try birden fazla catch oldugunda
        //biri calistiginda otekilere bakmayacaktir.
/*
        try {
            System.out.println("istenen indexdeki degerler " +
                    str.charAt(index) + " " + sayilar[index]
            );
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("verilen index sinirlar disinda");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Verilen index array sinirlari disinda");
        }

 */
        //3.yontem
        try {
            System.out.println("istenen indexdeki degerler " +
                    str.charAt(index) + " " + sayilar[index]
            );
        } catch (RuntimeException e) {
            System.out.println("verilen index sinirlar disinda");
        }
    }
}
