package Day29_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C07_CheckExceptions {
    /*
    java da dosya okuma ve yazma ile exception'lar
    IOexception ==> Input Output
    compile time'da devreye girip bizi uyarir

    java ile bilgisayarmizdaki bir dosyaya ulasmak isterseniz
    dosya yoluna ihtiyacimiz olur.

    dosya yolunu string olarak kaydettikten sonra
    file input string class'indan olsuturacagimiz obje ile
    istedigimiz dosyaya erisebiliriz

    bir check exception olustugunda
    2 sekilde bu irmizi cizgi giderilir
    1- exceptioni try catch ile handle edebilirisiniz
    yani exception olsusa bile calismaya devam etmesini saglayabilirisniz
     2- ben dosya yolundan eminim calismaya devam et exception olusursa
     olsusun diyerek ilerler bunu;


     */
    public static void main(String[] args) throws FileNotFoundException {
        String docRoad = "src/Day29_exceptions/deneme.txt";

        FileInputStream fis = new FileInputStream(docRoad);


    }
}
