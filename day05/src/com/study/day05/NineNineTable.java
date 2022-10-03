package com.study.day05;

/**
 * @Description: JavaBase
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/2 16:20
 */
/*
嵌套循环的应用1：

九九乘法表
1 * 1 = 1
2 * 1 = 2  2 * 2 = 4
。。。
9 * 1 = 9 。。。 9 * 9 = 81


*/
class NineNineTable {
    public static void main(String[] args) {

        for(int i = 1;i <= 9;i++){

            for(int j = 1;j <= i;j++){
                System.out.print(i + " * " + j + " = " + (i * j) + "  ");
            }

            System.out.println();
        }


    }
}

