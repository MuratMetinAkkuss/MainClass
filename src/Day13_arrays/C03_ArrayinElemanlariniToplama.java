package Day13_arrays;

import java.util.Arrays;

public class C03_ArrayinElemanlariniToplama {


    public static void elemanlarinToplaminiYazdir(int[]arr){
        int toplam=0;

        for (int j : arr) {
            toplam += j;
        }
        System.out.println("Array'deki elementlerin toplami: "+toplam);

    }
    public static void main(String[] args) {
        /*
            verilen int array'in tum elementlerini toplayip
            sonucu yazdiran bir method olusturun
         */
        int[]arr={2,4,6,8,1,3,2};

        elemanlarinToplaminiYazdir(arr);

    }
}
