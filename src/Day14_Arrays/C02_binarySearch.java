package Day14_Arrays;

import java.util.Arrays;

public class C02_binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,6,8,5,4,3,4,6,7,5,3,2,6,8,90,3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------");
        System.out.println(Arrays.binarySearch(arr, 5));
    }
}
