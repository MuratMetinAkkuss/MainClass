package Day10_NestedForLoop_Method;

public class C13_AsalSayiMiDondurme {
    /*
    verilen bir sayinin asal sayi olup olmadigini
    true false olarak donduren bir method olusturun
     */
    public static void main(String[] args) {
        System.out.println(asalSayiMi(23));

        /*
method call sirasinda parantez icine yazdigimiz variable'lara
argument denir
method () icindeki variable'lara ise parametre denir


method'un calismasi icin argument ve parametlerin sayilari va data turleri
uyumlu olmalidir.

 */


    }
    public static boolean asalSayiMi (int sonuc){
        boolean asalMi=true;
        for (int i = 2; i <sonuc ; i++) {
            // System.out.println("dene " + i);
            if (sonuc % i == 0){
                asalMi=false;
                break;
            }
        }

    return asalMi ;
    }
}

