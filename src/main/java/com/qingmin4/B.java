package com.qingmin4;

public class B extends A{
    private String nameB="B";

    public void getWhat(){
        super.getName();
    }


    public static void main(String[] args) {
        B b=new B();
        b.getName();
        b.getWhat();

    }
}
