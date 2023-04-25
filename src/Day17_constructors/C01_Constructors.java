package Day17_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Constructors {

    String str = "constructor";
    int sayi = 10 ;

    static boolean isHappy = true ;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>  isimler =     new           ArrayList<>();
      //datanin turu  obje ismi     keyword       constructors


      // constructor bir class'dan obje olusturmak icin kullandigimiz ozel bir
      //java yapisidir

      //constructor method'a benzer ama method degildir.




    }

    static public void staticMethod(){

        System.out.println("selamlar canlar C01 static method calisti");

    }

    public void staticOlmayanmethod(){
        System.out.println("C01 Static olmayan method calisti");
    }

}
