package org.example;

import org.example.model.Address;
import org.example.model.Customer;
import org.example.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstname("Burak");
        customer.setLastname("Delice");

        Address address = new Address();
        address.setSehir("Ankara");
        address.setIlce("Aşağı Ayrancı");
        address.setMahalle("Yukarı Ayrancı");

        customer.setAddress(address);
        customer.setCreationDate(new Date());

        Customer customer2 = new Customer("Engin","Erkitmen",address,new Date());
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
                session.save(customer);
                session.save(customer2);
            transaction.commit();

        }catch (HibernateException e){
            transaction.rollback();
            System.out.println("Hata: "+ e);
        }finally {
            session.close();
        }

    }
}
