package Day24_inheritance;

public class BToyata extends Araba{
    String marka = "Toyata";
    String uretimYeri = "Uretim yeri belirtilmedi";
    String lastik = "Toyata araclar pirelli lastiklari kullanir";


    public void guvenlik(){
        System.out.println("Toyata araclar ekstra guvenlik donanimlarina sahiptir.");
    }

    public void aku(){
        System.out.println("Toyata araclar inci aku kullanir");
    }



}

