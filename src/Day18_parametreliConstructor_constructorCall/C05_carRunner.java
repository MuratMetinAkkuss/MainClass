package Day18_parametreliConstructor_constructorCall;

public class C05_carRunner {
    public static void main(String[] args) {
        C03_Car car1 = new C03_Car(1000,"ford");
        System.out.println(car1);
    }
    C03_Car car2 =new C03_Car("Toyata","Corolla",2010,12000);
}
