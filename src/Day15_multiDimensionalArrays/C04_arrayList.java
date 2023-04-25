package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C04_arrayList {
    public static void main(String[] args) {

        //Array uzunlugu degistirilemedigi icin calisma ortaminda pek tercih edilmez
        //java ekleme ve silme yapabilecegimiz bir yapi olusturmustur
        //arraylist, array altyapisini kullanir ama uzunluk acisindan esnektir
        //bir arraylist olusturmak istersek

        List<Integer> sayilar = new ArrayList<>();

        // Arraylist'in tek dezavantaji
        // elementleri tek tek zorunda olmamizdir.

        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(6);
        System.out.println(sayilar);





    }
}
