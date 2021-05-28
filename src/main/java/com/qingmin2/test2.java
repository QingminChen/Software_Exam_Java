package com.qingmin2;

public class test2 {
    public static void main(String args[]){
        MenuComponent allMenus=new Menu("ALL MENUS");
        MenuComponent dinnerMenus=new Menu("DINNER MENUS");
        MenuComponent menuItem=new MenuItem("Item MENUS",23.0);
        allMenus.add(dinnerMenus);
        allMenus.add(menuItem);
        allMenus.print();
        System.out.println("123");
    }
}
