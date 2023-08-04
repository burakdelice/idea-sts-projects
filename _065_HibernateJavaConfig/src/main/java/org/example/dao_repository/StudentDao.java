package org.example.dao_repository;

import org.example.model_entity.Student;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class StudentDao {
    void saveStudent(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.save(student);
    }
    List<Student> getStudents(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from Student" , Student.class).list();
    }
}
