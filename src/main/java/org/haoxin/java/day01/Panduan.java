package org.haoxin.java.day01;

import java.util.Scanner;

/**
 * @author huolibin@haoxin.cn
 * @date Created by sheting on 2019/12/2 17:11
 *
 * if判断中  字符串相等 使用 equals
 */
public class Panduan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //读取数据
        String name = sc.nextLine();

        //判断输出
        if (name.equals("tom") ){
            System.out.println("欢迎您，tom");
        }else if (name.equals("jim")){
            System.out.println("你好，jim");
        }else {
            System.out.println("滚蛋，你在本系统没有权限");
        }
    }
}
