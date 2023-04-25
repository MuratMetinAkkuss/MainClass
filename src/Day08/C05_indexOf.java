package Day08;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java en iyisi en";

        //System.out.println(str.indexOf("e"));
        //System.out.println(str.indexOf("a"));

        //System.out.println(str.indexOf("en"));
        //System.out.println(str.indexOf("yi"));
        //System.out.println(str.indexOf("iyisi"));

        //System.out.println(str.indexOf("a"));
        //System.out.println(str.indexOf("a", 1));
        //System.out.println(str.indexOf("a", 2));
        //index her zaman bastan baslayarak kontrol etmeye baslar.
        //burada istedigimiz indexi girdikten sonrasinda istedigimiz sonucu
        //bize getirmek icin tarama yapar

       // System.out.println(str.indexOf("i"));//8
       // System.out.println(str.indexOf("i", 5));//8
       // System.out.println(str.indexOf("i", 9));//10
        //System.out.println(str.indexOf("i", 11));//12

        //verilen bir cumlede istenen bir string icin
        //asagidaki cumlelerden uygun olani yazdirin
        //1- aradiginiz kelime cumlede 1 kere kullanilmis
        //2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        //"Java en iyisi" icerisinde "en" kelimesi icin

        if (str.indexOf("en")==-1){
            System.out.println("aradiginiz kelimeyi cumle icermiyor");
        }else {
            int birinci = str.indexOf("en");
            if (str.indexOf("en", birinci+1)==-1){
                System.out.println("Bu cumlede aradiginiz kelime bir tane");
            }else {
                System.out.println("aradiginiz kelimeden birden cok var");
            }
        }


    }
}
