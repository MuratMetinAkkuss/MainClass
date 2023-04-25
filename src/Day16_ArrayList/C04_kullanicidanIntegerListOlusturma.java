package Day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_kullanicidanIntegerListOlusturma {
    //kullanicidan integer list olusturup donduren bir method olusturun

    public static void main(String[] args) {

        System.out.println(sayiAlma());
    }

    public static List<Integer> sayiAlma(){
        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        List<Integer> yeniList = new ArrayList<>();


        do {
            System.out.println("Lutfen bir sayi giriniz");
            girilenSayi = scanner.nextInt();
            if (!(girilenSayi == 0)){
                yeniList.add(girilenSayi);
            }
        }
        while (!(girilenSayi==0));


       return yeniList;
    }

}
