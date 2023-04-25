package Day09_Strıng.manıpulatıons_ForLoop;

import java.util.Scanner;

public class C04_String_Manipulations {
    public static void main(String[] args) {
        //Soru 6 : Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise
        // ortadaki harfi silin ve yerine :disappointed: yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scanner.nextLine();

        if (str.length() % 2 == 0 ){
            System.out.println();
        }
    }
}
