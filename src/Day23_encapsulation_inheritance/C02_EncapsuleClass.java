package Day23_encapsulation_inheritance;

public class C02_EncapsuleClass {

    private int satisTutari;
    private int toplamSatisTutari;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    //buraya private class uyesine erisim saglamak icin bir method konulacak
    //read/write yetkisi verebilecek iki farkli method olusturalim.

    //satis tutari baska class'dan write edilebilsin
    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari+=satisTutari;
    }


    //toplamSatisTutari baska class'dan read edilebilsin


    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
}
