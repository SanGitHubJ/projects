package OOPConcepts.OverloadingAndStaticAndFunction;

public class MethodOverloading {

    public static void main(String [] args){


        MethodOverloading obj = new MethodOverloading();

        obj.sum();
       obj.sum(3);
       obj.sum(6,8);
       obj.sum("test");


    }

    //method overlading same method in diffrent input parameter in same call

    public void sum(){

        System.out.println("sum method>. sero para");
    }

    public void sum(String p){

        System.out.println("sum method>. sero para with String"+p);
    }

    public void sum(int i){

        System.out.println("some method with 1 Para>>" +i);


    }

    public void sum(int k, int j){

        System.out.println("sum ethomd with 2 para>>>"+(k+j));
    }
}
