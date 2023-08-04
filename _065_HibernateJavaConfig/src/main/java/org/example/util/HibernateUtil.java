package org.example.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import javax.imageio.spi.ServiceRegistry;
import java.lang.module.Configuration;
import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null){
            try {

                Properties settings = new Properties();
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/businessDB");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "123456789");

                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.FORMAT_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "update"); // or create
                settings.put(Environment.QUERY_TRANSLATOR, "org.hibernate.hql.internal.classic.ClassicQueryTranslatorFactory");

                Configuration configuration = new Configuration();
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Student.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProterties()).build();

            }catch (Exception e){
                System.err.println("Hata: "+e);
            }
        }
        return sessionFactory;
    }

    public static void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtil.sessionFactory = sessionFactory;
    }
}
