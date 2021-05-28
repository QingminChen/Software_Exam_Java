package com.prototypepattern2;


public class Client {

    public static void main(String[] args) {
        //传统方式
//        Resume r1 = new Resume("张三", 20, "男", "13022220000");
//        r1.setWorkExperience("2008-2012 某科技公司 开发工程师");
//
//        Resume r2 = new Resume("张三", 20, "男", "13022220000");
//        r2.setWorkExperience("2012-2014 某电商公司 销售经理");
//
//        System.out.println(r1);
//        System.out.println(r2);
//
//        System.out.print("n");

        /*
         * 使用原型模式
         * 实例prototype是将要被复制的类，即具体原型
         */
//        Resume prototype = new Resume("李四原", 30, "女", "18033332222");
//        WorkExperience abc = new WorkExperience("2011-06-01","DTV");
        Resume resume = new Resume("李四原", 30, "女", "18033332222","2011-06-01,DTV");
        try {
            //克隆得到的新对象
            Resume r3 = (Resume) resume.clone();
            Resume r4 = (Resume) resume.clone();

            r3.setWorkExperience("2000-2004 Google公司 CTO");
            r4.setWorkExperience("2004-2006 Amazon公司 CFO");

            System.out.println(resume);
            System.out.println(r3);
            System.out.println(r4);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
