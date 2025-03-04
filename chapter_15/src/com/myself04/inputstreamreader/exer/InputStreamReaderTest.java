package com.myself04.inputstreamreader.exer;

import java.io.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/21 16:20
 * 把当前module下的《康师傅的话.txt》字符编码为GBK，复制到电脑桌面目录下的《寄语.txt》，
 */
public class InputStreamReaderTest {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File Input = new File("C:\\Users\\polar\\OneDrive - frtouch\\project\\A_learn\\java\\learn_尚硅谷2\\chapter_15\\src\\com\\myself04\\康师傅的话.txt");
            File OutPut = new File("C:\\Users\\polar\\Desktop\\新话.txt");

            FileInputStream fis = new FileInputStream(Input);
            FileOutputStream fos = new FileOutputStream(OutPut);

            isr = new InputStreamReader(fis, "gbk");
            osw = new OutputStreamWriter(fos, "utf-8");

            char[] chars = new char[50];
            int len;
            while ((len = isr.read(chars)) != -1) {
                osw.write(chars, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {

                if (isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


            try {

                if (osw != null) {
                    osw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
