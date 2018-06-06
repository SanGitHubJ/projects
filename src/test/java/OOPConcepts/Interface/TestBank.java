package OOPConcepts.Interface;

public class TestBank {

    public static void main(String[] args){

        System.out.println(USBank.min_bal);
        HSBCBank hs = new HSBCBank();

        hs.carLoan();
        hs.credit();
        hs.debit();
        hs.educations();
        hs.transferMoney();
        hs.mutualFunds();
    }
}
