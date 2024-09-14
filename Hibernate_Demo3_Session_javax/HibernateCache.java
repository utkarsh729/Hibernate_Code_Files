package com.hib2.maven.HibDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class HibernateCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=config.buildSessionFactory();
		
		Session s1=sf.openSession();
		Student stud1=s1.get(Student.class, 7);
		Student stud2 =s1.get(Student.class , 7);
		System.out.println(stud1);
		System.out.println(stud2);
		s1.close();
		// as both object is requesting the same data ..query is fired only once means request to database is made only one time
        // this is because hibernate will create a L1 cache for the s1 session and next time when request is made it will first look
		// for the result in L1 cache if it is present it will fetch the result from cache and will not hit the database
		
		Session s2=sf.openSession();
		Student stud3=s2.get(Student.class, 7);
		System.out.println(stud3);
		s2.close();
		// a new L1 cache is created for the new session thus it will hit the database and query will be fired as requested data is 
		// not present in L1 cache
		
		// TO OVERCOME THIS PROBLEM WE USE L2 CACHCE WHICH IS PROVIDED BY THIRD PARTY ..
		// AS SOON AS THE NEW SESSION IS CREATED L1 CACHE IS CREATED FOR THAT SESSION AND ALL OTHER SESSION SHARE THE L2 CACHE
		// HERE IM USING THIRD PARTY L2 CACHE NAME ehcache
		// to implement it add dependecy of it in pom.xml
		// then in hibernate.cfg.xml set it true and specify which thrid party cache region class
		// after all these setup it will still not work
		// we have to define for which class we want to cache...for this go to class and add cacheable annotation 
		// then we have to define the its strategy
		// and finally this will work
		
		sf.close();
		
		
	}

}
