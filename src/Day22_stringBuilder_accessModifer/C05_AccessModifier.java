package Day22_stringBuilder_accessModifer;

public class C05_AccessModifier {


     C05_AccessModifier(){

    }

     private String privateStr;
     String defaultStr;
     protected String protectedStr;
     public String publicStr;


     private static int privateStaticSayi;
     static int defaultStaticSayi;
     protected static int protectedStaticSayi;
     public static int publicStaticSayi;

     private void privateMethod(){

     }

     void defaultMethod(){

    }

    protected void protectedMethod(){

    }

    public  void publicMethod(){

    }

    private static void privateStaticMethod(){

    }

    static void defaultStaticMethod(){

    }

    protected static void protectedStaticMethod(){

    }

    public static void publicStaticMethod(){

    }

    public static void main(String[] args) {
        //Tum Static Class Uyeleri direkt kullanilabilir.
        //Static olmayan tum class uyeleri icin ise object lazim

        C05_AccessModifier obj = new C05_AccessModifier();

        obj.classUyeKullanimi();

    }

    public void classUyeKullanimi(){
         //static olan veya olmayan tum class uyeleri kullanilabilir
        System.out.println(protectedStaticSayi);

    }

}
