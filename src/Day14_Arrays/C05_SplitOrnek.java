package Day14_Arrays;

import java.util.Arrays;

public class C05_SplitOrnek {
    public static void main(String[] args) {
        String str = "Java yilin bu zamanlarinda bir baska guzel oluyor. java olmadan java ogrenilmez";


        //1kelimeleri ayir
        //loop ile kelimeleri ayir
        //kac tane var bunlari yazdiracagiz

        String[]arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        int sayac = 0 ;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].equalsIgnoreCase("java")){
                sayac ++;
            }

        }
        System.out.println(sayac + " tane Java icermektedir.");
    }
}
