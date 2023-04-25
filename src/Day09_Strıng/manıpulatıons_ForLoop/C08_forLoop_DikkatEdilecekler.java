package Day09_Strıng.manıpulatıons_ForLoop;

public class C08_forLoop_DikkatEdilecekler {
    public static void main(String[] args) {
        //verilen ilk deger bitis sartini saglamiyorsa

        for (int i = 10; i <0 ; i++) {
            System.out.println(i);
        }
        //kod calsiri ancak ilk deger icin bitis sarti saglanmadigi icin
        //loop body calismaz, olu dogar

        //baslangic degeri ve artis azalis miktari ile
        //bitis sarti hic saglanamazsa
       // for (int i = 10; i >= 0 ; i++) {
            //System.out.println(i);
       // }
        //buna sonsuz loop denir.
        //makinenin rami dolana kadar calismaya devam eder
    }
}
