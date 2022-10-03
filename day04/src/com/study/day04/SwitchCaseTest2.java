package com.study.day04;

/**
 * @Description: JavaBase
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/2 16:07
 */
/*
编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天。

2  15:  31 + 15

5 7: 31 + 28 + 31 + 30 + 7

....

说明:break在switch-case中是可选的
*/
import java.util.Scanner;
class SwitchCaseTest2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入2019年的month：");
        int month = scan.nextInt();
        System.out.println("请输入2019年的day：");
        int day = scan.nextInt();


        //定义一个变量来保存总天数
        int sumDays = 0;

        //方式一：冗余
		/*

		if(month == 1){
			sumDays = day;
		}else if(month == 2){
			sumDays = 31 + day;
		}else if(month == 3){
			sumDays = 31 + 28 + day;
		}else if(month == 4){
			sumDays = 31 + 28 + 31 + day;
		}
		//...
		else{//month == 12
			//sumDays = ..... + day;
		}

		*/

        //方式二：冗余
		/*
		switch(month){
		case 1:
			sumDays = day;
			break;
		case 2:
			sumDays = 31 + day;
			break;
		case 3:
			sumDays = 31 + 28 + day;
			break;
		...
		}
		*/

        switch(month){
            case 12:
                sumDays += 30;
                System.out.println(12);
            case 11:
                sumDays += 31;
                System.out.println(11);
            case 10:
                sumDays += 30;
                System.out.println(10);
            case 9:
                sumDays += 31;
                System.out.println(9);
            case 8:
                sumDays += 31;
                System.out.println(8);
            case 7:
                sumDays += 30;
                System.out.println(7);
            case 6:
                sumDays += 31;
                System.out.println(6);
            case 5:
                sumDays += 30;
                System.out.println(5);
            case 4:
                sumDays += 31;
                System.out.println(4);
            case 3:
                sumDays += 28;
                System.out.println(3);
            case 2:
                sumDays += 31;
                System.out.println(2);
            case 1:
                sumDays += day;
                System.out.println(1);
        }

        System.out.println("2019年" + month + "月" + day + "日是当年的第" + sumDays + "天");
    }
}

