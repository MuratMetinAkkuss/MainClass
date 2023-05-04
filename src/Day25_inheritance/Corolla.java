package Day25_inheritance;

public class Corolla extends BToyata{
    Corolla(){

        System.out.println("Coralla constructor calisti");
    }

    Corolla(int sayi){

        System.out.println("Corolla int parametreli constructor calisdi");
    }
    Corolla(String yakit){
        super(5);
        //Parent class'da olmayan bir constructor call yapilirsa
        //Java CTE verir
        System.out.println("Coralla str parametreli constructor calisdi.");
    }
    String str= "Coralla";
    String modelCoralla="Coralla";
    public static  void main(String[] args) {

        //Corolla coralla1 = new Corolla(5);
        Corolla corolla2 = new Corolla("elektrik");


    }
}
