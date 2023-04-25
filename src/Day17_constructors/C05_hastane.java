package Day17_constructors;

public class C05_hastane {
    /*
        Bir class'da gorunurde constructor yoksa
        default constructor vardir.

        default constructor parametresiz constructor'dir
        ve body'sinde hic bir kod bulunmaz

        default constructor asagida verilen constructor'a benzer
        C05_hastane(){
        }

        ancak bir constructor gorunur ise
        artik ona default constructor demeyiz.
        parametresi yoksa ona parametresiz constructor diyebiliriz.

        biz herhangi bir constructor olusturursak
        java default constructor'i siler
        yani bir class'da gorunur bir constructor varsa
        DEFAULT CONSTRUCTOR yoktur diyebiliriz.


     */

    @Override
    public String toString() {
        return "C05_hastane{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", personelTuru='" + personelTuru + '\'' +
                '}';
    }

    C05_hastane(){
        System.out.println("Parametresiz kod calisti");
    }
    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "031233333333";
    String personelIsmi = "Isim belirtilmedi";
    String personelAdresi = "Adres Belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";
    String personelTuru = "Personel turu belirtilmedi";

    public int maas(){

        switch (personelTuru){

            case "Doktor" :
                return 5000 ;

            case "Hemsire" :
                return 3000 ;

            case "Bashemsire" :
                return 4000 ;

            default:
                return 1900 ;
        }
    }
}
