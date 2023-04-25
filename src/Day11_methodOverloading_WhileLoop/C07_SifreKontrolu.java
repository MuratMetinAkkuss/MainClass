package Day11_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C07_SifreKontrolu {
    /*
    Kullanicidan asagidaki sartlari saglayan bir sifre isteyin
    kullanici uygun sifre girinceye kadar yeniden sifre isteyin

    sifrenin kontrolunu bir method'da yapip
    sifre uygunsa true
    degilse false dondurun

    - ilk harf kucuk harf olmali
    - son karakter rakam olmali
    - sifre bosluk icermemeli
    - uzunlugu en az 10 karakter olmali
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreGecerliMi = false;

        while (sifreGecerliMi){
            System.out.println("Lutfen bir sifre girin: ");
            sifre = scanner.nextLine();

            sifreGecerliMi = sifreKontrolEt(sifre);
        }
    }

    public static boolean sifreKontrolEt(String sifre) {

        return false;
    }
}
