package myself02.project;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/9 22:07
 * 对该类加一下类属性 ， 正好还能初始化 列数组
 */
public class CustomerView {
    private CustomerList customers= new CustomerList(10);
    public static void main(String[] args) {
        CustomerView view =new CustomerView();
        view.enterMainMenu();
    }
    /**
     * 用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
     */
    public void enterMainMenu() {
        System.out.println("-----------------拼电商客户管理系统-----------------");
        System.out.println();
        System.out.println("1 添 加 客 户");
        System.out.println("2 修 改 客 户");
        System.out.println("3 删 除 客 户");
        System.out.println("4 客 户 列 表");
        System.out.println("5 退      出");
        System.out.println();
        System.out.println("请选择(1-5)：_");
        int choose=CMUtility.readMenuSelection();
        if (choose=='5'){
            System.out.println("确认退出？y/n");
            char key= CMUtility.readConfirmSelection();
            if (key=='Y'){
                System.out.println("再见");
            }
            else {
                enterMainMenu();
            }
        }
        else if (choose=='1'){
            addNewCustomer();
            enterMainMenu();
        }
        else if (choose=='2'){
            modifyCustomer();
            enterMainMenu();
        }
        else if (choose=='3'){
            deleteCustomer();
            enterMainMenu();
        }
        else if (choose=='4'){
            listAllCustomers();
            enterMainMenu();
        }
    }

    private void addNewCustomer() {
        Customer c1 = new Customer();
        System.out.println("---------------------添加客户---------------------");
        System.out.println("姓名：");
        c1.setName(CMUtility.readString(3));
        System.out.println("性别");
        c1.setGender(CMUtility.readChar());
        System.out.println("年龄：");
        c1.setAge(CMUtility.readInt());
        System.out.println("电话：");
        c1.setPhone(CMUtility.readString(15));
        System.out.println("邮箱：");
        c1.setEmail(CMUtility.readString(15));

        customers.addCustomer(c1); // 将客户添加到列表中
        System.out.println("---------------------添加完成---------------------");
    }

    private void modifyCustomer() {
        Customer c1 = new Customer();
        System.out.println("请选择待修改客户编号(-1退出)：");
        int choose = CMUtility.readInt();
        if (choose ==-1){
        enterMainMenu();
        }
        else if (choose  <= customers.getTotal()){
            System.out.println("---------------------修改客户---------------------");
            System.out.println("姓名：");
            c1.setName(CMUtility.readString(8,customers.getCustomer(choose-1).getName()));
            System.out.println("性别：");
            c1.setGender(CMUtility.readChar(customers.getCustomer(choose-1).getGender()));
            System.out.println("年龄：");
            c1.setAge(CMUtility.readInt(customers.getCustomer(choose-1).getAge()));
            System.out.println("电话：");
            c1.setPhone(CMUtility.readString(15,customers.getCustomer(choose-1).getPhone()));
            System.out.println("邮箱：");
            c1.setEmail(CMUtility.readString(15,customers.getCustomer(choose-1).getEmail()));

            customers.replaceCustomer(choose-1, c1); // 将客户添加到列表中
            System.out.println("---------------------修改完成---------------------");
        }
        else {
            System.out.println("索引用户无效,重新输入");
            modifyCustomer();
        }
    }

    private void deleteCustomer() {
        System.out.println("请选择待删除客户编号(-1退出)：");
        int choose = CMUtility.readInt();
        if (choose ==-1){
            enterMainMenu();
        }
        else {
            customers.deleteCustomer(choose-1);
        }
    }
    private void listAllCustomers() {
    customers.getAllCustomers();
    }


}
