package com.qingmin2;
import java.util.*;

//public abstract class MenuComponent {
abstract public class MenuComponent {
    protected String name;
    public abstract void add(MenuComponent menuComponent);
    abstract public void print();
    public String getName(){return name;}
}
