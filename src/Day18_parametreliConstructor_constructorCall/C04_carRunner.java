package Day18_parametreliConstructor_constructorCall;

public class C04_carRunner {
    public static void main(String[] args) {
        C03_Car car1 = new C03_Car();
        System.out.println(car1);

        //mecburi alan olarak fiyat ve marka doldurulsun

        C03_Car car2 = new C03_Car(2000 ,"toyota");
        System.out.println(car2);

        //constructor icinde bizim gonderdigimiz parametreler disinda
        //baska islemlerde olabilir.
        //kod okuma sorularinda constructor'daki atamalara
        //dikkat edilmelidir.
        C03_Car car3 = new C03_Car("honda");
        System.out.println(car3);

        C03_Car car4 = new C03_Car("volvo");
        System.out.println(car4);
    }
}
