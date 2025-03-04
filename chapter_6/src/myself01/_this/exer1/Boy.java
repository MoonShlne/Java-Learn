package myself01._this.exer1;

import javax.lang.model.element.Name;
import java.security.PublicKey;
import java.util.GregorianCalendar;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/8 15:18
 * 根据图示，添加必要的构造器，综合应用构造器的重载，this关键字。
 */
public class Boy {
    private String name;
    private  int age;

public Boy(){}
    public Boy(String name){
    this.name=name;
    }
    public Boy(String name ,int age){
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
    public void   marry(Girl girl){
        System.out.println("我喜欢"+ girl.getName());
    }
    public void  shout(){

    }
}
