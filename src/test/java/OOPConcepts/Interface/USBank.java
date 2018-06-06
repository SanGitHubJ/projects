package OOPConcepts.Interface;

public interface USBank {

    //interface there is NO MAIN Method
    //only method declaration mean NO method body
    //Only METHOD prototypes
    //we can define veribable AND BYDEAULT STATIC and can define  valuE BUT CAN'T CHANGE MEAN FINAL[CONSTANT IN NATURE]
    //NO STATIC METHOD IN INTERFACE
    //WE CAN NOT CREATE OBJECT OF INTERFACE MEAN INTERFACE IS ABSTRACT IN NATURE

    int min_bal =100; // variable is always STATIS IN INTERFACE

    public void credit();

    public void debit();

    public void transferMoney();


}
