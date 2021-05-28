package com.Decorator1;

public class FooterDecorator extends Decorator{
    public FooterDecorator(Invoice t){
        super(t);
    }

    public void printInvoice(){
        super.printInvoice();
//        ticket.printInvoice();
        System.out.println("This is the content of the Footer!");
    }
}
