package Day10_NestedForLoop_Method;

public class C11_MiniHesapMakinesi {
    public static void main(String[] args) {
        /*
        kullanicinin verdigi iki sayi ve
        sececegi isleme gore
        sonucunu double olarak bize donduren bir method olusturun
        ornek : sayilar: 3,5 islem * , oldugunda method bize 15 dondurmeli
         */
        System.out.println(hesapMakinesi(4, 25, '-'));
        //bize sonuc donduren methodlarda
        //islem sonucunu gormek isterseniz
        //yazdirabilir
        System.out.println(hesapMakinesi(4,5,'-'));
        //veya kaydedip daha sonra kullanabilirsiniz
    }

    public static double hesapMakinesi(int sayi1, int sayi2, char islemSembolu){

        double sonuc = 0 ;
        //islemi sembolu olarak +- / * sembolu kullanilabilsin
        switch (islemSembolu){
            case '+':
                sonuc = sayi1+sayi2;
                break;
            case '-':
                sonuc = sayi1-sayi2;
                break;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            case '/':
                sonuc=sayi1/sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis sonuc sifir ");
        }
        return sonuc;
    }
}
