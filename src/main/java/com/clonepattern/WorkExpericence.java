package com.clonepattern;

public class WorkExpericence implements Cloneable{
    private String workDate;
    private String company;
    public Object clone(){
        WorkExpericence obj=new WorkExpericence();
        obj.workDate=this.workDate;
        obj.company=this.company;
        return obj;
    }

}
