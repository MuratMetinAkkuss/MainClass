package Day24_inheritance;

public class Araba {

    String marka = "Araba markasi belirtilmedi.";
    String model = "Arabanin modeli olmalidir.";
    int tekerSayisi = 4;



    public void hiz(){
        System.out.println("Arabalar motor ve yakita gore maximum hiz belirler");
    }

    public void guvenlik(){
        System.out.println("Tum arabalar guvenlik onlemleri bulundurmaldir");
    }

    /*
        bir proje de kod yazmadan once tasarim yapilmalidir.
        olusturulacak muhtemel class'lar belirlenmeli
        bunlar arasinda nasil bir iliski kurulacagi
        hangi class'larin parent/child olacagi dusunulmelidir.


        daha genel ozellikler parent class'lara
        daha spesifik ve o class ait ozellikler child class'lara konulmaldir

        Araba ve Toyata class'lari obje olusturmayacagimiz,
        sadece child class'larini organize etmek
        ve ortak ozellikleri belirlemek icin
        tasarlanan class'lardir.
        bu tur class'larda main method olmasina gerek yoktur.
        (abstract class ve interface'lerde ele alinacak)


        bir ozelligi variable olarak olusturmak ile
        method olarak olusturmak arasinda
        kullanimda bir farki vardir.(overriding konusunda ele alinacak)
     */
}
