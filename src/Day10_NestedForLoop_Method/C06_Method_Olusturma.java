package Day10_NestedForLoop_Method;

public class C06_Method_Olusturma {
    public static void main(String[] args) {
        String str = "Java'nin robotlari";
        str.toUpperCase();

        /*
        eger bir method bize sonuc donduruyorsa
        methodu calistirmak
        sonucu gormek icin yeterli DEGILDIR.

        sonucu gormek istiyor ;
        - ya direkt yazdiririz methodCall u sout icerisinde yapariz
        - veya donen bilgiyi bir variable'a kaydeder
        kodumuzda istedigimiz zaman onu yazdirir ve kullaniriz


         */

        System.out.println(str.toUpperCase());
        str = str.toUpperCase();


    }
}
