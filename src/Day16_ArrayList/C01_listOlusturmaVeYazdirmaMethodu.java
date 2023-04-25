package Day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_listOlusturmaVeYazdirmaMethodu {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Sefa");
        isimler.add("Erhan");

        //Method call
        listeYazdirma(isimler);

    }
    //Sadece konsola yazi yazdiracaksak void return type kullanilir
    public static void listeYazdirma(List<String> isimler){

        System.out.println(isimler);


    }

}
