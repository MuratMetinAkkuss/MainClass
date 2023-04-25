package Day11_methodOverloading_WhileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        /*overloading : asiri yukleme
        bir classta ayni isme sahip birden fazla method olmasina denir

        Java'da bir class icerisinde ayni isim, ayni sayida ve data turunda
        parametre ile olusturulursa Java CTE verir  altini kirmizi

        bunun 3 cozumu vardir
        1- parametre sayisi degistirilebilir
        2- parametrelerin data turleri degistirilebilir
        3- farkli data turunde parametrelerin yeri degistirilebilir

        Java bir method call oldugunda
        ayni isimdeki birden fazla method'dan hangisinin calisacagini belirlemek
        icin argument-parametre uyumuna bakar.
         */


    }
    public static void topla(int sayi1, int sayi2){
        System.out.println("iki sayinin toplami: " + (sayi1+sayi2));

    }
    public static void topla(int sayi1, int sayi2, int sayi3){
        System.out.println("uc int  toplami: " + (sayi1+sayi2));

    }
    public static void topla(char a, char b){
        System.out.println("iki charin toplami: " + (a+b));

    }
    public static void topla(int sayi1, double sayi2){
        System.out.println("iki int ve double toplami: " + (sayi1+sayi2));

    }
    public static void topla(double sayi1, int sayi2){
        System.out.println("iki double ve int toplami: " + (sayi1+sayi2));

    }
}
