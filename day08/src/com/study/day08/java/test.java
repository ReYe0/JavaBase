package com.study.day08.java;

/**
 * @Description: JavaBase
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/2 17:17
 */

public class test {
    public static void main(String[] args) {
        int i = 21;
//		i = -21;
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        System.out.println("i << 27 :" + (i << 27));

        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));
        System.out.println("m | n :" + (m | n));
        System.out.println("m ^ n :" + (m ^ n));
    }
}

