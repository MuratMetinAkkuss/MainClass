package Day09_Strıng.manıpulatıons_ForLoop;

import java.util.Scanner;

public class C01_StrıngManıpulatıon {
    public static void main(String[] args) {
        //oru 1 : Kullanicidan bir cumle alin
        //  - cumlede ev geciyorsa, “home home sweet home” yazdirin
        //  - cumlede is geciyorsa, “calismak guzeldir”
        //  - ikisini de iceriyorsa “Hem ev lazim hem is”
        //  - hicbirini icermiyorsa “cok calisman lazim” yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine().toLowerCase();


        //if-else kullanmaliyiz en kisitlayici olandan baslayalim

        if (cumle.contains("ev") && cumle.contains("is")) System.out.println("hem ev lazim hem is");
        else if (cumle.contains("ev")) {
            System.out.println("home sweet home");


        }


    }
}
