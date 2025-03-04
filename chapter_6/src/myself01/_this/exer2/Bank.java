package myself01._this.exer2;

import java.security.PrivateKey;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/8 15:56
 * - addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer对象，然后把它放到 customer 数组中。
 *   还必须把 numberOfCustomer 属性的值加 1。
 * - getNumOfCustomers 方法返回 numberofCustomers 属性值。
 * - getCustomer方法返回与给出的index参数相关的客户。
 */
public class Bank {
     private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers =new  Customer[10];
    }

    public void addCustomer(String f,String l){
        customers[numberOfCustomer++]= new Customer(f,l);
    }
    public int  getNumOfCustomer(){
        return  numberOfCustomer;
    }
    public  Customer  getCustomer(int index){
      return customers[index];
    }

}
