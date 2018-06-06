package OOPConcepts.Interface;

public class HSBCBank implements USBank,BrazilBank{ // we achiving multiple inheritancce

    //also called Is-a releation [inferce implement]
    //has-a releationship is used in class called extend


    //if class is implemeting then its mandoaruty to imlement to define/overrring all the method in interface
    public void credit(){

        System.out.println("HSBC");


    }

    public void debit(){

        System.out.println("HSBC bedit");
    }

    public void transferMoney(){

        System.out.println("HSBC transferMoney");
    }

    public void educations(){

        System.out.println("HSBC educations");
    }

    public void carLoan(){

        System.out.println("HSBC car loan");
    }

        //brazilBank
    public void mutualFunds(){

        System.out.println("HSBC mutualFunds");
    }

}
