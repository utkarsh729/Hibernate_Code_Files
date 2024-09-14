package com.hib2.maven.HibDemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration =new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=configuration.buildSessionFactory();
		// while fetching data there is no need of transaction 
		Session session =sf.openSession();
		
		Student stud =null;
		stud=session.get(Student.class, 7);
		// get will bring the data as soon as it is called..and fire the query at immediately after calling to fetch data
		
		System.out.println(stud);
		
		
		stud=session.load(Student.class, 5);
		
		// load is depricated in newer version
		System.out.println(stud);
		// load is lazy...it bring the data when it is required ..and fire the query when data is required;
		
		sf.close();
	}

}
