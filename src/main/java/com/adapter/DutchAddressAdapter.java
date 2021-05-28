package com.adapter;

public class DutchAddressAdapter extends DutchAddress{
    private Address address;

    public DutchAddressAdapter(Address addr){
        address=addr;
    }

    public void straat(){
        address.street();
    }

    public void postcode(){
        address.zip();
    }

    public void plaats(){
        address.city();
    }
}
