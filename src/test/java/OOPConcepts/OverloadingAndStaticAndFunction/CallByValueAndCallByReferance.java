package OOPConcepts.OverloadingAndStaticAndFunction;

public class CallByValueAndCallByReferance {

    int p;
    int q;

    public static void main(String[] args){



        CallByValueAndCallByReferance obj = new CallByValueAndCallByReferance();

        int x= 10;
        int y= 20;
         obj.testSum(x,y);  // call by value or pasing value x and y

        obj.p = 50;
        obj.q = 60;
        System.out.println("Before swap p"+obj.p);
        System.out.println("Befor swap q "+obj.q);

        obj.swap(obj);



        System.out.println("Atfer swap p >>"+obj.p);
        System.out.println("Atfer swao q>>" +obj.q);



    }

    public int testSum(int a, int b){


        int c = a+b;
        return c;

    }

    public void swap(CallByValueAndCallByReferance t){

        int tmp;
        tmp = t.p; // tmp >50
        t.p = t.q;  // p > 60
        t.q =tmp; // q > 50





    }
}
