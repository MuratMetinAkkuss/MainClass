package Day16_ArrayList;

public class C11_forEachLoopQ {
    public static void main(String[] args) {
        /*
            bir array icindeki sayilardan 5'den buyuk olanlarini toplayalim
         */
        int[] arr = {2,3,1,4,4,1,2,5,6,7,5,4,3,7,5,4,8,5,3,2,5,7,7,8,6,5,4,6};
        int toplam = 0 ;
        for (int each:arr
             ) {
            if( each > 5 ){
                toplam += each;
            }
        }
        System.out.println(toplam);
    }
}
