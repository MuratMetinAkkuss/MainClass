package Day12_doWhileLoop_scope;

public class C03_doWhileLoop_Soru {
    public static void main(String[] args) {
        //k harfinden t harifa kadar harfleri yazdirin

        //for loop ile yapalim

        for (int i = 'k'; i <='t' ; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println(" ");

        //while loop ile yapalim

        char bas = 'k';
        while (bas<='t'){
            System.out.print(bas + " ");
            bas++;
        }
        System.out.println(" ");

        // do while loop ile yapalim

        bas = 'k';
        do {
            System.out.print(bas + " ");
            bas++;
        }while (bas <= 't');
    }
}
