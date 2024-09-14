package com.demo.hib.HibDemo2;

import org.hibernate.Session;

public class FetchTheData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = SessionObject.getSession();
		
		Student stud=null;
		
		stud=session.get(Student.class,7);
		// get is eager..even though if we are not using the data ahead it runs the query 
		
		System.out.println(stud);
		
		stud=session.getReference(Student.class, 5);
		// getReference is lazy ..it runs the query when data is actually needed
		System.out.println(stud);
		
		session.close();

	}

}
