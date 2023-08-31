package com.wangshun;
/*
*
* */
import java.util.Scanner;

public class 作业2_自我介绍 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请开始进行你的自我介绍：");
        String name = scanner.next();
        System.out.println("我的姓名："+name);
        int age = scanner.nextInt();
        System.out.println("我的年龄："+age+"岁");
        int years = scanner.nextInt();
        System.out.println("我的工作年限为："+years+"年");
        String skill = scanner.next();
        System.out.println("我的技术方向是："+skill);
        String hobby = scanner.next();
        System.out.println("我的兴趣爱好是："+hobby);
        scanner.close();
    }
}
