package Day09_Strıng.manıpulatıons_ForLoop;

import java.util.Scanner;

public class C03_stringManipulation {
    public static void main(String[] args) {
        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise,
        // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk,
        // soyismi buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen isminzii giriniz");
        String isim = scanner.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIs = scanner.nextLine();

        if (isim.length()>soyIs.length()){
            System.out.print(isim.toUpperCase().charAt(0)+
                    isim.substring(1).toLowerCase()+" " );
            System.out.print(soyIs.toUpperCase().charAt(0)+
                    soyIs.substring(1).toLowerCase());
        }

        else {
            System.out.print(isim.toUpperCase().charAt(0)+
                    isim.substring(1).toLowerCase()+ " " );
            System.out.print(soyIs.toUpperCase());
        }
    }
}
