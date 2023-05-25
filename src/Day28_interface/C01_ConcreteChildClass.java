package Day28_interface;

import Day23_encapsulation_inheritance.C07_ChildClass;
import Day27_pollymorphism_abstractClasses.C07_ApstractP;

public class C01_ConcreteChildClass extends C07_ApstractP {
    /*
        Abstract parentclass'lardan sonra gelen
        ilk concrete child class
        parent abstract class'larda concretlestirilmemis olan
        tum abstract methodlari implement etmek zorundadir

        concrete olan methodlar ise opsiyoneldir.
        isterseniz override edebilirsiniz
     */
    @Override
    protected void method2() {

    }

    @Override
    protected void method5() {

    }
}
