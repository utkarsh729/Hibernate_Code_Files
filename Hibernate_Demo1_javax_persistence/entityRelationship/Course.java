package io.utkarsh.entityRelationship;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int courseId;

	private String courseName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Student stud;
	// here we are mapping course to student ...course to student ki mapping honi chahiye many to one
	
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud=stud;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	
}
