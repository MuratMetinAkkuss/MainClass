package Day23_encapsulation_inheritance;

public class C06_Parent {

    private int toplamSatisTutari;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    private void privateMethod(){
        System.out.println("Parent Class private Method");
    }

    void defaultMethod(){
        System.out.println("Parent Class default Method");
    }

    protected void protectedMethod(){
        System.out.println("Parent Class protected Method");
    }

    public void publicMethod(){
        System.out.println("Parent Class public Method");
    }



}
