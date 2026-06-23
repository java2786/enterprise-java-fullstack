class Bank{
    int account_bal;
    // String name = null;

    public Bank(int init_bal){
        account_bal = init_bal;
    }

    public int withdraw(int amount) throws Exception{
        if(amount>account_bal){
            throw new Exception("You can not debit "+amount+" while your balance is "+account_bal);
        } else {
            account_bal = account_bal - amount;
            return amount;
        }
    }

    public int showBal(){
        return account_bal;
    }

    

}

public class SimpleBankTest {
    public static void main(String[] args) {
        Bank sbi = new Bank(1000);
        // sbi.name 

        try{
            System.out.println(sbi.showBal());
            System.out.println("Debit: "+sbi.withdraw(600));
            System.out.println(sbi.showBal());
            System.out.println("Debit: "+sbi.withdraw(500));
            System.out.println(sbi.showBal());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
