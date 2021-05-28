package com.Decorator1;

public class test1 {
    public static void main(String[] args) {
//      System.out.println("Hello");
        Invoice t=new Invoice();
        Invoice ticket;
        ticket =new HeaderDecorator(new FooterDecorator(t));
        ticket.printInvoice();
        System.out.println("-------------------------");
        ticket=new HeaderDecorator(new FooterDecorator(null));
        ticket.printInvoice();
    }
}

