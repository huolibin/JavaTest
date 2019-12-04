package org.haoxin.java.day01;

import java.util.Scanner;

/**
 * @author huolibin@haoxin.cn
 * @date Created by sheting on 2019/12/2 16:31
 */
public class TwoNumberAnd {
    public static void main(String[] args) {
        System.out.println("请输入两个数值...");
        Scanner sc = new Scanner(System.in);

        int a1;
        int a2;
        //获取第一个值
            System.out.println("请输入第一个数值：");
            String num1 = sc.nextLine();
            a1 = Integer.parseInt(num1);

            //获取第二个值
            System.out.println("请输入第二个数值：");
            String num2 = sc.nextLine();
            a2 = Integer.parseInt(num1);


        //相加
        int res =  a1+ a2;

        //输出
        System.out.println("两个数值相加等于："+res);
    }
}
