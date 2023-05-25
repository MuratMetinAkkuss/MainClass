package Day30_exceptions;

public class C02_BaziExceptionTurleri {
    public static void main(String[] args) {

        String str =null ; // null bir deger degil, pointer'dir

        //StringIndexOutOfBoundsException
        //ArrayIndexOutOfBoundsException

        String a = "34";// buraya bir harf girersek bize
        //34a yazarsak parsInt() bunu yaziya ceviremez ve exception firlatir.
        //NumberOfException verir.
        String b = "55";
        //a ve b variable'larindaki sayilarin toplamini yazdirin

        int sonuc = Integer.parseInt(a)+Integer.parseInt(b);
        System.out.println(sonuc);

        String str1 = "6";
        Object obj = str1;
        //Integer sayi = (Integer) obj;// ClassCastException


    }
}
