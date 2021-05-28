package com.adapter;

public class Test {
    public static void main(String[] args) {
        Address addr= new Address();
        DutchAddress addrAdapter=new DutchAddressAdapter(addr);
        addrAdapter.straat();
        addrAdapter.postcode();
        addrAdapter.plaats();
    }
}
