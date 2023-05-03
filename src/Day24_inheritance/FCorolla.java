package Day24_inheritance;

public class FCorolla extends EToyata{
    FCorolla(){
        System.out.println("Coralla constructor calisti");
    }

    String str= "Coralla";
    String modelCoralla="Coralla";
    public static void main(String[] args) {

        FCorolla coralla = new FCorolla();
        System.out.println(coralla.modelCoralla);
        System.out.println(coralla.markaToyata);
        System.out.println(coralla.motorAraba);


    }
}

/*
        Bir obje olusturuldugunda
        constructor calisir ve
        class level'da var olan variable'larin
        bir kopyasi olusturulup objeye ilisiklendirilir.

 */