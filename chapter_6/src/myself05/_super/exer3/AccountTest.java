package myself05._super.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/11 16:44
 * 写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 * 使用withdraw方法提款30000元，并打印余额。
 * 再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 */
public class AccountTest {
    public static void main(String[] args) {
//        Account a1 =new Account(1122,20000,0.045);
//        a1.withdraw(30000);
//        System.out.println(a1.getBalance());
//        a1.withdraw(2500);
//        a1.deposit(3000);
//        System.out.println(a1.getBalance());
//        System.out.println(a1.getMonthlyInterest());
        CheckAccount c1 = new CheckAccount(1122,20000,0.045,5000);
        c1.withdraw(5000);
        System.out.println("--------------------------------");
        c1.withdraw(18000);
        System.out.println("--------------------------------");
        c1.withdraw(3000);
    }
}
