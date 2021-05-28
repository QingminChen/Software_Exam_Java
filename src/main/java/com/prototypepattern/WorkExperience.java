package com.prototypepattern;

public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;
    public WorkExperience(){

    }
    public WorkExperience(String workDate, String company){
        this.workDate=workDate;
        this.company=company;
    }
    public Object clone(){
        WorkExperience obj=new WorkExperience();
        obj.workDate=this.workDate;
        obj.company=this.company;
        return obj;
    }

    public void setWorkExperience(String workDate,String company){
        this.workDate=workDate;
        this.company=company;
    }
}
