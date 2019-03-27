package com.demo.hibernate.question2;

import com.demo.hibernate.Address;
import com.demo.hibernate.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {

        Author author=new Author(1,"Aditya","kumar",23);
        Author author2=new Author(2,"Rahul","raj",24);
         Address addressf=new Address(23,"vinod","delhi");
        Address addressg=new Address(43,"vinod","delhi");
       author.setAddress(addressf);
       author2.setAddress(addressg);
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Session session=sessionFactory.openSession();

        session.beginTransaction();
        //create
        session.save(author);
        session.save(author2);
        //read
        Author author1=session.get(Author.class,1);
        System.out.println("Author with id 1: "+author1);
        //update
        author1.setFirstName("Bala");
        session.update(author1);
        Author author3=session.get(Author.class,1);
        System.out.println("Author with id 1 after update: "+author3);
        //delete
        session.delete(author1);

        session.getTransaction().commit();
    }
}