package io.Entity;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Stud");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		StudentIdCard sid1 =new StudentIdCard();
		sid1.setVersion("1.2.3");
		
		StudentIdCard sid2=new StudentIdCard();
		sid2.setVersion("2.1.1");
		
		
		Student s1=new Student();
		s1.setName("Rahul");
		s1.setCard(sid2);
		
		
		Student s2=new Student();
		s2.setName("Utkarsh");
		s2.setCard(sid1);
	
		Course c1=new Course();
		c1.setCourseName("Java");
		c1.setStud(s1);
		
		Course c2=new Course();
		c2.setCourseName("Python");
		c2.setStud(s1);
		c2.setStud(s2);
		
		s1.setCourseList(List.of(c1,c2));
		s2.setCourseList(List.of(c1));
		
		et.begin();
		em.persist(sid1);
		em.persist(sid2);
		em.persist(s1);
		em.persist(s2);
		em.persist(c1);
		em.persist(c2);
		et.commit();
		
	
		
		
	}

}
