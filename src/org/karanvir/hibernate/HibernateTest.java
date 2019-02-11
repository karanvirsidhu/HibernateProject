package org.karanvir.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.karanvir.dto.Address;
import org.karanvir.dto.UserDetails;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args){
        UserDetails user = new UserDetails();

        Address homeAddr = new Address();
        homeAddr.setStreetNumber(2);
        homeAddr.setCity("Abohar");
        homeAddr.setState("Punjab");
        homeAddr.setPinCode("152116");

        Address officeAddr = new Address();
        officeAddr.setStreetNumber(700);
        officeAddr.setCity("Montreal");

        user.setUserName("Karanvir");
        user.setDateOfJoining(new Date());
        user.setHomeAddress(homeAddr);
        user.setOfficeAddress(officeAddr);
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
