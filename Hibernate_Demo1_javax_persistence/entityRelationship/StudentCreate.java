package io.utkarsh.entityRelationship;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;




public class StudentCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("golu2");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setName("gulaab");
//		s1.setRollno(9);
		
		
		Student s2=new Student();
		s2.setName("Hari");
		
		
		StudentIdCard sid1 = new StudentIdCard();
		sid1.setSoftwareVersion("1.0.1");
		
		
		StudentIdCard sid2=new StudentIdCard();
		sid2.setSoftwareVersion("2.0.2");
		
		Course cc1=new Course();
		cc1.setCourseName("Java");
		
		Course cc2=new Course();
		cc2.setCourseName("DBMS");
		
		
		
		cc1.setStud(s1);
		cc2.setStud(s1);
		
	
		s1.setCard(sid1);
		s2.setCard(sid2);
		sid1.setStud(s1);
		sid2.setStud(s2);
		
		s1.setCourseList(List.of(cc1, cc2));
		s2.setCourseList(List.of(cc1));
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(sid1);
		em.persist(sid2);
		em.persist(cc1);
		em.persist(cc2);
		et.commit();
		
		
//		------------------------------------
		
		
		
		
		
		
	}

}
