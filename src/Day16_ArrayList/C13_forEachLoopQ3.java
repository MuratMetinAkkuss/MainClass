package Day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C13_forEachLoopQ3 {
    public static void main(String[] args) {
        //// int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        //// verilen array de once cift olan sayilari,
        // sonra da tek olan sayilari for each loop kullanarak
        //farkli listeye ekleyen yazdiran method yapin

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        ciftTekListesi(arr);
    }
    public static void ciftTekListesi(int[] arr ){
        List<Integer> ciftListesi = new ArrayList<>();
        List<Integer> tekListesi = new ArrayList<>();
        //for each ile elemanlara ulas
        for (int each:arr
             ) {
            if (each%2==0){
                ciftListesi.add(each);
            }else {
                tekListesi.add(each);
            }
        }
        System.out.println("cift rakamlar: " + ciftListesi);
        System.out.println("cift rakamlar: " + tekListesi);
    }
}
