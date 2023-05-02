package Day23_encapsulation_inheritance;

public class C05_EncapsuleRunner {
    public static void main(String[] args) {
        C04_EncapsuleClass obj = new C04_EncapsuleClass();
        obj.publicStr="Java super";
        System.out.println(obj.publicStr);

        obj.setPrivateStr("Herseyi dusunmusler");
        System.out.println(obj.getPrivateStr());

        /*
            Bir class uyesiini private yapip hem getter hem de setter methodu
            olusturmak ile o class uyesini public yapmak arasinda birr fark yoktur

            kullanim ve goruntu acisinda fark vardir.

            bazi developer'lar public yapmak yeriene getter ve setter olustumrayi
            tercih ederler

            burada temel amac public oldugunda yapilamayan bir islemi yapmak degil
            atama ve okuma islemlerine vurggu yapmaktir
         */
    }
}
