package com.Jitorun.pojo;

public class student {
    private int id;
    private String sname;
    private String sex;

    public student(){}

    public student(int id,String sname ,String sex){
        this.id=id;
        this.sname=sname;
        this.sex=sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
