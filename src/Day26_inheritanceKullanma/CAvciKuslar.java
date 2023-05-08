package Day26_inheritanceKullanma;

public class CAvciKuslar extends BKuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
        /*
              asagidaki 3 obje de ayni constructor'i kullanmistir.
              yani 3'de avci kustur

              ama data turu farkli secildigi icin 3'u de farkli ozellikler verir

              bir obje olsturulurken eger construct
              ve data turu ayni ise o class'a gidilir
              aranan ozellik varsa kullanilir
              yoksa parent class'lara da bakilir ilk bulunan variable
              gecerli olur
              cons ve data turu farkli ise
              obje constructor olan class'dan olusturulsa da
              ozelliklerin data turu olan class'daki gibi olmasini
              isteriz. bir VARIABLE'in degerini armaya data turu olan
              class'dan baslar.

              bir obje olusturulurken data turu constructur'dan farkli ise
              tum variable'lari DataTuru olan class'a gore dusunmeliyiz


         */

        CAvciKuslar avci1 = new CAvciKuslar();
        System.out.println(avci1.beslenme);//avci-et yerler
        System.out.println(avci1.gaga);// avci-sivri gagli
        System.out.println(avci1.cogalma);//kus-yumurtayla cogalir
        System.out.println(avci1.kanat);//kus-kanatlidir
        System.out.println(avci1.hareket);//avci-ucarlar
        System.out.println(avci1.pence);//avci-pencelidir.
        System.out.println(avci1.solunum);//kus-akcigerle nefes alirlar
        System.out.println(avci1.omur);//hayvan-yasar ve olurler


        BKuslar avciKusgiller = new CAvciKuslar();
        //avcikuslar is a kuslar
        System.out.println(avciKusgiller.beslenme);//avci-et yerler
        System.out.println(avciKusgiller.gaga);// avci-sivri gagli
        System.out.println(avciKusgiller.cogalma);//kus-yumurtayla cogalir
        System.out.println(avciKusgiller.kanat);//kus-kanatlidir
        System.out.println(avciKusgiller.hareket);//avci-ucarlar
        //System.out.println(avciKusgiller.pence);//avci-pencelidir.
        System.out.println(avciKusgiller.solunum);//kus-akcigerle nefes alirlar
        System.out.println(avciKusgiller.omur);//hayvan-yasar ve olurler


        AHayvan avciHayvangiller = new CAvciKuslar();
        //avciKuslar is-a hayvan
        System.out.println(avciHayvangiller.beslenme);//avci-et yerler
        //System.out.println(avciHayvangiller.gaga);// avci-sivri gagli
        System.out.println(avciHayvangiller.cogalma);//kus-yumurtayla cogalir
        //System.out.println(avciHayvangiller.kanat);//kus-kanatlidir
        System.out.println(avciHayvangiller.hareket);//avci-ucarlar
        //System.out.println(avciHayvangiller.pence);//avci-pencelidir.
        System.out.println(avciHayvangiller.solunum);//kus-akcigerle nefes alirlar
        System.out.println(avciHayvangiller.omur);//hayvan-yasar ve olurler




        /*
            Asagidaki 3 obje de ayni constructor ile yapilmistir

            Ama data turu farkli secildigi icin ozellikleri farkli olur

            *****
            Bir obje olusturulurken
            -   eger constructor ve data turu ayni ise
                o class'a gidilir.
                aranan ozellik varsa kullanilir,
                yoksa parent class'lara da bakilir ilk bulunan ozellik
                VARIABLE gecerli olur.
            *****
            - cons ve data turu farkli ise
              obje cons olan class'dan olusturulsa da ozelliklerini
              DATA TURU olan class'daki gibi olmasini isteriz
              Bir VASRIABLE'in degerini aramaya DATA TYPE olan class'dan baslanir

             *****
             Bir obje olusturulurken DATA TYPE cons'dan farkli ise
             tum VARIABLE'lari DATA TYPE'dan gelenlere gore dusunmeliyiz



        CAvciKuslar avci1 = new CAvciKuslar();
        System.out.println(avci1.beslenme);
        System.out.println(avci1.gaga);
        System.out.println(avci1.cogalma);
        System.out.println(avci1.kanat);
        System.out.println(avci1.hareket);
        System.out.println(avci1.pence);
        System.out.println(avci1.solunum);
        System.out.println(avci1.omur);

        BKuslar avciKusgiller = new CAvciKuslar();
        System.out.println(avciKusgiller.beslenme);
        System.out.println(avciKusgiller.gaga);
        System.out.println(avciKusgiller.cogalma);
        System.out.println(avciKusgiller.kanat);
        System.out.println(avciKusgiller.hareket);
        //System.out.println(avciKusgiller.pence);
        System.out.println(avciKusgiller.solunum);
        System.out.println(avciKusgiller.omur);

        AHayvan avciHayvangiller = new CAvciKuslar();
        //AvciKuslar is-a hayvan
        System.out.println(avciHayvangiller.beslenme);
        //System.out.println(avciHayvangiller.gaga);
        System.out.println(avciHayvangiller.cogalma);
        //System.out.println(avciHayvangiller.kanat);
        System.out.println(avciHayvangiller.hareket);
        //System.out.println(avciHayvangiller.pence);
        System.out.println(avciHayvangiller.solunum);
        System.out.println(avciHayvangiller.omur);

         */
    }
}
