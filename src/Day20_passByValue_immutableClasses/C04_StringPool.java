package Day20_passByValue_immutableClasses;

public class C04_StringPool {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja"+"va";


        String s = "Ja";
        String t = "va";
        String str5 = s + t;
        String str6 = s.concat(t);




    }
}
