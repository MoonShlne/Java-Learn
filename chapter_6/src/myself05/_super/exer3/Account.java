package myself05._super.exer3;



/**
 * @author polar
 * @version 1.0
 * @since 2024/11/11 16:32
 * 1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，取款方法withdraw()，存款方法deposit()。
 */
public class Account {
    private  int id;
    private  double balance;
    private  double annualInterestRate;

    public  Account(){

    }
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //返回月利率的方法getMonthlyInterest()，取款方法withdraw()，存款方法deposit()。
    public double getMonthlyInterest(){
        return  annualInterestRate/12;
    }
    public  void  withdraw(double amount){
        if (amount>balance){
            System.out.println("余额不足");
        }
        else {
            System.out.println("取款成功");
            balance-=amount;
        }
    }
    public  void  deposit  (double amount){
        if (amount>0){
            balance+=amount;
        }
        else {
            System.out.println("存的的钱非负！");
        }
    }

}
