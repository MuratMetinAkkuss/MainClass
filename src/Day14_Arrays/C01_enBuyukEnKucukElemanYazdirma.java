package Day14_Arrays;

import java.util.Arrays;

public class C01_enBuyukEnKucukElemanYazdirma {
    public static void main(String[] args) {
        /*
            bir arrayin en buyuk ve en kucuk elamini yazdirin
         */

        int[] arr = {3,6,8,5,4,3,4,6,7,5,3,2,6,8,90,3};
        System.out.println(Arrays.toString(arr));
        enBuyukEnKucukEleman(arr);

        //icerisinde sayilar degil yazilar icin de gecerli, sort kullanabiliriz
        String[]arrStr={"ali","veli","hasan"};
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));
    }

    public static void enBuyukEnKucukEleman(int[]arr){
        //arrays class'indan sort method'u ile elemanlari siraladik
        Arrays.sort(arr);
        //siraladiktan sonra en kucuk eleman basta olacagi icin
        System.out.println("Arrayin en kucuk elamani: " + arr[0]);
        //siralandiktan sonra en buyuk eleman en sonda olacagi icin
        System.out.println("Arrayin en buyuk elemani: " + arr[arr.length-1]);


    }
}
