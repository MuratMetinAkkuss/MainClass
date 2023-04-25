package Day10_NestedForLoop_Method;

public class C03_nestedForLoop {
    public static void main(String[] args) {

        /*
        verilen bir sayi icin asagidaki tabloyu olusturun
        orn : sayi = 3

        1*1 1*2 1*3
        2*1 2*2 2*3
        3*1 3*2 3*3


         */

        int sayi = 3 ;

        for (int i = 1; i <= sayi ; i++) {//satirlari kontrol eder loop(outer)
            for (int j = 1; j <= sayi; j++) {//sutunlari kontrol eder loop(inner)
                System.out.print(i+"*"+j+" ");

            }
            System.out.println(" ");
        }

/*
        verilen iki sayi icin asagidaki tabloyu olusturun
        orn : a = 3
              b = 4

        1*1 1*2 1*3 1*4
        2*1 2*2 2*3 2*4
        3*1 3*2 3*3 3*4


         */

        System.out.println("=====================");

        int a = 3 ;
        int b = 4 ;

        for (int i = 1; i <= a ; i++) {//satirlari kontrol eder loop(outer)
            for (int j = 1; j <= b; j++) {//sutunlari kontrol eder loop(inner)
                System.out.print(i+"*"+j+" ");

            }
            System.out.println(" ");
        }















    }
}
