package org.karanvir.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.karanvir.dto.Address;
import org.karanvir.dto.Card;
import org.karanvir.dto.UserDetailsSimple;
import org.karanvir.dto.UserDetailsUsingCollection;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args){
//        UserDetailsUsingCollection user = new UserDetailsUsingCollection();
//
//        Address homeAddr = new Address();
//        homeAddr.setStreetNumber(2);
//        homeAddr.setCity("Abohar");
//        homeAddr.setState("Punjab");
//        homeAddr.setPinCode("152116");
//
//        Address officeAddr = new Address();
//        officeAddr.setStreetNumber(700);
//        officeAddr.setCity("Montreal");
//
//        user.setUserName("Karanvir");
//        user.setDateOfJoining(new Date());
//        user.getListOfAddresses().add(homeAddr);
//        user.getListOfAddresses().add(officeAddr);
//        user.setDescription("Master of software engineering");
//
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(user);
//        session.getTransaction().commit();
//        session.close();
//
//        user =null;
//
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        user= (UserDetailsUsingCollection) session.get(UserDetailsUsingCollection.class, 1);
//        //session.close();  if the session is closed before then it throws lazy initialization exception
//
//        session.getTransaction().commit();
//        session.close();
//        System.out.println(user.getListOfAddresses().size());

        Card card = new Card();
        card.setCardType("Master Card");

        UserDetailsSimple user = new UserDetailsSimple();
        user.setUserName("Karanvir");
        user.setCard(card);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.save(card);
        session.getTransaction().commit();
        session.close();


    }
}
