package com.prototypepattern2;

class Resume implements Cloneable {
    private String name;
    private int age;
    private String sex;
    private String tel;
    private String workExperience;

    public Resume(String name, int age, String sex, String tel, String workExperience) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
        this.workExperience = workExperience;
    }

    public Resume(String name, int age, String sex, String tel) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
    }

    public Resume() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Resume{name=" + name + ", age=" + age + ", sex=" + sex + ", tel=" + tel + ", workExperience=" + workExperience + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
