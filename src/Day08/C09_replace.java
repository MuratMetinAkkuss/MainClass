package Day08;

public class C09_replace {
    public static void main(String[] args) {

        String str = "Javasiz olmaz";

        System.out.println(str.replace('J', 'H'));
        System.out.println(str.replace("a", ""));
        System.out.println(str.replace("Javasiz", "x"));

        System.out.println(str.replace("va", "vavavavavala"));
        System.out.println(str);

        /*
        atama yapilmadigi surece yapilan degisiklikler sadece o satir icin gecerlidir.
        atama yapilana kadar kalici olmaz.
         */

        //str1 icindeki bosluklari yok edin
        String str1 = "Java ile hayat cok daha guzel";
        System.out.println(str1.replace(" ", ""));
        System.out.println("str1 = " + str1);
        str1 = str1.replace(" ","");
        System.out.println("str1 = "+ str1);

        String str2 = "Java hayattir";
        System.out.println(str2.replaceFirst("a", "x"));



    }
}
