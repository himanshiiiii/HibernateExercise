package com.hibernate.demo;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
@Entity
public class Author{
    @Id
    private Integer id;
    private String fname;
    private String lname;
    private Integer age;
    @Temporal(TemporalType.DATE)
    private Calendar date;
    private Address address;
    @ElementCollection
    List<String> subjects= new ArrayList<>();
    public Calendar getDate() {
        return date;
    }
    public void setDate(Calendar date) {
        this.date = date;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public List<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
}
