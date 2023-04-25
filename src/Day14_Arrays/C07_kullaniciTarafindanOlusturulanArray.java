package Day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_kullaniciTarafindanOlusturulanArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int arrayBoyutu = scan.nextInt();
        int [] arr = new int[arrayBoyutu];

        int arrayElementi = 0 ;

        for (int i = 0; i <arrayBoyutu ; i++) {
            System.out.println("Lutfen arrayin " + i+". elemanini giriniz.");
            arrayElementi = scan.nextInt();
            arr[i] = arrayElementi;


        }
        System.out.println(Arrays.toString(arr));

    }
}
