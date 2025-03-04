package myself01._this.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/8 15:20
 */
public class Girl {
    private String name ;
    private  int age;

    public Girl(){}
    public Girl(String name){
        this.name=name;
    }
    public Girl(String name ,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void   marry(Boy boy){
        System.out.println("我喜欢"+boy.getName());
        boy.marry(this);

    }
}
