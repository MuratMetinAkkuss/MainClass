package Day21_dateTime_varargs;

public class C06_Varargs {

    public static void main(String[] args) {

        // iki tam sayiyi toplayip yazdiran bir mehod olsturun

        topla(5,6);
        topla(5,6,2);

    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Sayilarin toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2){
        System.out.println("Sayilarin toplami : " + (sayi1+sayi2));
    }
}
