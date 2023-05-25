package Day29_exceptions;

public class C06_CatchBlogu_e_Kullanimi {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 5;

        try {
            System.out.println(sayi1/sayi2);
            System.out.println("aciklama 1 :");
            System.out.println("aciklama 2 :");
            System.out.println("aciklama 3 :");
        } catch (Exception e) {
            /*
                burada kullanilan e olusan exception'in icerisine
                atayabilecegimiz bir variable'dir
                Exception e = olusanHata;
                seklinde bir variable olusturulmus ve deger atanmis olur
                catch blogu icersinde hazirlanmis method'lar kullanilarak
                istediginiz sekilde hata mesajlari yazdirilabilecegi gibi
                hazir methodlari kullanmayip kendi mesajimizi da yazdirabiliriz


             */
            /*
                bir try blogunda sorun ile karsilasilmazsa
                kod normal olarak caliosmaya devam
                try calisir catch devreye girmez
                try blogunda exception olusurusa
                exception olusan satir ile catch blogu arasinda kalan
                kodlar calismaz buna ignore etme denir
                catch blogu devreye girer ve blogunda ki kodlar devreye girer
                ve catch blogundan sonrasinda calismaya devam eder

             */
        }
        System.out.println("Catch block sonrasi calisir.");
    }
}
