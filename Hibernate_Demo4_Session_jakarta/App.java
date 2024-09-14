package com.demo.hib.HibDemo2;

import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1=new Student();
        s1.setMarks(86);
        s1.setName("Anika");
        s1.setRollno(24);
        
       
        
       Session session=SessionObject.getSession();
        
        Transaction tx=session.getTransaction();
        tx.begin();
        session.persist(s1);
        tx.commit();
       
        
        
        
        System.out.println(s1);
    }
}
