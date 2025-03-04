package myself05._super.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 14:02
 */
public class Interview02{
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        s.setInfo("大硅谷");
//        System.out.println(s.getInfo());
//        System.out.println(s.info);
//        System.out.println(f.info);
        Father f2 = new Father();

    }
}
class Father{
     String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son extends Father{
     String info = "尚硅谷";
    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
