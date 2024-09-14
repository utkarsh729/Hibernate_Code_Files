package com.hib2.maven.HibDemo;
import javax.persistence.Cacheable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "student_data")
public class Student {
	@Column(name = "student_name")
	private String name;
	private int marks;
	@Id
	private int rollno;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}

	public int getMarks() {
		return marks;
	}
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", rollno=" + rollno + "]";
	}
	

	
	
}
