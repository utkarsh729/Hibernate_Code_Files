package com.hib2.maven.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */	
public class App 
{
    public static void main( String[] args )
    {
       
        Student stud=new Student();
        stud.setMarks(19);
        stud.setName("Utkarsh");
        stud.setRollno(7);
        
        Configuration config=new Configuration().configure().addAnnotatedClass(Student.class); 
        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(stud);
        tx.commit();
        
        Student stud2=new Student();
        stud2.setMarks(30);
        stud2.setRollno(5);
        stud2.setName("Golu");
        
        Student stud3=new Student();
        stud3.setRollno(9);
      
        tx=session.beginTransaction();
        session.save(stud2);
        session.save(stud3);
        tx.commit();
        System.out.println(stud);
        session.close();
        
        
    }
}
