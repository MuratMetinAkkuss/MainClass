package Day17_constructors;

public class C04_hastaneRunner {
    public static void main(String[] args) {

        /*
            // Biz bir obje olusturdugumuzda
            java once bu constructor un varligini teyit eder.
            // Varsa bu objeyi olusturur.
            //instance olan butun variable larin
            birer kopyalarini olusturur
            ve objeye iliskilendirir
            // Objeye yeni bir atama yapmadigimiz
             muddetce
             objenin olusturuldugu class'daki ilk
             degerleri kullanir


             Static variable'larda durum
             obje uzerinden static olanlara ulasmak istedigimizda
             java once objeye gider, o objeye ilisiklendirilen
             bilgilerde istenen variable'i bulamazsa,
             class seciyesinde static variable'lara ulasir

             static variable'lar class'a baglidir
             ve degistirilirsa tum objeler icin degisiklik
             gecerli olur
         */

        C03_Hastane per1 = new C03_Hastane();

        System.out.println(per1.personelIsmi);
        per1.personelTuru="Doktor";
        System.out.println(per1.maas("Doktor"));



        C03_Hastane per2 = new C03_Hastane();

        System.out.println(per2.personelTuru);

        System.out.println(per1.hastaneAdi);
        per2.hastaneAdi = "Java hastanesi";
        System.out.println(per1.hastaneAdi);


    }
}
