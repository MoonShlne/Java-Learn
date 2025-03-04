package com.myself03.more;

import com.sun.tools.javac.Main;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/4 21:09
 */
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
//        objects =(Objects) strings;
 
        ArrayList<String> strings1 = new ArrayList<>();
        List<?> list = new ArrayList<>();
        list=strings1;






    }
}

