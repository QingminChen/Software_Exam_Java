package com.Decorator1;

public class HeaderDecorator extends Decorator {
    public HeaderDecorator(Invoice t) {
        super(t);
    }

    public void printInvoice(){
        System.out.println("This is the content of the Header!");
        super.printInvoice();
//        ticket.printInvoice();
    }
}
