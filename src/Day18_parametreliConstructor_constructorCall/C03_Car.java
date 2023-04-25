package Day18_parametreliConstructor_constructorCall;

public class C03_Car {
    @Override
    public String toString() {
        return "C03_Car{" +
                "\nmarka='" + marka + '\'' +
                "\nmodel='" + model + '\'' +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat +
                '}';
    }


    String marka = "marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil ;
    int fiyat;

    public C03_Car(){}
    public C03_Car(int fyt,String mrk){
        fiyat = fyt;
        marka = mrk;
    }
    public C03_Car(String mrk){
        marka = mrk;
        fiyat = 12000;
        model = "Civic";
        yil = 2012;
    }

    //marka ve model ile contructor olusturalim
    public C03_Car(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }
}
