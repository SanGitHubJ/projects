package OOPConcepts.OverloadingAndStaticAndFunction;

public class LocalvsGlobalVariables {

    //globle or class variable

    String name ="Tom";
    int age =25;


    public static void main(String [] args){

        LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
        int i =10;  //local variable

        System.out.println(i);

        System.out.println(obj.name);
        System.out.println(obj.age);
    }

    public void sum(){

        int i =20;  // local varibale for method
        int j =30;

    }
}
