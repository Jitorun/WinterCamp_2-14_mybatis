package com.Jitorun.pojo;

public class teacher {
    private int id;
    private String tname;
    private int tclass;
    public teacher(){};
    public teacher(int id,String tname,int tclass){
        this.id=id;
        this.tname=tname;
        this.tclass=tclass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTclass() {
        return tclass;
    }

    public void setTclass(int tclass) {
        this.tclass = tclass;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", tclass=" + tclass +
                '}';
    }
}
