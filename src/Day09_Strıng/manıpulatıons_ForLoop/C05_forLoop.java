package Day09_Strıng.manıpulatıons_ForLoop;

public class C05_forLoop {
    public static void main(String[] args) {
        //1'den 100'e kadar(100 dahil) olan sayilari yazdirin

        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + " ");
        }

        //3 basamakli cift sayilari toplayin
        int sayilarTop = 0;
        for (int i = 100; i <1000 ; i+=2) {
            sayilarTop +=i;
        }
        System.out.println("\n" + sayilarTop);

    }
}
