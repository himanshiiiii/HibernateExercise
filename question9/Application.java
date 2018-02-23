package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.sql.Date;

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
       author1.setDob(Date.valueOf("1992-12-1"));
        session.save(author1);

        Author author2 = new Author();
        author2.setId(2);
        author2.setFname("chetan");
        author2.setLname("bhagat");
        author2.setAge(22);
        author2.setDob(Date.valueOf("1992-12-4"));
        session.save(author2);

        Author author3 = new Author();
        author3.setId(3);
        author3.setFname("ravindra");
        author3.setLname("singh");
        author3.setAge(30);
        author3.setDob(Date.valueOf("1992-12-4"));
        session.save(author3);

        Author author4 = new Author();
        author4.setId(4);
        author4.setFname("ravindra");
        author4.setLname("singh");
        author4.setAge(55);
        author4.setDob(Date.valueOf("1992-12-4"));
        session.save(author4);



        Author author5 = new Author();
        author5.setId(5);
        author5.setFname("rava");
        author5.setLname("singh");
        author5.setAge(44);
        author5.setDob(Date.valueOf("1995-12-4"));
        session.save(author5);



        //Author author=session.get(Author.class,3);
//        author.setFname("Updated Name");
//        session.update(author);


        // session.delete(author);



       // session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
