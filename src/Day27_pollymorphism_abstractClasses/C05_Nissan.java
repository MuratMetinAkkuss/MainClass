package Day27_pollymorphism_abstractClasses;

public class C05_Nissan extends C03_Araba{

    @Override
    void teker() {
        System.out.println("Nissan araclar lassa kullanir.");
    }

    @Override
    void motor() {
        System.out.println("Nissan araclar renault motorlar kullanir.");
    }

    @Override
    void gosterge() {
        System.out.println("Nissan araclarda 20 tane gosterge vardir.");
    }

    public static void main(String[] args) {
        C05_Nissan nissan1 = new C05_Nissan();
        nissan1.gosterge();
        nissan1.guvenlik();
        nissan1.klima();
        nissan1.motor();
        nissan1.teker();

    }
}
