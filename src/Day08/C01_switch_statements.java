package Day08;

import java.util.Scanner;

public class C01_switch_statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gormek istediginiz mevsimin ay numarasini giriniz");
        int ayNo = scanner.nextInt();

        switch (ayNo){
            case 12 :
            case 1:
            case 2 :
                System.out.println("kis");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("Girdiginiz bilgileri kontrol ediniz!");
        }
    }

}
