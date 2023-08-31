package com.wangshun;
/*
*
* */
import java.util.Scanner;

public class PPT练习4 {
    public static void main(String[] args) {
        System.out.println("请输入4位会员卡号：");
        Scanner scanner = new Scanner(System.in);
        int cardId = scanner.nextInt();
        int qianwei = cardId/1000;
        int baiwei = cardId%1000/100;
        int shiwei = cardId/10%10;
        int gewei = cardId%10;
        System.out.println("会员卡号是："+cardId);
        System.out.println("千位数："+qianwei+",百位数："+baiwei+",十位数："+shiwei+"，个位数："+gewei);
        int sum = qianwei+baiwei+shiwei+gewei;
        System.out.println("会员卡号各位之和："+sum);
        //判断是否中奖
        System.out.println(sum>20?"会员卡号"+cardId+"会员，您中奖了！奖品是MP3":"运气太差了，没中");
        scanner.close();
    }
}
