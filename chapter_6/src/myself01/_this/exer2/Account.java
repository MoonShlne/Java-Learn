package myself01._this.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/8 16:01
 */
public class Account {
    private  double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double atm){
        balance+=atm;
    }
    public void  withdraw(double atm){
        if (atm> balance){
            System.out.println("钱不够了");
        }
        else {
            balance-=atm;
        }
    }
}
