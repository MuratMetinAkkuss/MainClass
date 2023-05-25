package Day30_exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);
        System.out.println(sayilar);

        //List'deki tum elementleri iki arttirip yeni halini kaydedin

        for (int i = 0; i <sayilar.size() ; i++) {

            sayilar.set(i,sayilar.get(i)+2);

        }
        System.out.println(sayilar);

        /*
        Java'da farkli ozelliklere sahip
        birden fazla element barindirabilen
        cok sayida yapi vardir.

        biz bugune kadar :
        array ve listi gorduk
        yarin:Collections(linked list, queue, degue, set )
        sonra:maps

        bu yapilarin hepsi index kullanmaz

         */
            //index kullanmadan list'deki elementleri 2 arttirin
        for (Integer eachElement: sayilar
             ) {
            System.out.print(eachElement+2+" ");
        }

        //for each kullanarak list'in elementlerini iki arttirip kalici
        //hale getirip list'in yeni degerlerini kaydedin

        System.out.println("");
        Iterator itr = sayilar.iterator();
        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        System.out.println(sayilar);

    }
}
