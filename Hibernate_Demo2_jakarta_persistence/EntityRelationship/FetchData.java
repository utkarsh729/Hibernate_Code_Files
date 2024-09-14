package io.Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Stud");
		EntityManager em=emf.createEntityManager();
		
		Student s1=em.find(Student.class, 2);
		
		System.out.println(s1.getRollNo());
		System.out.println(s1.getName());
//		System.out.println(s1.getCard().getCardNo());
//		System.out.println(s1.getCard().getVersion());
		for(Course c: s1.getCourseList()) {
			System.err.println(c.getCourseName());
		}
//		
//		StudentIdCard sid1=em.find(StudentIdCard.class, 1);
//		System.out.println(sid1.getCardNo());
//		System.out.println(sid1.getVersion());
//		System.out.println(sid1.getStud().getRollNo());
//		System.out.println(sid1.getStud().getName());
		
		Course c1=em.find(Course.class, 2);
		
		System.out.println(c1.getCourseId() + " "+c1.getCourseName()+" "+c1.getStud().getName());
//		
		
		
		
	}

}
