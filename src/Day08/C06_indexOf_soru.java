package Day08;

public class C06_indexOf_soru {
    public static void main(String[] args) {
        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis


        String str1 = "Java cok kolay";
        String str2 = "cok";

        int bastan = str1.indexOf(str2);
        int sondan = str1.lastIndexOf(str2);

        if (bastan==-1){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (bastan==sondan){
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }








    }
}
