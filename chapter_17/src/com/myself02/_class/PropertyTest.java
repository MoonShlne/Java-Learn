package com.myself02._class;

import java.io.*;
import java.util.Properties;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/23 18:24
 */
public class PropertyTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\chapter_17\\src\\com\\myself02\\_class\\info.properties"));
        properties.load(fis);
//        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\chapter_17\\src\\com\\myself02\\_class\\info.properties");
//        properties.load(resourceAsStream);
        System.out.println(properties.getProperty("name"));


    }
}
