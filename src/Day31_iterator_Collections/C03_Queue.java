package Day31_iterator_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> yemekSirasi = new LinkedList<>();

        yemekSirasi.add("Murat");
        yemekSirasi.add("Muhammed");
        // murat ve muhammed arasina bir kisi ekleyelim
        //queue ozelliginden dolayi, araya eleman EKLENEMEZ

        System.out.println(yemekSirasi);

        System.out.println(yemekSirasi.remove());

        System.out.println(yemekSirasi);

        yemekSirasi.add("Sevda");
        yemekSirasi.add("Veysel");
        yemekSirasi.add("Aysegul");

        System.out.println(yemekSirasi);
        System.out.println(yemekSirasi.poll());

        System.out.println("Poll'dan sonra : " + yemekSirasi);

        Queue<String> liste2 = new LinkedList<>();
        //liste2.remove();
        System.out.println(liste2.poll());
        //eger liste bos olursa null dondurur.

        yemekSirasi.offer("firdevs");
        System.out.println(yemekSirasi);
        //eger kapasite sinirlamasi yoksa add ile ayni islevi yapar

        System.out.println(yemekSirasi.peek());
        //queue basini bize dondurur ama silmez
        //eger bos ise null dondurur

        System.out.println(yemekSirasi.element());
        //peek'den farki olarak
        //exception return edecektir




    }
}
