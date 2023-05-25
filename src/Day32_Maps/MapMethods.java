package Day32_Maps;

import java.util.*;

public class MapMethods {
    //bu class'da static method'lar olusturalim ki
    //her yerden class ismi ile kullanabilelim

    //Map ve ogrenci numarasi verdigimizde istedigimiz formatta
    //isim soyisim bilgisini bize donduren bir method olusturalim

    public static String searchWithNumber(Map<Integer, String> studentMap, int studentNum) {

        //1- istenen numaraya ait value'yu kaydedelim
        String sValue = studentMap.get(studentNum);


        //2-tek bir String olan value'yu bilgileri alabilmek icin split edelim
        String[] valueArray = sValue.split("-");

        //3- istenen bilgileri alip, istenen formatta kaydedelim
        String nameOfStudent = valueArray[0];
        String lastNameOfStudent = valueArray[1];
        String formatEqualForNameLastname = nameOfStudent.substring(0, 1).toUpperCase() +
                nameOfStudent.substring(1).toLowerCase() +
                " " + lastNameOfStudent.substring(0, 1).toUpperCase() +
                lastNameOfStudent.substring(1).toLowerCase();

        return formatEqualForNameLastname;
    }

    public static Map<Integer, String> creataStudentMap() {

        Map<Integer, String> schoolMap = new HashMap<>();
        schoolMap.put(101, "Ali-Can-11-H-MF");
        schoolMap.put(102, "Veli-Cem-10-K-TM");
        schoolMap.put(103, "Ali-Cem-11-K-TM");
        schoolMap.put(104, "Ayse-Can-10-H-MF");
        schoolMap.put(105, "Sevgi-Cem-11-M-TM");
        schoolMap.put(106, "Sevgi-Can-10-K-MF");

        return schoolMap;
    }

    public static void printwholeStudentsList(Map<Integer, String> studentMap) {

        //tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdirin
        //tum ogrencilere ulasbilmek icin keyleri getirmemiz lazim

        Set<Integer> studentKeySet = studentMap.keySet();

        //Tum key'leri tek tek ele alip
        //o key'e ait isim ve soy ismi yazdiralim

        int lineNum = 1;
        for (Integer eachKey : studentKeySet
        ) {

            // her bir key'e ait isim soy ismi yazdiralim
            System.out.println(lineNum + "- " + searchWithNumber(studentMap, eachKey));
            lineNum++;
        }


    }

    public static void printStudentsOfWantedClass(Map<Integer, String> studentMap, int i) {

        //burada her bir value'yu gozden gecirmeliyizs
        //value'lari elde edebilmek icin kaydetmemiz gerekir
        Collection<String> valueCollection = studentMap.values();

        //burada her bir value'yu gozden gecirmeliyizs
        for (String eachValue : valueCollection
        ) {
            //her bir value'yu split edip, class bilgisini kontrol etmeliyiz

            String[] eachValueArr = eachValue.split("-");

            //array'dan sinif bilgisini kontrol edip
            //istenen sinif degerine esit ise
            //isim soy isim degerlerini yazdiralim
            int lineNum = 1;
            if (eachValueArr[2].equals(i + "")) {
                System.out.println(lineNum + "- " + eachValueArr[0]
                        + " " + eachValueArr[1] + " " + eachValueArr[2]);
                lineNum++;

            }

        }

    }

    public static Map<Integer, String> lastNameUpdateWithNumber(Map<Integer, String> studentMap, int number, String newLastName) {

        //102 no'lu ogrenin value'sunu kaydet
        String value = studentMap.get(number);

        //update yapabilmek icin bilgileri split etmeliyiz
        String[] valuearr = value.split("-");

        //bu array'de soy isim olarak yeni soy ismi atayabilirim.
        valuearr[1] = newLastName;

        // bu arrday'deki guncel bilgileri value yapisina uygun olarak
        //yeniden birlestirmeliyiz
        value = valuearr[0] + "-" + valuearr[1] + "-" + valuearr[2] + "-" + valuearr[3] + "-" + valuearr[4];


        //102 numarali ogreniyi yeni value'su ile map'e ekleyelim
        studentMap.put(number, value);
        //key'ler unique oldugu icin
        //var olan bir elementi yeniden eklemek isterseniz
        //key var oldugu icin, eski value'yu silip
        //yeni value yapar.


        return studentMap;
    }


