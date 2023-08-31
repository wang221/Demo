package com.wangshun;
/*
* 通过键盘输入两个整数[x,y]求它们的和[sum]、差[difference]、积[product]、商[quotient]、模[remainder]。
* */
import java.util.Scanner;

public class 作业5_求整数和差积商 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数x：");
        int x = scanner.nextInt();
        System.out.print("请输入整数：");
        int y = scanner.nextInt();
        int sum = x+y;
        System.out.println("它们的和为："+sum);
        int difference = x-y;
        System.out.println("它们的差为："+difference);
        int product = x*y;
        System.out.println("它们的积为："+product);
        int quotient = x/y;//这里不是double会出现报错的情况，精度会丢。如果想要小数就用double,
        // 相用整数就用整数，需要类型强制转换
        System.out.println("它们的商为："+quotient);
        int remainder = x%y;
        System.out.println("它们的模为："+remainder);
        scanner.close();
    }
}
