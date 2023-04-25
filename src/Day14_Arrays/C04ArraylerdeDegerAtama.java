package Day14_Arrays;

import java.util.Arrays;

public class C04ArraylerdeDegerAtama {
    public static void main(String[] args) {

        String str = "metin";
        str = "selam";

        /*
            array'lerin uzunluklari degistirilemez ama
            bir arrey'e yeni bir array atamasi yapabilirsiniz
         */

        String[] arr = {"Ali","Veli"};
        String[] arr1 = {"A","B","C"};
        //array olustuktan sonra suslu parantez ile atama yapilamaz

        arr = arr1;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        //eski bir array'e atama yapamayiz ama yeni bir array olusturup assign
        //edebiliriz
        arr = new String[5];
        System.out.println(Arrays.toString(arr));

    }
}
