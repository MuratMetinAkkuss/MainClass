package Day13_arrays;

import java.util.Objects;

public class C08_araBulMethodu {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de
        // istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] sinifListesi={"saida","isa","asil","kubra elif","isa","elif"};
        String arananIsim = "isa";
        aramaMotoru(sinifListesi , arananIsim);
    }
    public static void aramaMotoru(String[] arr, String arananIsim){
        int kackere=0;
        for (int i = 0; i <arr.length ; i++) {
            if (Objects.equals(arananIsim, arr[i])){
                kackere++;
            }
        }
        System.out.println("kullanim miktari: "+kackere);
    }
}
