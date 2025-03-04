package myself04.override.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/10 16:22
 * - 成员变量int yearsOld；
 * - 方法printAge()打印yearsOld的值。
 */
public class Kid extends ManKind {
    private int yearsOld;


    public Kid(){}
    public Kid(int yearsOld , int sex, int salary) {
        this.yearsOld = yearsOld;
        setSalary(salary);
        setSex(sex);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public  void  printAge(){
        System.out.println(yearsOld);
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
}
