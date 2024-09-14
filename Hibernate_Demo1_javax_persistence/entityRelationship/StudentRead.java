package io.utkarsh.entityRelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("golu2");
		EntityManager em=emf.createEntityManager();
		
		Student stud1=em.find(Student.class, 1);
		
		System.out.println(stud1.getName());  // fetch type eager hota hai by default...humko cardno nhi chahiye phir bhi vo backend mai 
		// query run kr raha..table join kr raha..dusri table mai bhi query run ho rahi ..jiski jarurat bhi nahi
		// FetchType of lazy karne se table join tabhi hongi jab humko jarurat hogi
		
		System.out.println(stud1.getCard().getCardNumber()); 
		
//		-------------------------
		// humne lazy kr diya hai fetch type
		
			
		System.out.println(stud1.getName()+" " + stud1.getCard().getSoftwareVersion());
		
		
//	------------------------
		StudentIdCard card=em.find(StudentIdCard.class, 4);
		System.out.println(card.getStud().getName() +" "+card.getStud().getRollno());
		
		
		Course course =em.find(Course.class, 5);
		
		System.out.println(course.getCourseName() +" "+ course.getStud().getName());
		
//		----------------------
		
		Student stud=em.find(Student.class, 1);
		for(Course c: stud.getCourseList()) {
			System.out.println(c.getCourseId()+" "+c.getCourseName());
		}
		
		Student stud2=em.find(Student.class, 2);
		for(Course c: stud2.getCourseList()) {
			System.out.println(c.getCourseId()+" "+c.getCourseName());
		}
		
	}

}
