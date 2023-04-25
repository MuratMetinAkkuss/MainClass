package Day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_kullaniciListOlusturma {
    public static void main(String[] args) {
        //kullanicidan alinan isimleri listeye kaydeden bir method olusturun

        System.out.println(kullanicidanStringAlarakListeOlusturma());
    }

    public static List<String> kullanicidanStringAlarakListeOlusturma(){

        Scanner scanner = new Scanner(System.in);

        //loop sayisi bilinmiyorsa do-while veya while-loop kullanilir.
        //kullanici isim yerine "0" girince program dursun

        String kullaniciGirdisi="";
        List<String> isimler = new ArrayList<>();
        //kullanici girdisi sifira esit olmadigi surece devam etsin
        while (!kullaniciGirdisi.equalsIgnoreCase("0")) {

            System.out.println("Lutfen listeye eklemek icin bir isim giriniz");
            kullaniciGirdisi = scanner.next();
            //kullanici girdisi sifir degilse ekle yaptik
            if (!kullaniciGirdisi.equalsIgnoreCase("0")){
                isimler.add(kullaniciGirdisi);
            }

        }

        return isimler;
    }
}
