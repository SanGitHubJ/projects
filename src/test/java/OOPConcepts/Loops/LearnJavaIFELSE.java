package OOPConcepts.Loops;

public class LearnJavaIFELSE {

    public static void main(String[] args){

            int a =100;

            int b =400;
            int c =300;

            if(b!=a){

                System.out.println("b is greater than a");
            }else{
                System.out.println("a is greater than b");
            }

            if(a>b & a>c){
                System.out.println("a is the greatest");
            }else if(b>c){
                System.out.println("gratest is b");

            }else{
                System.out.println("gtreats is c");
            }
    }
}
