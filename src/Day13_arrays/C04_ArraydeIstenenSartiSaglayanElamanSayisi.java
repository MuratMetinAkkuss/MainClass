package Day13_arrays;

public class C04_ArraydeIstenenSartiSaglayanElamanSayisi {
    public static void main(String[] args) {
        int[]arr={2,4,6,8,1,3,2};
        //array'de kac tane cift sayi oldugunu yazdirin

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                System.out.println("cift sayi: "+ arr[i]);
            }
        }
        //verilen array'de 4 ile 8 (sinirlar dahil) arasinda kac sayi
        //oldugunu yazdirin

        int sayac= 0 ;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>=4&&arr[i]<=8){
                sayac++;
            }
        }
        System.out.println("istenen araliktaki sayilar: "+ sayac);


    }

}
