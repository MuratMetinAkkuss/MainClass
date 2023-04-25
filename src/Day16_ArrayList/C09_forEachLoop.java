package Day16_ArrayList;

public class C09_forEachLoop {
    public static void main(String[] args) {
        //Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int [] arr = {3,5,4,3,4};
        kareAlma(arr);

    }
    public static void kareAlma(int [] arr){
        //arrday'de bulunan butun elementlere ulasman gerekiyor
        int toplam = 0 ;

        for ( int each: arr
             ) {
            //elementlerin karelerinin toplamini hesaplamak gerekiyor
            toplam = toplam + each*each;
        }
        System.out.println("arrayin elemanlarinin karelerinin toplami: " + toplam);
    }


}
