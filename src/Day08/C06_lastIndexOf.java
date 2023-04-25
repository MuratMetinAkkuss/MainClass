package Day08;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java cok faydali";

        // burada "last" sondan aratmayi baslatma anlamina gelir
       // str.lastIndexOf("a");
        //System.out.println(str.lastIndexOf("a", 10));//10
        //System.out.println(str.lastIndexOf("a", 12));//10

        //System.out.println(str.indexOf("a"));
        //System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("cok"));
        System.out.println(str.lastIndexOf("cok"));



    }
}
