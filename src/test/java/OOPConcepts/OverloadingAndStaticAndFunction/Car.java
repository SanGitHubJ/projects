package OOPConcepts.OverloadingAndStaticAndFunction;

public class Car {

    //class veriable or globale veriables

    int mod;
    int whell;

    public static void main(String[] args){

        Car a = new Car(); // new Car(); is an object of Car class
        Car b = new Car();
        Car c = new Car();

        a.mod = 2015;
        a.whell = 4;

        b.mod =2014;
        b.whell=4;

        c.mod=2016;
        c.whell=4;

        System.out.println("Before references");
        System.out.println(a.mod);
        System.out.println(a.whell);
        System.out.println(b.mod);
        System.out.println(b.whell);
        System.out.println(c.mod);
        System.out.println(c.whell);

        System.out.println("Atfer reference");

        a=b;
        b=c;
        c=a;

        a.mod=10;
        System.out.println(a.mod);

        c.mod=20;

        System.out.println(a.mod);






    }
}
