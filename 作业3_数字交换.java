package com.wangshun;
/*
* 编程实现三个数字[a,b,c]的交换，即1，2，3交换后变成2，3，1。
* */
public class 作业3_数字交换 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        //System.out.println("三个数字交换之前:"+"a为："+a+",b为："+b+",c为："+c);
        System.out.println("交换之前："+a+","+b+","+c);
        int temp;
        temp = a;
        a = c;//a为3
        c = temp;//c为1；3，2，1
        temp = b;
        b = a;
        a = temp;
        System.out.println("交换之后："+a+","+b+","+c);
    }
}
