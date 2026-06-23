class Customer{
    String name;
    public Customer(String n){
        name = n;
    }
}

class Bank{
    int account_bal;
    Customer customer;

    public void openAccount(Customer c, int init_bal){
        account_bal = init_bal;
        customer = c;
    }

    public int withdraw(int amount) throws Exception{
        if(amount>account_bal){
            throw new Exception(customer.name+",You can not debit "+amount+" while your balance is "+account_bal);
        } else {
            account_bal = account_bal - amount;
            return amount;
        }
    }

    public int showBal(){
        return account_bal;
    }

}

public class BankTest {
    public static void main(String[] args) {
        Customer ramesh = new Customer("Ramesh");
        Bank sbi = new Bank();
        sbi.openAccount(ramesh, 1000);

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
