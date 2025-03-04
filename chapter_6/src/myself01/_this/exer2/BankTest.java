package myself01._this.exer2;

import java.util.Arrays;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/8 16:33
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b1 =new Bank();
        b1.addCustomer("在","梓旭");
        b1.addCustomer("x","asdf");
//        b1.getCustomer(1).setAccount(new Account(1000));
        System.out.println(b1.getNumOfCustomer());
    }

}
