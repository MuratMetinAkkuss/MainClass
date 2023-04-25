package Day08;

public class C08_nullPointer {
    public static void main(String[] args) {

        /*
        null bir pointerdir
        null bir deger degildir
        non-primitive datalara deger atanmadigini isaret eder
         */

        String str;
        //deger atanmadigi icin yazdiramiyoruz.
        //System.out.println(str); // CTE // deger atama yapilmadan yazdiralamaz

        /*
        yinede deger atamasi yapmadan,
        bos olarak kalmasini, lakin en azindan yeri geldigi zaman
        en azindan yazdirilabilmesini istiyorsak null pointer kullanilir.
         */

        str = null;
        //str'a hic bir defer atanmadi, sadece bos oldugunu
        //sadece bos oldugunu javaya bildirdik

        System.out.println(str);
        //null
        //icinde hic bir sey olmamasina karsin mull pointer ile
        //gosterildigi icin
        //en azindan yazdirma islemi yapilabiliyor.


        /*
        yazdirma gibi islemlerde hata vermemesi icin bos defer
        null atamasi yapilir
         */

        //str.concat("Ali"); //NullPointerException
        // null olan bir deger ile metodlar kullanilaz

        String test = ""; // burada testin icinde "" kayit altina alinmis
        System.out.println(test.length());

        System.out.println(str+"Ali");

        // str = null ,,, test ="";

        //System.out.println(str.isEmpty());
        //null pointer exception olmayan bir seyin
        //bos olup olmadigini kontrol edemeyiz
        System.out.println(test.isEmpty());// true

        /*
        null atamasi yapilan bir variable hic bir sekilde
        method ile kullanilmaz!!
        sadece yazdirilabilir ve + ile kullanilabilir
        aslinda hata vermedigi icin + ile kullanabiliriz
         */




    }
}
