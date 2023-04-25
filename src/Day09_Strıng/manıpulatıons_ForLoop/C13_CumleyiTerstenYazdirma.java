package Day09_Strıng.manıpulatıons_ForLoop;

public class C13_CumleyiTerstenYazdirma {
    public static void main(String[] args) {
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve
        // String’i tersten yazdirin.

        String str = "Java cooook guzel";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring( i, i+1));
        }

    }
}
