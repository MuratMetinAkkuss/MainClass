package Day13_arrays;

public class C05_ArraydekiEnBuyukSayiyiBulma {
    public static void main(String[] args) {
        //verilen int array'deki en buyuk sayiyi bize donduren bir method olustur

        int[]arr = {2,4,6,8,1,3,7,5};
        System.out.println(enBuyuksayi(arr));

    }
    public static int enBuyuksayi(int[]arr){

        int enBuyuk=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>enBuyuk){
                enBuyuk = arr[i];
            }
        }
        return enBuyuk;
    }
}
