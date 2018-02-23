package com.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
public class Author {

  @Id
   @Column(name = "identity")
    private int id;
    @Column(name = "First_Name")
    private String fname;

    @Column(name = "Author Age")
    private int age;
  @Column(name = "date of birth")
    private Date dob;


    //@Transient
    @Column(name = "Last_Name")
    private  String lname;

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
                ", dob='" + dob + '\'' +
                '}';
    }
}


