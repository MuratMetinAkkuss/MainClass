package Day22_stringBuilder_accessModifer;

import java.util.Objects;

public class C01_StringBuilder {
    public static  void main(String[] args) {
        //non-primitive data turlerinde bir data turundeki bir degeri,
        //farkli data turundeki bir variable'a atayabilmek icin aralarinda
        //parent-child iliskkisi olmalidir.

        Object obj1 = "Java";
        Object obj2 = 23;

        //3 farkli sekilde StringBuilder olusutuabiluir
        // bu yontemler arasindaki fark capacity yani hafiza kullanimi ile
        // ilgilidir



        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2);


        System.out.println(sb2.length());
        System.out.println(sb2.capacity());//11+16=27 kapasiteli olusturdu
        sb2.append(", Java candir buna inanmayan mi var");
        System.out.println(sb2);

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());//27*2+2=56

        //eger StringBuilder da fazla kullanilmis kapasiteyi temizlemek,
        //lenght=capacity yapmak isterseniz

        sb2.trimToSize();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());




    }
}
