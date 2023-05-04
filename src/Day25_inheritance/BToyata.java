package Day25_inheritance;

public class BToyata extends Araba{

    BToyata (int i){
        this();
        System.out.println("toyata int parametreli constructor calisti");
    }
    BToyata (){
        System.out.println("toyata constructor calisti");
    }

    String str ="Toyata";
    String markaToyata="Toyata";
}
