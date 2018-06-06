package OOPConcepts.OverloadingAndStaticAndFunction;

public class StatisAndNonStatisConcepts {

    String name ="Tom"; // non static var

    static int age = 25;  //static var >> Statis variable and methods WILL NOT access via Obj bcx
    //whic has sepefrate memory allocation

    public static void main(String[] args){

        //static method/variables  can directly call or via class name

        sum(); //or
        StatisAndNonStatisConcepts.sum();
        System.out.println(age);

        //Non static method or varibale need to call ONLY via Obj.

        StatisAndNonStatisConcepts obj = new StatisAndNonStatisConcepts();

        obj.sendMail();
        System.out.println(obj.name);

    }

    public void sendMail(){

        System.out.println("Send mail");
    }


    public static void sum(){

        System.out.println("sum methomd");
    }


}
