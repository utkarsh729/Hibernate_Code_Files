package io.utkarsh.entityRelationship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentIdCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardNumber;
	
	private String softwareVersion;
	
//	@OneToOne  
	@OneToOne(mappedBy = "card")
	private Student stud;
	// humne student table mai phele he one to one map kr diya hai toh iss table mai one to one krna ka koi matlab nahi..
	// vo phir dono alag treat hoga ..aur do join command execute hoga..
	// isliye hum mappedBy use krte hai
	
	

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

//	@Override
//	public String toString() {
//		return "StudentIdCard [cardNumber=" + cardNumber + ", softwareVersion=" + softwareVersion + "]";
//	}
//	
//	
	
}
