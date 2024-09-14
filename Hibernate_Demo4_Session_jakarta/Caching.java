package com.demo.hib.HibDemo2;

import org.hibernate.Session;

public class Caching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=null;
		Student s2=null;
		
		Session session1=SessionObject.getSession();
		
		s1=session1.get(Student.class, 7);
		System.out.println(s1);
		
		s2=session1.get(Student.class, 7);
		System.out.println(s2);
		// query is fired only once because .. hibernate create L1 cache for particular session..and first check in cache;
		session1.close();
		
		Session session2=SessionObject.getSession();
		
		s2=session2.get(Student.class, 7);
		
		// it will hit the database because L1 cache is specific to session ...
		
		System.out.println(s2);
		session2.close();
		
		
		
		
		

	}

}
