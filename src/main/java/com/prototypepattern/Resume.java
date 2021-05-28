package com.prototypepattern;

public class Resume implements Cloneable{
//public class Resume{
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;
    public  Resume(){

    }
    public Resume(String name){
        this.name=name;
        work=new WorkExperience();
    }
    private Resume(WorkExperience work){
//      this.work=(WorkExperience)work.clone();   //The reason why here we use deep copy is that we wanna create new object with same values, if just use this.work=work,you will copy the refernce to the new object and when you set the new value to the new object the nnew value will overwrite the old value, we wanna maintain the both copies
        this.work=work;
    }
    public void setPersonInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }
    public void setWorkExperience(String workDate,String company){
//        WorkExperience work = new WorkExperience(workDate,company);
//        this.work=work;
        this.work.setWorkExperience(workDate,company);
    }

    public WorkExperience getWorkExperience(){
        return this.work;
    }
    public Object clone(){
        Resume obj=new Resume(this.work);
        obj.name=this.name;
        obj.sex=this.sex;
        obj.age=this.age;
        return obj;
    }
}
