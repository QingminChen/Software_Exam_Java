package com.prototypepattern;

import sun.lwawt.macosx.CPrinterDevice;

public class WorkResume {
    public static void main(String[] args){
//        Resume abc =new Resume();
//        Resume def =new Resume("Bunny");
//        abc=def;
//        System.out.println(abc);
        Resume a = new Resume("Qingmin");
        a.setPersonInfo("female","33");
        a.setWorkExperience("2011-2012","DTV");
        Resume b=(Resume) a.clone();
        b.setWorkExperience("2012-2013","CSST");
//        b.setWorkExperience();
    }
}
