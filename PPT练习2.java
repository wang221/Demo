package com.wangshun;

import java.util.Scanner;

public class PPT练习2 {
    public static void main(String[] args) {
        System.out.println("请输入4位卡号：");
        Scanner scanner = new Scanner(System.in);
        int cardid = scanner.nextInt();
        System.out.println("会员卡号是："+cardid);
        scanner.close();
    }
}
