package Day08;

import java.util.Scanner;

public class C04_StringManipulation {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa,
        // "mailde yazim hatasi var" yazdirin.


        //eger testlerin boyle yapilmasini istiyorsak bu sekilde
        //ayri ayri yapmamiz gerekiyor
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir mail giriniz");
        String email = scanner.next();

        if (!(email.contains("@"))){
            System.out.println("Gecersiz mail");
        }
        if (!(email.contains("@gmail.com"))){
            System.out.println("mail gmail olmali");
        }
        if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi");
        }else {
            System.out.println("surec baslamistir");
        }


    }
}
