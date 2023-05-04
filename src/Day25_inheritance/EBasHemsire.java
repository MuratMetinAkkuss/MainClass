package Day25_inheritance;

public class EBasHemsire extends DHemsire{
    EBasHemsire(){
        System.out.println(adres);//adres belirtilmedi
        adres = "Cankaya";
        System.out.println(gorev);
        System.out.println("Genel gorev : "+ super.gorev);
        isim = "Ayse";
        System.out.println(this.isim);//Ayse
        System.out.println(super.isim);//Ayse
        this.maas();
        super.maas();
        nobet();
        this.nobet();
        super.nobet();





    }
    String gorev ="Bas Hemsire";
    String adres = "Adres belirtilmedi";

    public void maas(){
        System.out.println("Bas Hemsire maasi : " + 3000);
    }
    public void nobet(){
        System.out.println("Bashemsireler ayda 3 gun nober tutar");
    }

    public static void main(String[] args) {
        EBasHemsire basHemsire1 = new EBasHemsire();
        //System.out.println(basHemsire1.adres);



    }
}
