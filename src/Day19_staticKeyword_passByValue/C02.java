package Day19_staticKeyword_passByValue;

public class C02 {
    static String staticV = "java";
    String isimIns = "Sevda";

    public static void main(String[] args) {
        C02 obj1 = new C02();
        System.out.println(obj1.isimIns);
        System.out.println(obj1.staticV);
        obj1.isimIns="Akif";
        System.out.println(obj1.isimIns);
        obj1.staticV = "Selenium";
        System.out.println(obj1.staticV);


        C02 obj2 = new C02();
        System.out.println(obj2.isimIns);
        System.out.println(obj2.staticV);

        obj2.staticV = "Selenium";

    }
}
