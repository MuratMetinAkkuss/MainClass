package Day10_NestedForLoop_Method;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        /*
        verilen sayi icin asagidaki sekli olsuturn

        int sayi = 4 ;

        1
        1 2
        1 2 3
        1 2 3 4
         */

        int sayi = 4 ;

        for (int i = 1; i <= sayi; i++) {// outer ==> satirlari
            for (int j = 1; j <= i ; j++) {// inner ==> sutunlari
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }









    }
}
