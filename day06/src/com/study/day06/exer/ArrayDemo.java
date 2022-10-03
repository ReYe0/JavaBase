package com.study.day06.exer;

/**
 * @Description: JavaBase
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/2 16:53
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[] { 8, 2, 1, 0, 3 };
        int[] index = new int[] { 2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3 };
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);//18...
    }

}

