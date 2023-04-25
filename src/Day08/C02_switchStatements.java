package Day08;

import java.util.Scanner;

public class C02_switchStatements {
    //kullanicidan 2 basamakli bir sayi alip
    // girilen sayiyi yazi ile yazdirin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 basamakli bir sayi giriniz!!");
        int sayi = scanner.nextInt();

        if (sayi < -100 || (sayi > -10 && sayi < 10) || sayi > 100) {
            System.out.println("Tekrar deneyiniz !!");
        } else {
            if (sayi < 0) {
                System.out.println(sayi *= -1);
            }
        }

        switch (sayi / 10) {
            case 1:
                System.out.print("on ");
                break;
            case 2:
                System.out.print("yirmi ");
                break;
            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.print("kirk ");
                break;
            case 5:
                System.out.print("elli ");
                break;
            case 6:
                System.out.print("altmis ");
                break;
            case 7:
                System.out.print("yetmis ");
                break;
            case 8:
                System.out.print("seksen ");
                break;
            case 9:
                System.out.print("doksan ");
                break;
        }
        switch (sayi % 10) {
            case 1:
                System.out.println("bir ");
                break;
            case 2:
                System.out.println("iki ");
                break;
            case 3:
                System.out.println("uc ");
                break;
            case 4:
                System.out.println("dort ");
                break;
            case 5:
                System.out.println("bes ");
                break;
            case 6:
                System.out.println("alti ");
                break;
            case 7:
                System.out.println("yedi ");
                break;
            case 8:
                System.out.println("sekiz ");
                break;
            case 9:
                System.out.println("dokuz ");
                break;
        }






    }
}
