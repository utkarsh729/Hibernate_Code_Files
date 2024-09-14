package com.demo.hib.HibDemo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionObject {
	public static Session getSession() {
		Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
		
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();
		
		return s;
	}
}
