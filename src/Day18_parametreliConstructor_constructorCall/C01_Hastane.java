package Day18_parametreliConstructor_constructorCall;

public class C01_Hastane {
    public C01_Hastane(String isim){

    }
    public C01_Hastane(){

    }
    public C01_Hastane(String ism,String Adress,String telefon, String Tur ){
        personelIsmi = ism;
        personelAdresi = Adress;
        personelTelefon = telefon;
        personelTuru = Tur;

    }
    @Override
    public String toString() {
        return "C01_Hastane{" +
                "\npersonelIsmi='" + personelIsmi + '\'' +
                ", \npersonelAdresi='" + personelAdresi + '\'' +
                ", \npersonelTelefon='" + personelTelefon + '\'' +
                ", \npersonelTuru='" + personelTuru + '\'' +
                '}';
    }

    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "031233333333";
    String personelIsmi = "Isim belirtilmedi";
    String personelAdresi = "Adres Belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";
    String personelTuru = "Personel turu belirtilmedi";

    public int maas(String personelTuru){

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
