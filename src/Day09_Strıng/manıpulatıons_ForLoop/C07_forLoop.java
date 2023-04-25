package Day09_Strıng.manıpulatıons_ForLoop;

public class C07_forLoop {
    public static void main(String[] args) {
        //verilen iki sayi ve aralarindaki tum sayilari toplayip yazdirin
        //iki sayidan hangisinin kucuk oldugu bilinmiyor

        int sayi1 = 20;
        int sayi2 = 900;
        int toplam = 0;

        if (sayi1 > sayi2) {
            for (int i = sayi1; i >= sayi2; i--) {
                toplam += i;
            }
        } else {
            for (int i = sayi2; i >= sayi1; i--) {
                toplam += i;

            }
        }
        System.out.println(toplam);
    }
}
