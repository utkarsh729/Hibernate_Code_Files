package io.utkarsh.entityRelationship;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Column(name="student_name", nullable=false)
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno;
	
	@OneToOne(fetch = FetchType.LAZY)   // by default it is Eager
//	@OneToOne
	private StudentIdCard card;
	
	@OneToMany(mappedBy = "stud")
	private List<Course> courseList;
	

	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public void setCard(StudentIdCard card) {
		this.card=card;
	}
	public StudentIdCard getCard() {
		return card;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
//	
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", rollno=" + rollno + " cardNo= "+ card+ "]";
//	}
//	
	
	
	

}
