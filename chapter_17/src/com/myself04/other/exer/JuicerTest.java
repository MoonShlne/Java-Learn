package com.myself04.other.exer;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/25 22:14
 */
public class JuicerTest {
    static <T> T invoke(String fruitName) throws Exception {
        Class<?> aClass = Class.forName(fruitName);
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        return (T) o;
    }


    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\chapter_17\\src\\com\\myself04\\other\\exer\\config.properties");
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
        String fruitName = properties.getProperty("fruitName");
        Juicer juicer = new Juicer();
        juicer.run(invoke(fruitName));
    }
}
