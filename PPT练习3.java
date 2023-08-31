package com.wangshun;

import java.util.Scanner;

public class PPT练习3 {
    public static void main(String[] args) {
        System.out.println("请输入4位会员卡号：");
        Scanner scanner = new Scanner(System.in);
        int carid = scanner.nextInt();
        scanner.close();
        System.out.println("会员卡号是："+carid);
        int qianwei = carid/1000;
        int baiwei = carid%1000/100;
        int shiwei = carid%100/10;
        int gewei = carid%10;
        System.out.println("千位数："+qianwei+"，百位数："+baiwei+"，十位数："+shiwei+"，个位数："+gewei);
        int sum = qianwei+baiwei+shiwei+gewei;
        System.out.println("会员卡号"+carid+"各位之和："+sum);
    }
}