    public static void soyisimOgrenciBulma(Map<Integer, String> studentMap, String lastName) {

        //1-) ilk once studentmap'den key degerleri ile ogrencileri getirmeliyiz
        /*
        1-101
        2-102
        3-103
        4-104
        5-105
        6-106
         */
        Set<Integer> studentKeySet = studentMap.keySet();
        List<String> istenenOgrenciler = new ArrayList<>();

        for (Integer each : studentKeySet
        ) {
            String sira = searchWithNumber(studentMap, each);
            //Ali - Can
            if (sira.contains(lastName)) {
                istenenOgrenciler.add(sira);
            }
        }
        System.out.println("Istenen ogrenciler : " + istenenOgrenciler);

    }

    public static void soyisimOgrenciBulma2(Map<Integer, String> studentMap, String lastname) {

        int basD = 101;
        List<String> istenenOgrenciler = new ArrayList<>();


        do {
            String value = studentMap.get(basD);
            //Sevgi-Cem-11-M-TM

            //TOPLU DEGERLERDEN SOYAD KISMINI AYIRIRMAMIZ GEREKIYOR
            String[] ogrenciBilgisi = value.split("-");
            //Sevgi,Cem,11,M,TM


            if (ogrenciBilgisi[1].equals(lastname)) {
                istenenOgrenciler.add(value);
            }
            basD++;

        } while (basD <= 106);

        System.out.println(istenenOgrenciler);

    }


    public static void printAllStudentListWhithNumber(Map<Integer, String> newMap) {

        Set<Map.Entry<Integer, String>> studentEntrySet = newMap.entrySet();
        //bu sekilde map ile degil set ile ugrasmis olacagiz
        //tek bir for-each loop ile hem key'e hem de value'ye ulasabilecegiz.


        System.out.println("No Name Lastname Class");
        System.out.println("------------------------");
        for (Map.Entry<Integer, String> each : studentEntrySet
        ) {
            String studentValue = each.getValue();
            String[] studenValueArr = studentValue.split("-");

            System.out.println(each.getKey() + " " + studenValueArr[0]
                    + " " + studenValueArr[1] + "        " + studenValueArr[2]
            );
        }

    }

    public static Map<Integer, String> makeProcessForEndOfYear(Map<Integer, String> studentMap) {

        // tum entry'leri ele almak icin bir entrySet olusturualim
        Set<Map.Entry<Integer, String>> studentEntrySet = studentMap.entrySet();

        //Ogrenci entrySet'inde her bir entry'i ele alip
        //istenen update'i yapalim

        for (Map.Entry<Integer, String> each : studentEntrySet
        ) {
            //sinifi update edebilmek icin once value'u parcalayip
            //istenen bilgiye ulasip
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split("-");
            //Array'de ikinci indexteki sinif bilgisini inceleyip
            // gerekli update i yapalim
            if (!eachValueArr[2].equalsIgnoreCase("Mezun")) {
                Integer classNo = Integer.parseInt(eachValueArr[2]);
                if (classNo < 12) {
                    //istenen bilgiyi update edelim.
                    classNo++;
                    eachValueArr[2] = "" + classNo;
                } else {
                    eachValueArr[2] = "Mezun";
                }
            }
            each.setValue(eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2]
                    + "-" + eachValueArr[3] + "-" + eachValueArr[4]);
            //bilgi update edildikten sonra array'de yapilan degisikligin
            //map'e islenmesi icin, herbir entry'i update edecegiz


        }


        return studentMap;
    }

    public static Map<Integer, String> makeLastNameUpperCase(Map<Integer, String> studentMap) {

        Set<Map.Entry<Integer, String>> studentEntrySet = studentMap.entrySet();

        for (Map.Entry<Integer, String> each : studentEntrySet
        ) {
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split("-");
            //array'e her bir elementi endexledik.

            eachValueArr[1] = eachValueArr[1].toUpperCase();//soy isim buyuk harf yapildi.

            each.setValue(eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2]
                    + "-" + eachValueArr[3] + "-" + eachValueArr[4]);
            //bilgi update edildikten sonra array'de yapilan degisikligin
            //map'e islenmesi icin, herbir entry'i update edecegiz
        }

        return studentMap;
    }
}
