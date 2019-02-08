package org.karanvir.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.karanvir.dto.UserDetails;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args){
        UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("Karanvir");
        user.setDateOfJoining(new Date());
        user.setAddress("Montreal");
        user.setDescription("Master of software engineering");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
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
