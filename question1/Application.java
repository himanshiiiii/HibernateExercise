package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Author author1 = new Author();
        author1.setId(1);
        author1.setFname("himanshi");
        author1.setLname("gupta");
        author1.setAge(25);
        session.save(author1);

        Author author2 = new Author();
        author2.setId(2);
        author2.setFname("chetan");
        author2.setLname("bhagat");
        author2.setAge(22);
        session.save(author2);

        Author author3 = new Author();
        author3.setId(3);
        author3.setFname("ravindra");
        author3.setLname("singh");
        author3.setAge(30);
        session.save(author3);

        Author author4 = new Author();
        author4.setId(4);
        author4.setFname("david");
        author4.setLname("peter");
        author4.setAge(35);
        session.save(author4);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}