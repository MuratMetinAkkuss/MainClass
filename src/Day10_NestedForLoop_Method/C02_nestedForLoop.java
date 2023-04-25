package Day10_NestedForLoop_Method;

public class C02_nestedForLoop {
    public static void main(String[] args) {

         /*
            verilen satir ve sutun sayisina uygun olarak
            asagidaki sekli yazdirin

            ornek : satir 4 , sutun 5

            * * * * *
            * * * * *
            * * * * *
            * * * * *
         */

        int satirSayisi = 4 ;
        int sutunSayisi = 5 ;

        for (int i = 1; i <= satirSayisi ; i++) {
            for (int j = 1; j <= sutunSayisi ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }






















    }
}
