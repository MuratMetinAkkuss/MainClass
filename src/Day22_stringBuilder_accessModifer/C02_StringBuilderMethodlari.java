package Day22_stringBuilder_accessModifer;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir");

        sb1.append(",");
        System.out.println(sb1);

        String str = "Bu gun hava cok guzel";
        sb1.append(str,2 , 4);
        System.out.println(sb1);

        sb1.replace(0,4,"Selenium");
        System.out.println(sb1);

        sb1.insert(2,1);
        System.out.println(sb1);
        sb1.insert(4,"Naber");
        System.out.println(sb1);
        sb1.insert(15 , "Heye");
        System.out.println(sb1);

        sb1.insert(0,str,0,3);
        System.out.println(sb1);

        sb1.delete(30,31);
        System.out.println(sb1);
        sb1.deleteCharAt(5);
        System.out.println(sb1);
        sb1.delete(6,12);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2);
        System.out.println(sb1.compareTo(sb2));
    }
}
