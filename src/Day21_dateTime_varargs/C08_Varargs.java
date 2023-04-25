package Day21_dateTime_varargs;

public class C08_Varargs {
    //verilen degisken sayida ki tamsayidan
    //ilkinin karesini, digerlerinin toplamiyla carpan bir method olusturun

    public static void main(String[] args) {

        islemYap(3,4,5); // 9* (4+5)
        islemYap(2,3,4,5);
    }

    private static void islemYap(int ilksayi, int... geriyeKalanSayilar) {

        int toplam = 0 ;

        for (int each:geriyeKalanSayilar
             ) {
            toplam +=each;
        }
        System.out.println("istenen islem sonucu : " + (ilksayi*ilksayi*toplam));
    }
}
