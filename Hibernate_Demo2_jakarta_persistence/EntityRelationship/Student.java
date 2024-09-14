package io.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Column(name="Student_Name", nullable = false)
	private String name;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	
	@OneToOne(fetch = FetchType.LAZY)
	private StudentIdCard card;
	
	@OneToMany(mappedBy = "stud")
	private List<Course> courseList;
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	
	
	
	public StudentIdCard getCard() {
		return card;
	}
	public void setCard(StudentIdCard card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
