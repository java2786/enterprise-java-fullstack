abstract class Bank{
    int roi = 3;
    int balance = 20000;
    public void credit(int amount){
        balance = balance+amount;
    }
    // public void debit(int amount){
    //     if(balance>=amount)
    //         balance = balance-amount;
    // }
    abstract public void debit(int amount);
}

class SbiBank extends Bank{

    @Override
    public void debit(int amount) {
        if(balance-amount>=500)
            balance = balance-amount;
    }
    
}

class HdfcBank extends Bank{

    @Override
    public void debit(int amount) {
        if(balance-amount>=10000)
            balance = balance-amount;

    }
    
}
public class AbstractDemo {
    public static void main(String[] args) {
        // Bank bank = new Bank();
        HdfcBank hdfc = new HdfcBank();
        System.out.println(hdfc.balance);
        hdfc.debit(200);
        hdfc.debit(2000);
        hdfc.credit(1200);
        System.out.println(hdfc.balance);
    }
}
