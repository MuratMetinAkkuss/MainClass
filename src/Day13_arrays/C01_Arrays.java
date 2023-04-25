package Day13_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        String[]arr1 = {"Ayten","Sevda","Adem"};
        //Array'i yazdirmak istersek

        System.out.println(arr1);
        //arr birden fazla element icerdiginden direkt yaazdirmaya izin
        //vermez

        //Yazdirmak istersek Arrays class'indan toString() kullanmaliyiz
        System.out.println(Arrays.toString(arr1));
        /*
            koseli parantez icinde elementleri yaazdirir
            elemtler arasinda bir virgul ve bir space birakir
         */

        //bir array'in uzunluguna ulasmak istersek
        //Array'de kac tane elemt oldugunu gosterir
        //method degil variable'dir yaninda () yok
        System.out.println(arr1.length);

        int[] arr2 = new int[6];
        //burada elemtlere deger atanmadigi icin
        //yazdirildiginda sifir cikacaktir

        arr2[0]=5;
        arr2[3]=9;
        arr2[4]=1;

        //burada atama yapilan degerler belirtilen yerlere atanir

    }
}
