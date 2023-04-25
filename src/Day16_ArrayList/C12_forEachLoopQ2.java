package Day16_ArrayList;

import java.util.Scanner;

public class C12_forEachLoopQ2 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String str = scanner.nextLine();
        System.out.println("aranacak kelmeyi giriniz:");
        String aranacakHarf = scanner.next();
        int sayac = 0  ;

        String[] arr = str.split("");

        for (String each:arr
             ) {
            if (each.equalsIgnoreCase(aranacakHarf)){
                sayac++;
            }
        }
        System.out.println(sayac + " kere kullanilmistir.");
    }
}
