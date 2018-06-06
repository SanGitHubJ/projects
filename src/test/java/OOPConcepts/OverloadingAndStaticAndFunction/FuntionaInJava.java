package OOPConcepts.OverloadingAndStaticAndFunction;

public class FuntionaInJava {

    public static void main(String[] args){

        FuntionaInJava obj = new FuntionaInJava();
        //once create obj all below NON Static method will be given to obj.

        obj.test();
        int t = obj.pqr();
        System.out.println(t);

        String r = obj.qa();
        System.out.println(r);

        int w = obj.devision(50,5);
        System.out.println(w);


    }

    //non static method

    public void test(){

        System.out.println("Test Method");
    }

    public int pqr(){

        System.out.println("pqr Method");

        int a =20;
        int b =20;
        int c =a+b;

        return c;
    }

    public String qa(){

        System.out.println("QA method");

        String s = "Selenium";

        return s;
    }

    public int devision(int x, int y){ // x n y are input parameter or input areguments

        System.out.println("Devision method");

        int d = x/y;
        System.out.println("to check veribale");
        return d;

    }
}
