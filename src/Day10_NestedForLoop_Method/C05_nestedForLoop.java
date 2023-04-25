package Day10_NestedForLoop_Method;

public class C05_nestedForLoop {
    public static void main(String[] args) {
        /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5 ;


        *
        * *
        * * *
        * * * *
        * * * * *
         */

        int sayi = 5 ;

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }




        String str = "Java candir" ;












    }
}
