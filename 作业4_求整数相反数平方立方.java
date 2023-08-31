package com.wangshun;
/*
* 通过键盘输入一个整数[x]求其相反数[opposite]，平方[square]，立方[cube]。
* */
import java.util.Scanner;

public class 作业4_求整数相反数平方立方 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数x:");
        int x = scanner.nextInt();
        int oppasite = 0-x;
        System.out.println("x的相反数为："+oppasite);
        int square = x*x;
        System.out.println("x的平方为："+square);
        int cube = x*x*x;
        System.out.println("x的立方为："+cube);
        scanner.close();
    }
}
