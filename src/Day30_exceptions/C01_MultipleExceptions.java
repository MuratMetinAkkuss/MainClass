package Day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions {
    public static void main(String[] args) {


        try {

            FileInputStream fis = new FileInputStream("src/Day29_exceptions/deneme.txt");
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu hatali, dosyaya erisilemedi");

        } catch (IOException e) {

            System.out.println("Dosyaya erisim ve okuma ile ilgili bir hata var.");
        }

        /*
        eger parent child iliskisi olan birden fazla exception turunu
        try- catch ile handle etmek istersek
        1- ic ice yapabiliriz, 2 try catch blogu olusturabiliriz
        2- eger bir try birden fazla catch blogu olusutracaksak
            once child exception icin catch blogu yazmaliyiz
            sonra parent exception icin catch blogu koymaliyiz
            cunku parent'dan sonra chil yazarsak
            parent'in yakalayamayip, child'in yakalayacgi
            exception olmayacagindan java child exception'i silmemizi ister

        3- child exxception icin catch yazmadan
            sadece parent icin bir tane catch blogu yazmakta yeterli olur.
         */
    }
}
