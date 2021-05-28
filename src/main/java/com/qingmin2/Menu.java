package com.qingmin2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponents=new ArrayList<MenuComponent>();
    Menu(String name){
        this.name = name;

    }
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void print() {
        System.out.print("\n"+getName());
        System.out.println(","+"--------------------");
        Iterator iterator=menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }


    }
}
