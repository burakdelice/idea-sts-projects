package org.example.repository;

import org.example.model.Kiralama;
import org.example.model.Kisi;
import org.example.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class KiralamaRepository {

    public void kiradakiEvler() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           session.createQuery("from Ev ", Kisi.class).list();
        } catch (Exception e) {
            e.printStackTrace();
           // return null;
        }
    }


    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
                session.save(kiralama);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return kiralama;
    }
}
