package Day18_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {

        C01_Hastane per1 = new C01_Hastane();
        per1.personelIsmi = "Sevda";
        per1.personelAdresi = "Ankara";
        per1.personelTelefon = "6785655544";
        per1.personelTuru = "Hemsire";
        System.out.println(per1);
        //bir obje olusturuldugunda o objenin ozelliklerini atama yapmazsak
        //class'ta verdigimiz ilk degerleri alacaktir
        //eger o objenin kendine ozgu degerleri olmasini istiyorsak
        //ATAMA yapmaliyiz


        C01_Hastane per2 = new C01_Hastane("Adem","Cankaya","32343242","hemsire");
        System.out.println(per2);


    }
}
