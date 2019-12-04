package org.haoxin.java.day01;

import java.util.Scanner;

/**
 * @author huolibin@haoxin.cn
 * @date Created by sheting on 2019/12/2 11:08
 */
public class HelloWorld {
    public static void main(String[] args) {

        //创建一个jdk中用于获取终端输入信息的工具
        Scanner sc = new Scanner(System.in);

        //用工具从终端上获取用户输入的一行文字
        String name = sc.nextLine();

        //字符串拼接
       String res = name + "好看";

       //打印
        System.out.println(res);

    }
}
