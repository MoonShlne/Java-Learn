package myself06.polymorphism.exer4;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 15:21
 * 1）public static void meeting(Person...  ps)
 * 在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟；如果是女人，随后化个妆
 *
 * （2）public static void main(String[] args)
 * 在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试
 */
public class PersonTest {
    public static  void  meeting(Person... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if (ps[i] instanceof  Man){
                Man  m1 =(Man) ps[i];
                m1.smoke();
            }
            else if (ps[i] instanceof  Woman){
                Woman m1=(Woman) ps[i];
                m1.makeup();
            }
        }


    }

    public static void main(String[] args) {

        Person p1 =new Man();
        Person p2 =new Man();
        Person p3 =new Woman();
        Person p4=new Woman();


        meeting(p3,p1,p2);


    }
}
