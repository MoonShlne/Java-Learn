package com.myself08._interface.apply;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 14:24
 */
public class UsbTest {
    public static void main(String[] args) {
        computer pc =new computer() ;
        USB  camera  =new camera();
//        pc.work(camera);
        pc.work(new camera());
        pc.work(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }


}

class  computer{
    public  void work(USB usb){
        System.out.println( "开始工作");
        usb.start();

        usb.stop();

        System.out.println("结束工作");
    }
}

interface  USB{
    String maker ="铜";


    void  start();
    void  stop();
}

class camera implements  USB{
    @Override
    public void start() {
        System.out.println("camera开始工作");
    }

    @Override
    public void stop() {
        System.out.println("工作结束");
    }
}
