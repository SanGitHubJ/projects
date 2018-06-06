package OOPConcepts.Inheritance;

public class TestCar {

    public static void main(String[] args){


        //static polymorphism ...>> complie time polymorphims
        BMW b = new BMW();  // Method overriding when same method present in parent class and chile class with same name and same number
        //of argument is called method overriding

        b.start();
        b.stop();
        b.theFTSafety();
        b.refule();
        b.engine();

        System.out.println("#######");
        //dynamic polymophism can not acc child feature by parent class
        Car a = new Car();

        a.start();
        a.stop();
        a.refule();


        System.out.println("**********");
        //top casting
        Car d = new BMW();

        d.start();
        d.stop();
        d.refule();

        //down casting
        // not allowd during runtime error
        //Exception in thread "main" java.lang.ClassCastException

    //    BMW bn = (BMW) new Car();



    }
}
