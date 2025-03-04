package com.myself02.filestream;


import org.junit.Test;

import java.io.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/19 17:43
 */
public class FileReaderWriterTest {
    @Test
    public void test1() throws IOException {
        File file = new File("TestForReader.txt");
        FileReader fileReader = new FileReader(file);
        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }

        fileReader.close();
    }

    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            File file = new File("TestForReader.txt");
            fileReader = new FileReader(file);
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Test
    public void test3() {
        FileReader fileReader = null;
        try {
            File file = new File("TestForReader.txt");
            fileReader = new FileReader(file);
            char[] info = new char[5];
            int len;
            while ((len = fileReader.read(info)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(info[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Test
    public void test4() {
        FileWriter fileWriter = null;
        try {
            File file = new File("outPut");

            fileWriter = new FileWriter(file, true);

            fileWriter.write("你好~\n");
            fileWriter.write("我不好\n");
            fileWriter.write("那行吧\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /*
    复制一份output，命名为hello_copy
     */
    @Test
    public void test5() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File for_write = new File("hello_copy");
            File for_read = new File("output");

            fileReader = new FileReader(for_read);
            fileWriter = new FileWriter(for_write, false);

            char[] chars = new char[5];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    fileWriter.write(chars[i]);
//                }
                //新方法！
                fileWriter.write(chars, 0, len);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
               e.printStackTrace();
            } finally {
                if (fileWriter != null) {
                    fileReader.close();
                }
            }

        }
    }
}
