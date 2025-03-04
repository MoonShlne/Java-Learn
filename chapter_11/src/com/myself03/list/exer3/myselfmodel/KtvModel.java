package com.myself03.list.exer3.myselfmodel;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/18 13:08
 * 【说明】
 * 使用ArrayList集合，实现编写一个模拟KTV点歌系统的程序。在程序中，
 * 指令1代表添加歌曲，
 * 指令2代表将所选歌曲置顶，
 * 指令3代表将所选歌曲提前一位，
 * 指令4代表退出该系统。
 * <p>
 * 要求根据用户输入的指令完成相关的操作。
 * <p>
 * 【提示】
 * (1) 显式界面如下：
 * System.out.println("-------------欢迎来到点歌系统------------");
 * System.out.println("1.添加歌曲至列表");
 * System.out.println("2.将歌曲置顶");
 * System.out.println("3.将歌曲前移一位");
 * System.out.println("4.退出");
 * <p>
 * (2) 程序中需要创建一个集合作为歌曲列表，并向其添加一部分歌曲
 * (3) 通过ArrayList集合定义的方法操作歌曲列表
 * (4) 本题目使用LinkedList 如何？
 */
public class KtvModel {


    public static void main(String[] args) {
        ArrayList musicList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("-------------欢迎来到点歌系统------------");
            System.out.println("1.添加歌曲至列表");
            System.out.println("2.将歌曲置顶");
            System.out.println("3.将歌曲前移一位");
            System.out.println("4.退出");
            System.out.println("5.显示歌单");
            int i = scanner.nextInt();
            if (i == 1) {
                addMusic(musicList);
            } else if (i == 2) {
                System.out.println("输入歌曲名字");
                String next = scanner.next();
                topMusic(musicList, next);
            } else if (i == 3) {
                System.out.println("输入歌曲名字");
                String next = scanner.next();
                moveMusic(musicList, next);
            } else if (i == 4) {
                System.out.println("退出成功");
                break;
            } else if (i == 5) {
                for (Object object : musicList) {
                    System.out.println(object);
                }
            } else {
                System.out.println("输入有误");
            }
        }
        scanner.close();
    }


    public static void addMusic(ArrayList ArrayList) {
        ArrayList.add("哈哈哈");
        ArrayList.add("xixixi");
        ArrayList.add("呜呜呜");
        ArrayList.add("giao");
        ArrayList.add("略略略");

    }

    public static void topMusic(ArrayList arrayList, String s) {

        int i = arrayList.indexOf(s);
        if (i < 0) {
            System.out.println("未找到歌曲");

        } else {
            arrayList.remove(i);
            arrayList.add(0, s);
        }
    }

    public static void moveMusic(ArrayList arrayList, String s) {
        int i = arrayList.indexOf(s);
        if (i < 0) {
            System.out.println("未找到歌曲");

        } else if (i == 0) {
            System.out.println("已在顶部");
        } else {
            arrayList.remove(i);
            arrayList.add(i - 1, s);
        }

    }


}
