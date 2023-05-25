package Day28_interface;

public class C04_ChildOf_I03 implements I03_BodyOlanMethod{
    @Override
    public void method1() {

    }

    @Override
    public int merthod2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public double method4() {
        return 0;
    }

    @Override
    public void method5() {
        I03_BodyOlanMethod.super.method5();
    }

    public static void main(String[] args) {
    I03_BodyOlanMethod.method6();
    //Ayni sekilde static keyword de kismen farkli bir kullanima sahiptir
        //child class'dan static olarak olusturdugumuz method6'ya direkt
        //ulasamiyoruz sadece interfaaceadi.methodadi olarak ulasiriz.
    }
    public void method7(){
        method5();

    }
}
