package Day10_NestedForLoop_Method;

public class C07_methodOlusturma {
     /*
        verilen iki sayinin toplamini yazdiran
        bir method olusturun
         */


    public static void main(String[] args) {
        ikiSayiTopla(5,9);
        ikiSayiTopla(1231231231,213131341);



    }
    public static void ikiSayiTopla(int sayi1, int sayi2){
        /*
        public : access modifier ==> erisim belirleyici, simdilik hep public
        static : ozel bir keyword'dur, simdilik hep static olacak
        void : return type , method'un bana bir sey getirmeyecegini,sadece
        yazdiracagini belirtir.
        isim : methodu'un yaptigi is ile baglantili olmasina dikkat et !!!!
        (parametreler) : method'un yapacagi is icin bizim gondermemiz gereken
        degiskenler.
         */
        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));


    }
}
