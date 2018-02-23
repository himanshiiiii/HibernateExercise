package com.hibernate.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {

    @Id
    @Column(name = "identity")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Id @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(name = "First_Name")
    private String fname;
    @Transient
    @Column(name = "Last_Name")
    private  String lname;
    @Column(name = "Author Age")
    private int age;
    @Temporal(TemporalType.DATE)
    @Column(name = "date of birth")
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

