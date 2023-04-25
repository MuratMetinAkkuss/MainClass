package Day13_arrays;

import java.util.Arrays;

public class C02_TumElemntlereErisim {
    public static void main(String[] args) {
        /*
            Bir array'i yazdirmak ile elementlerini yazdirmak farklidir.

         */
        int[] arr={2,4,6,8,1,3,8,2};

        //bu array'i yazdiralim
        System.out.println(Arrays.toString(arr));

        //Array'in tum elementlerini yanyana
        //aralarinda "-" olacak sekilde yazdirin

        System.out.print(arr[0]+"-");
        System.out.print(arr[1]+"-");
        System.out.print(arr[2]+"-");
        System.out.print(arr[3]+"-");
        System.out.print(arr[4]+"-");
        System.out.print(arr[5]+"-");
        System.out.print(arr[6]+"-");
        System.out.print(arr[7]);

        System.out.println("");

        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i]+"-");
        }
        System.out.println(arr[arr.length-1]);







    }
}
