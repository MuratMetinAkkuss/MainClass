package Day23_encapsulation_inheritance;

public class C03_EncapsuleClassRunner {
    /*
        Encapsulation'in temel amaci;
        read ve write permissionlarini ayirmak ve
        istedigimiz class uyesine read,
        istedgimiz class uyesine write
        yetkisi verebilmektir.

        access modifier'i default, protected veya public olanlarda
        read/write yetkilerini ayirmami mumkun degil

        access modifier'i private olan class uyelerine ise
        hic ulasamiyoruz.
        bunu firsata cevirelim
        normal yollarla private bir class uyesine erisilemez
        ama o class uyesine erisebilecek
        ve yetkisi sinirli olan methodlar olusturabiliriz.

     */
    public static void main(String[] args) {
        C02_EncapsuleClass obj = new C02_EncapsuleClass();
        obj.strDefault="Default";
        System.out.println(obj.strProtected);

        System.out.println(obj.getToplamSatisTutari());
        obj.setSatisTutari(4);
        obj.setSatisTutari(200);
        System.out.println(obj.getToplamSatisTutari());
    }
}
