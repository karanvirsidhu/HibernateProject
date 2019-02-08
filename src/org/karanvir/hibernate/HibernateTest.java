package org.karanvir.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.karanvir.dto.UserDetails;

public class HibernateTest {

    public static void main(String[] args){
        UserDetails user = new UserDetails();
        user.setUserId(2);
        user.setUserName("Kanav");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();


    }
}
