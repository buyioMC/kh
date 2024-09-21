package com.explame.demo2;

public class Class {

    private int age;

    private String IDNum;

    private String name;

    private String Address;

    public Class() {
    }

    public void setAge(int age) {

           if(age<150) {
               this.age = age;
               System.out.println("年龄："+ this.age);
           } else {
               System.out.println("年龄过大");
       }
           return;
    }

    public void setIDNum(String IDNum) {

        if(IDNum.length() == 18) {
            this.IDNum = IDNum;
            System.out.println("身份证号："+ this.IDNum);
        } else {
            System.out.println("身份证不正确");
        }
        return;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("姓名："+ name);
        return;
    }

    public void setAddress(String Address) {
        this.Address = Address;
        System.out.println("住址：" + Address);
        return;
    }
}
