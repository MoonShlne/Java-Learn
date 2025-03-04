package com.myself05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/21 22:14
 */
public class ObjectStreamTest {
    @Test
    public void test1() throws IOException {
        File file = new File("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\chapter_15\\src\\com\\myself05\\document.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeUTF("shark");
        oos.close();

    }

    @Test
    public void test2() throws IOException {
        File file = new File("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\chapter_15\\src\\com\\myself05\\document.txt");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println(ois.readUTF());

        ois.close();
    }

}
