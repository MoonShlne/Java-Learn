package com.myself02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Locale;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/22 16:55
 */
public class TcpTest {
    @Test
    public void test() throws IOException {

        InetAddress localHost = InetAddress.getLocalHost();
        Socket socket = new Socket(localHost, 4456);

        OutputStream ops = socket.getOutputStream();
        ops.write("昨夜花开满枝红，今朝花落万树空 ".getBytes());

        ops.close();
        socket.close();
    }

    @Test
    public void test2() throws IOException {
        ServerSocket serverSocket = new ServerSocket(4456);
        Socket socket = serverSocket.accept();
        System.out.println("接入成功");
        InputStream ips = socket.getInputStream();
        byte[] bytes = new byte[5];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len;
        while ((len = ips.read(bytes)) != -1) {
            baos.write(bytes, 0, len);
        }
        System.out.println(baos.toString());
        baos.close();
        socket.close();
        serverSocket.close();
        ips.close();

    }


}
