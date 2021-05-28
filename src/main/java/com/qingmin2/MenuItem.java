package com.qingmin2;

public class MenuItem extends MenuComponent {
    private double price;
    public MenuItem(String name,double price){
        this.name=name;
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void add(MenuComponent menuComponent) {
        return;
    }

    public void print() {
        System.out.print(""+getName());
        System.out.println(","+getPrice());
    }
}
