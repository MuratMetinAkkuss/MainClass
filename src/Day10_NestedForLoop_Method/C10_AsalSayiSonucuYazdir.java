package Day10_NestedForLoop_Method;

public class C10_AsalSayiSonucuYazdir {
    public static void main(String[] args) {
        /*
        verilen sayinin asal sayi olup olmadigini yazdiran bir method olusturun
         */
        asalSayiMi(67);
    }

    public static void asalSayiMi (int sayi){
        boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
           // System.out.println("dene " + i);
            if (sayi % i == 0){
                asalMi=false;
                break;
            }
        }
        /*
            Bir loop'un icerisinde loop'un calismasini durdurmak isterseniz
            break; yazabilirsiniz
         */
        if (asalMi){
            System.out.println("sayi asal");
        }else {
            System.out.println("sayi asal degil");
        }
    }
}
