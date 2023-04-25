package Day09_Strıng.manıpulatıons_ForLoop;

public class C11_forLoop_AsalSayi {
    public static void main(String[] args) {
        // verilen bir sayinin asal sayi olup olmadigini yazdirin

        int sayi = 97;
        boolean asalMi = true;

        for (int i = 2; i <sayi-1 ; i++) {
            if (sayi%i==0){
                asalMi = false;
                break;
            }
        }
        /*
        bir loopun calismasini durdurmak isterseniz break yazabilirsiniz
         */
        if (asalMi){
            System.out.println("sayi asal");
        }else {
            System.out.println("sayi asal degildir");
        }

    }
}
