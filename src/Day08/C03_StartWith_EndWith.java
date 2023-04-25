package Day08;

public class C03_StartWith_EndWith {
    public static void main(String[] args) {

        /*
        bir yazinin (str) bir yazi arcacigi ile baslayip baslamadigini test ederek
        true veya false cevabini verir (dondurur)
         */

        String str = "Java cok eglenceli";
        System.out.println(str.startsWith("java"));// false
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith(str));//true
        System.out.println(str.startsWith(""));//true

        System.out.println("==================================");
        /*
        endsWith () methodu, istenilen bir yazinin
        belli bir yazi parcagigi ile bitip bitmedigini kontrol eder
         */

        System.out.println(str.endsWith("a")); //false
        System.out.println(str.endsWith("eglenceli"));//true
        System.out.println(str.endsWith("celi"));//tru
        System.out.println(str.endsWith("Java cok eglenceli"));//true
        System.out.println(str.length());//18


        System.out.println(str.substring(str.length()-3));
        System.out.println(str.endsWith(str.substring(str.length() - 3)));

    }
}
