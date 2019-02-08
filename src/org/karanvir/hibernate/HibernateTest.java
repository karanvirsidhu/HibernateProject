package org.karanvir.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.karanvir.dto.UserDetails;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args){
        UserDetails user = new UserDetails();

        user.setUserName("Karanvir");
        user.setDateOfJoining(new Date());
        user.setAddress("Montreal");
        user.setDescription("Master of software engineering");

        UserDetails user2 = new UserDetails();

        user2.setUserName("Kanav");
        user2.setDateOfJoining(new Date());
        user2.setAddress("Patiala");
        user2.setDescription("ECE");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();
        session.close();

        user =null;

        session = sessionFactory.openSession();
        session.beginTransaction();
        session.get(UserDetails.class, 1);
        session.getTransaction().commit();
        session.close();

    }
}
