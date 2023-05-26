package Day34_nestedMaps;

import java.util.TreeMap;

public class C04_TreeMap {
    /*
        TreeMap elementleri dogal olarak sirali tuttugu,
        ve yeni eklenen elementleri de bu siralamaya uygun bir konuma
        yerlestirdigi icin
        diger map'lerde olmayan bazi ekstra ozellikleri vardir
     */

    public static void main(String[] args) {
        TreeMap<Integer, String> studentMap = new TreeMap<>();
        studentMap.put(103, "Ali Can");
        studentMap.put(120, "Veli Cem");
        studentMap.put(101, "Akif Han");
        studentMap.put(140, "Yusuf San");

        System.out.println(studentMap);

        System.out.println(studentMap.subMap(103, 110));
        System.out.println("");
        System.out.println(studentMap.subMap(103, 120));
        System.out.println("");
        System.out.println(studentMap.subMap(103, false, 120, true));
        //sadece sinirlar yazilirsa baslangic dahil,bitis haric olur.
        //istersek baslangic ve bitisin dahil olup olmamasini boolean degerler ile belirleyebilirz

        System.out.println("");
        System.out.println("siralamayi terse cevirir ama bu degisim kalici olmaz");
        System.out.println(studentMap.descendingMap());
        System.out.println(studentMap.descendingKeySet());

        System.out.println("");
        System.out.println(studentMap.lowerKey(120));
        System.out.println("");
        System.out.println(studentMap.lowerEntry(120));
        System.out.println("");
        System.out.println(studentMap.floorKey(119));
        System.out.println("");
        System.out.println(studentMap.floorEntry(125));
        System.out.println("");

        System.out.println(studentMap.higherKey(120));
        System.out.println("");
        System.out.println(studentMap.higherEntry(100));
        System.out.println("");

        System.out.println(studentMap.ceilingKey(122));
        System.out.println("");
        System.out.println(studentMap.ceilingEntry(122));
        System.out.println("");

        System.out.println(studentMap);
        System.out.println("");

        System.out.println(studentMap.headMap(120, true));
        System.out.println("");
        System.out.println(studentMap.tailMap(120));
        System.out.println("");

        System.out.println(studentMap.firstKey());
        System.out.println("");
        System.out.println(studentMap.lastKey());
        System.out.println("");

        System.out.println(studentMap.pollFirstEntry());
        System.out.println(studentMap);
        System.out.println("");
        System.out.println(studentMap.pollLastEntry());
        System.out.println(studentMap);
        System.out.println("");

        studentMap.clear();
        System.out.println(studentMap);
        //all list is deleted
        //everytype of method in this class show how to use TreeMap and make manipulation


    }
}
