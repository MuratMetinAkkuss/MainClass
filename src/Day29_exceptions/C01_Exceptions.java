package Day29_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //kullanicidan iki tam sayi alip
        //ilk sayiyi ikicniye bolun
        //sonucu yazdirin

        /*
            Kodlarimizi yazarken
            kullancii tarafindan yapilabilecek hatalari
            Ongorebiliyorsak, javaya ongorebildigimiz hata ihtimalleri icin
            yapmasi gerekenleri soyleyebiliriz.

            ornegin asagidaki bolme isleminde kullanicinin sifir girme ihtimalini
            if else ile handle edebiliriz

            ancak tum sorunlari if else ile cozmek mumkun degildir.
            ornegin istenen data turune uygun olmayan bir input girilmesi
            if else ile cozemeyiz

            java ongorulen hatalari cozebilecek icin
            exception interface ni olusturmustur
         */
        System.out.println("Lutfen bolunecek tamsayiyi yazin");
        int s1 = scanner.nextInt();

        System.out.println("Bolecek sayiyi yaziniz: ");
        int s2 = scanner.nextInt();

        System.out.println("iki sayinin bolme sonucu : " + s1/s2);
    }
}
