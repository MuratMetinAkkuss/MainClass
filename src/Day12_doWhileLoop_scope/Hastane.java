package Day12_doWhileLoop_scope;

public class Hastane {


    static String hastaneIsmi = "Yildiz Hastanesi";
    static int personelSayisi;
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;

    /*
        Class Level'da olusturulan variable'lar
        -eger tum nesneler icin ortak ise static olarak
        -her bir nesne icin farkli olacaksa instance
        olusturulur.

        bu hastanede 500 personel varsa
        500 personel icin 500 isim, 500 adres, 500 telefon variable'i olmak
        zorundadir.
        Java bunu su sekilde cozmus:

        bu class'tan bir obje olusturuldugunda
        Java tum instance variable'larin bir kopyasini olusturup
        o obje ile ilintilendirir

        Tum class Level variable'lar icin
        deger atama mecburiyeti yoktur.
        eger deger atanirsa o deger gecerlidir
        ancak deger atanmazsa java class level variable'lar icin
        default olarak belirledigi degerleri atama yapar

        sayisal variable'lar:0
        boolean : false
        char : hiclik
        non-primitve'ler : null

     */


    public static void main(String[] args) {


        Hastane aysehemsire = new Hastane();
        aysehemsire.personelIsmi="ayse";
        aysehemsire.personelAdresi="yok";
        aysehemsire.personelTelefonu="1233231";
        System.out.println(aysehemsire.personelIsmi);

    }
}
