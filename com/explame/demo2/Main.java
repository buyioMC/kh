package com.explame.demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Class kaihu = new Class();
        System.out.println("输入被开户人名字：");
        String name = sc.next();

        System.out.println("输入被开户人年龄：");
        int age = sc.nextInt();

        System.out.println("输入被开户人身份证号：");
        String IDNum = sc.next();

        System.out.println("输入被开户人住址：");
        String Address = sc.next();
        kaihu.setName(name);
        kaihu.setAge(age);
        kaihu.setIDNum(IDNum);
        kaihu.setAddress(Address);
    }
}
