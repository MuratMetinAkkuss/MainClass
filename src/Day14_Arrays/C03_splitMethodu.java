package Day14_Arrays;

import java.util.Arrays;

public class C03_splitMethodu {
    public static void main(String[] args) {
        /*
            istedigimiz bir yerden yaziyi bolerek parcaciklari array'e atar


         */
        String str = "Java gercekten cok guzel";
        // kac tane "e" harfi var

        // 1. adim tane tane ayir
        String [] arrStr = str.split("");
        System.out.println(Arrays.toString(arrStr));
        //2. adim loop ile e esit var mi bak
        int sayac = 0 ;
        for (int i = 0; i <arrStr.length ; i++) {
            if (arrStr[i].equals("e")){
                sayac++;
            }

        }
        //3. adim kac tane var hesapla
        System.out.println(sayac+" tane 'e' harfi vardir.");

        System.out.println("method ile k harfi arayalim" );

        arananStringIcindeVarMi(str,"k");


    }



    public static void arananStringIcindeVarMi(String str , String aranan){
        String[] taneTane = str.split("");

        int sayac = 0 ;
        for (int i = 0; i <taneTane.length ; i++) {
            if (taneTane[i].equals(aranan)){
                sayac++;
            }

        }
        System.out.println(sayac+" tane "+aranan+" harfi vardir.");
    }
}
