package Day13_arrays;

public class C06_EnUzunEnKisaKelime {
    public static void main(String[] args) {
        /*
        verilen string bir arrey de en uzun ve en kisa kelimeleri yazdiran
        bir method olusturun
         */
            String[]arr={"saida","isa","asil","kubra elif","elif"};
        enBuyukKisa(arr);
    }


    public static void enBuyukKisa(String[]arr){
        String uzunluk = arr[0];
        String kisa = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (uzunluk.length() < arr[i].length()){
                uzunluk = arr[i];
            }
            if (arr[i].length()<kisa.length()){
                kisa = arr[i];
            }
        }
        System.out.println("en uzun kelime: "+uzunluk);
        System.out.println("en kisa kelime: "+kisa);
    }

}
