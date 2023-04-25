package Day12_doWhileLoop_scope;

public class C05_localVariables {

    /*Kural1- local variable'lar sadece kendi scop'larinda gecerlidir.
              bir method'da olusturulan variable baska bir Method'da kullanilamaz

      kural2-Local bir scope'da deger atamadan local variable
             olusturabilirsiniz ancak deger atamadan kullanamazsiniz

      kural3-bir loop icinde olusturulan variable'lar sadece o loop
             icerisinde gecerlidir.
             o loop disinda kullanilamaz
             bunlara Loop Variable denir
     */

    public static void main(String[] args) {
        int sayi = 10 ;
        String slogan="Java candir";

        String s;

        for (int i = 0; i <10; i++) {
            int sayi2=10;
            System.out.println(sayi2+1);
        }
        //for loop icerisinde i ve sayi 2 isminde 2 local variable
        //olusturulmustur.
        //loop disinda bunlari kullanalim

    }

    public static void staticMethod(){
        String str = "java mutluluktur";

        String s;






    }

    public void staticOlmayanMethod(){
        boolean yeterMi = true ;


    }
}
