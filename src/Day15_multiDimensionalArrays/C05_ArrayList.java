package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class C05_ArrayList {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("ayse");
        isimler.add("sevda");
        isimler.add("isa");
        isimler.add("metin");

        System.out.println(isimler);

        //Verilen bir array'deki elementleri yazdiralim
        //ancak tekrar eden elementler varsa sadece 1 kere yazdirin

        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {

            if (!tekrarsizListe.contains(sayilar[i])){

                tekrarsizListe.add(sayilar[i]);

            }

        }
        System.out.println(tekrarsizListe);


    }

}
