package Day10_NestedForLoop_Method;

public class C08_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {
        /*
        Java OOP konseptin en buyuk avantaji
        proje icerisinde 1 kere olusturulan Method'un
        her yerden kullanilabilir olmasidir.

        Baska bir class'dan static keyword kullanilarak olsuturulan Method'lara
        classIsmi.methodismi(parametreler) seklinde ulasabilir
         */

        C07_methodOlusturma.ikiSayiTopla(5,100);

        C09_FaktoriyelDegeriBulma.faktoryelDegeriYazdir(5);

        C10_AsalSayiSonucuYazdir.asalSayiMi(57);

    }
}
