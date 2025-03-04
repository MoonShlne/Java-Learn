package myself06.polymorphism.interview;

/**
 * @author shkstart
 * @create 10:31
 */
class  Base {
    int count = 10;
    public void display() {
        this.count++;
        System.out.println(count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        this.count++;
        System.out.println(count);
    }
    public  void  countPlus(){
        super.display();
    }
}

public class FieldMethodTest {
    public static void main(String[] args){
        Sub s = new Sub();
        s.display();
        s.countPlus();

        Base b= s;
        b.display();

        System.out.println(s.count);
        System.out.println(b.count);

//        System.out.println(s.count);//
//        s.display();//

//        System.out.println(b == s); //
//        System.out.println(b.count);//
//        b.display();//
//
//        Base b1 = new Base();
//        System.out.println(b1.count); //
//        b1.display();//
    }
}
