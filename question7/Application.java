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
        author1.setDob("23 aug 1997");
        session.save(author1);

        Author author2 = new Author();
        author2.setId(2);
        author2.setFname("chetan");
        author2.setLname("bhagat");
        author2.setAge(22);
        author2.setDob("23 july 1997");
        session.save(author2);

        Author author3 = new Author();
        author3.setId(3);
        author3.setFname("ravindra");
        author3.setLname("singh");
        author3.setAge(30);
        author3.setDob("13 aug 1997");
        session.save(author3);

        Author author4 = new Author();
        author4.setId(4);
        author4.setFname("david");
        author4.setLname("peter");
        author4.setAge(35);
        author4.setDob("31 aug 1997");
        session.save(author4);


//       Author author=session.get(Author.class,2);
//       author.setFname("Updated Name1");
//       author.setAge(34);
//       author.setLname("yo ");
//       author.setDob("24 july 2009");
//        session.update(author);
//
//
//        Author author1=session.get(Author.class,2);
//        author1.setFname("Updated Name2");
//        author1.setAge(34);
//        author1.setLname("yo ");
//        author1.setDob("24 may 2009");
//        session.update(author1);
//
//
//
//
//        Author author2=session.get(Author.class,2);
//        author2.setFname("Updated Name3");
//        author2.setAge(34);
//        author2.setLname("yo ");
//        author2.setDob("24 june 2009");
//        session.update(author2);
//
//
//
//
//        Author author3=session.get(Author.class,2);
//        author3.setFname("Updated Name4");
//        author3.setAge(34);
//        author3.setLname("yo ");
//        author3.setDob("24 jan 2009");
//        session.update(author3);



        //session.delete(author);




        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}