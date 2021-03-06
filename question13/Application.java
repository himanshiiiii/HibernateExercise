package com.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author obj1= session.get(Author.class,3);
        List<String> sub1= new ArrayList<String>();
        sub1.add("DS"); sub1.add("ALGO");
        sub1.add("CN");
        obj1.setSubjects(sub1);
        session.update(obj1);
        Author obj2= session.get(Author.class,4);
        List<String> sub2= new ArrayList<String>();
        sub2.add("OS"); sub2.add("ALGO");
        sub2.add("CN");
        obj2.setSubjects(sub2);
        session.update(obj2);
        Author obj3= session.get(Author.class,5);
        List<String> sub3= new ArrayList<String>();
        sub3.add("OS"); sub3.add("C++");
        sub3.add("CN");
        obj3.setSubjects(sub3);
        session.update(obj3);
        Author obj4= session.get(Author.class,6);
        List<String> sub4= new ArrayList<String>();
        sub4.add("DS"); sub4.add("ALGO");
        sub4.add("OS");
        obj4.setSubjects(sub4);
        session.update(obj4);
        Author obj5= session.get(Author.class,10);
        List<String> sub5= new ArrayList<String>();
        sub5.add("DBMS"); sub5.add("DATA MINING");
        sub5.add("MACHINE LEARNING");
        obj5.setSubjects(sub5);
        session.update(obj5);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("File Executed");
    }
}
