package Day15_multiDimensionalArrays;

public class C02_tumElementlereUlasma {
    public static void main(String[] args) {
        
        int[][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};
        
        /* 
            tek katli array'de
            for-loop olusturup
            arr[i] bize tum elementleri getiriyordu
            MDA olunca kat sayisinca ic ice loop olusturmak gerekir
            bizim sorumuzda ic ice 2 loop olusturacagiz
            arr[i][j] bize tum elementleri getirecek
         */
        
        // tum elementleri aralarinda bir bosluk birakarak yazdiralim
        for (int i = 0; i < arr.length ; i++) {//outur loop'u kontrol edecek
            for (int j = 0; j <arr[i].length ; j++) {

                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("===========");

        //Tum elementlerin toplamini yazdirin

        int toplam = 0 ;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                toplam = toplam + arr[i][j];

            }
        }
        System.out.println("Toplam: " + toplam);

        int enBuyuk = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[0][0]<arr[i][j]){
                    enBuyuk = arr[i][j];
                }

            }
        }
        System.out.println(enBuyuk);

        //MDA'daki cift sayilari yazdirin

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                    System.out.print("sirasiyla cift sayilar: "+arr[i][j] + " ");
                }

            }
        }
    }
}
