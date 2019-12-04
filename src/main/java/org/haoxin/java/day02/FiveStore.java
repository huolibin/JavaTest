package org.haoxin.java.day02;

import java.util.Scanner;

/**
 * @author huolibin@haoxin.cn
 * @date Created by sheting on 2019/12/3 14:56
 *
 * 数组
 *
 * 求总成绩和平均值
 */
public class FiveStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //定义一个数组
        float[] score = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入成绩：");
            String s = sc.nextLine();
            float v = Float.parseFloat(s);
            score[i] =v;
        }

        //求总成绩
        float sum =0;
        for (int i = 0; i < 5; i++) {
            sum +=score[i];
        }
        System.out.println("总成绩是："+ sum);

        //求平均值
        System.out.println("平均值是："+ sum/5);
    }
}
