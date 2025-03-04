package myself02.project;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/9 20:20
 *  感受  删除对象时候 total要-1 不然后续会空指针
 *
 */
public class CustomerList {
    public static void main(String[] args) {
        CustomerList  customerList =new CustomerList(5);
        customerList.addCustomer(new Customer("ass",'男',21,"110","110@qq.com"));
        customerList.addCustomer(new Customer("pig",'男',21,"119","119@qq.com"));
        customerList.addCustomer(new Customer("ghr",'男',21,"120","120@qq.com"));
        customerList.addCustomer(new Customer("lw",'男',21,"911","911@qq.com"));
        customerList.addCustomer(new Customer("lw",'男',22,"911","911@qq.com"));
        customerList.addCustomer(new Customer("lw",'男',23,"911","911@qq.com"));
//        customerList.getAllCustomers();
//        Customer c1 =new Customer("zzx",'男',11,"110","110@qq.com");
//        customerList.replaceCustomer(0,c1);
//        customerList.deleteCustomer(6);
//        customerList.getAllCustomers();
//        customerList.deleteCustomer(0);
        customerList.getAllCustomers();
        System.out.println(customerList.getTotal());
        System.out.println(customerList.getCustomer(1).getName());
//        System.out.println(customerList.getCustomer(1).getName());
//        System.out.println(customerList.getTotal());
    }

    private Customer[] customers;
    private int  total;

    /**
     * 用途：构造器，用来初始化customers数组
     * 参数：totalCustomer：指定customers数组的最大空间
     *
     * @param totalCustomer 指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 用途：将参数customer添加组中最后一个客户对象记录之后
     * 参数：customer指定要添加的客户对象
     *
     * @param customer 指定对象
     * @return 添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer) {
        if (customers.length != total) {
            customers[total++] = customer;
            return true;
        } else return false;
    }

    /**
     * 用途：用参数customer替换数组中由index指定的对象
     * 参数：customer指定替换的新客户对象
     * index指定所替换对象在数组中的位置，从0开始
     * 返回：替换成功返回true；false表示索引无效，无法替换
     *
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index >=  total || index < 0) {
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }

    /**
     * 用途：从数组中删除参数index指定索引位置的客户对象记录
     * 参数： index指定所删除对象在数组中的索引位置，从0开始
     * 返回：删除成功返回true；false表示索引无效，无法删除
     *
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index) {
        if (index >= total || index <0) {
            return false;
        } else {
            Customer[] newcustomers = new Customer[customers.length];
            for (int i = 0; i < index; i++) {
                 newcustomers[i] = customers[i];
            }
            for (int i = index; i <customers.length-1 ; i++) {
                newcustomers[i]=customers[i+1];
            }
            for (int i = 0; i < customers.length; i++) {
                customers[i]=newcustomers[i];
            }
            total-=1;
        return true;
        }
    }

    /**
     * 用途：返回数组中记录的所有客户对象
     * 返回： Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
     * @return
     */
    public Customer[] getAllCustomers() {
        System.out.println("------------------------客户列表--------------------------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱");
        for (int i = 0; i < total; i++) {
            System.out.println(i+1 +"\t\t" +customers[i].getName()+"\t\t"+
                    customers[i].getGender()+"\t\t"+customers[i].getAge()+"\t\t"+
                    customers[i].getPhone()+"\t\t\t\t"+customers[i].getEmail());
        }
        System.out.println("------------------------客户列表完成------------------------------");

        return  customers;
    }

    /**
     * 用途：返回参数index指定索引位置的客户对象记录
     * @param index   指定所要获取的客户在数组中的索引位置，从0开始
     * @return 封装了客户信息的Customer对象
     */
    public Customer getCustomer(int index) {
        if (index >=0 && index <total){
            return customers[index];
        }
        else return null;
    }

    public int getTotal() {
    return total;

    }


}
