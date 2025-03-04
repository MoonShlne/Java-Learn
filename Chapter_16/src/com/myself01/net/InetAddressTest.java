package com.myself01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/22 16:08
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        InetAddress inet = InetAddress.getLocalHost();
        System.out.println(byName);
        System.out.println(inet);

        System.out.println(inet.getHostName());
        System.out.println(inet.getHostAddress());
    }
}
