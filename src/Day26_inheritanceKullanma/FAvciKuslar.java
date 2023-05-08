package Day26_inheritanceKullanma;

public class FAvciKuslar extends EKuslar{
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        FAvciKuslar avciKus1 = new FAvciKuslar();
        avciKus1.cogalma();//kuslar - yumurtayla cogalir.
        avciKus1.beslenme();//avci = etle beslenir.
        avciKus1.kanat();// kuslar - kanatlari vardir
        avciKus1.omur();//hayvan - yasar ve olurler
        avciKus1.gaga();
        avciKus1.hareket();
        avciKus1.pence();
        avciKus1.solunum();

        EKuslar eKuslar = new FAvciKuslar();

        DHayvan dHayvan = new FAvciKuslar();

    }

    /*
        asagidaki 3 obje de ayni constructor'i kullanmistir.
              yani 3'de avci kustur

              ama data turu farkli secildigi icin 3'u de farkli ozellikler verir

              bir obje olsturulurken eger construct
              ve data turu ayni ise o class'a gidilir
              aranan ozellik varsa kullanilir
              yoksa parent class'lara da bakilir ilk bulunan METHOD
              gecerli olur.
              Aramaya DataType secilen class'dan baslanir
              ***Ancak METHOD bulununca hemen calistirilmaz
              dataType secilen class'dan cons secilen class'a dogru
              o Method'un en gucel haline kadar inerek onu calistirir.



     */


    /*
    Asagidaki 3 obje de ayni constructor ile yapilmistir

    Ama data turu farkli secildigi icin ozellikleri farkli olur

            *****
    Bir obje olusturulurken
            -   eger constructor ve data turu ayni ise
    o class'a gidilir.
    aranan ozellik varsa kullanilir,
    yoksa parent class'lara da bakilir ilk bulunan ozellik
    METHOD gecerli olur.
    ***
    - eger cons ve data type farkli ise
        aramaya data type secilen class'dan baslanir.
        Ancak method bulununca hemen CALISTIRILMAZ.
        data type kullanilan noktadan constructor'in class'ina dogru

             */
}
