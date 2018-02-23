package com.hibernate.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Author {

    @Id
    private int id;
    private String fname;
    private  String lname;
    private int age;
    private Date dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}

