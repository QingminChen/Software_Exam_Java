package com.Decorator2;

//public abstract class Beverage {//okay
//abstract public class Beverage {//okay
abstract class Beverage {
    String description="Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract int cost();
}
