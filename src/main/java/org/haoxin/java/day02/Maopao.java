package org.haoxin.java.day02;

/**
 * @author huolibin@haoxin.cn
 * @date Created by sheting on 2019/12/3 15:37
 *
 * 冒泡排序
 */
public class Maopao {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 30;
        arr[1] = 50;
        arr[2] = 80;
        arr[3] = 40;
        arr[4] = 20;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }


        //打印排序后的结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
