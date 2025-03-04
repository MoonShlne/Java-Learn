package myself05._super.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/11 16:48
 * 2、创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法，其算法如下：
 */
public class CheckAccount extends  Account {
    private  double overdraft;

    public CheckAccount(){}
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }
    @Override
    public void withdraw(double amount) {
        if (this.getBalance() >amount){
            System.out.println("余额充足，取款成功");
            super.withdraw(amount);
            System.out.println("你的账户余额"+getBalance());
            System.out.println("你的透支额度"+overdraft);
        } else if (this.getBalance() + overdraft > amount) {
            System.out.println("余额不足，将进行信用支付");
            System.out.println();
            overdraft-=amount-getBalance();
            setBalance(0);
            System.out.println("你的账户余额"+getBalance());
            System.out.println("你的透支额度"+overdraft);
        }
        else {System.out.println("超出透支额度");
        System.out.println("你的账户余额"+getBalance());
        System.out.println("你的透支额度"+overdraft);
        }}
    }

