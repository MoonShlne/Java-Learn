package com.myself02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/22 18:44
 * 客户端发送文件给服务端，服务端保存在本地,并且服务端发送给客户端成功发送提醒
 */
public class TcpTest2 {
    @Test
    public void client() throws IOException {
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = new Socket(host, 6666);
        File file = new File("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\Chapter_16\\src\\com\\myself02\\tcpudp\\picture.png");
        //创建流
        OutputStream ops = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(file);
        //发送文件
        byte[] bytes = new byte[5];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            ops.write(bytes, 0, len);
        }

        System.out.println("数据发送完毕");
        socket.shutdownOutput();

        //接收服务端的消息
        byte[] getInfo = new byte[5];
        int len1;
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len1 = is.read(getInfo)) != -1) {
            bos.write(getInfo, 0, len1);
        }
        System.out.println(bos.toString());


        //关闭资源
        socket.close();
        ops.close();
        fis.close();
        is.close();
        bos.close();
    }

    @Test
    public void server() throws IOException {
        //创建socket
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        System.out.println("建立链接成功！");
        File file = new File("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\Chapter_16\\src\\com\\myself02\\tcpudp\\picture_copy.png");
        //创建流
        FileOutputStream fos = new FileOutputStream(file);
        InputStream inputStream = socket.getInputStream();

        //执行操作
        byte[] bytes = new byte[6];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        System.out.println("数据接收完成");

        OutputStream os = socket.getOutputStream();
        os.write("数据接收成功--来自服务端".getBytes());

        //关闭源
        os.close();
        serverSocket.close();
        socket.close();
        fos.close();
        inputStream.close();

    }

    @Test
    public void test(){
        Object o= new String("aa");
        System.out.println(o.getClass());
    }
}
