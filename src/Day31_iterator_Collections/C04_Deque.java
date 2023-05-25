package Day31_iterator_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    //Double ended queue
    //genel olarak queue ozelliklerini gosteririr
    //ancak bastan ve sondan ekleme-cikarma gibi ozellikleri olur.

    public static void main(String[] args) {
        Deque<String> deq = new LinkedList<>();

        deq.add("Adnan");
        deq.addLast("Sevda");
        deq.addFirst("Saida");

        System.out.println(deq);

        System.out.println(deq.removeLastOccurrence("Sevda"));
        System.out.println(deq);
        //tek Sevda aoldugu icin remove removefirstoccurance veya lastoccurance
        //arasinda fark olmayacaktir.

        System.out.println(deq.pop());
        System.out.println(deq);




    }
}
