package com.Hibernate.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subjecta_Details")
public class Subject {

	@Id
	@Column(name ="Name")
	private String nameString;
	
	@Column(name="Importance")
	private boolean isimportant;
	
	@ManyToOne()
	@JoinColumn(name = "Student_Subject")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String nameString, boolean isimportant) {
		super();
		this.nameString = nameString;
		this.isimportant = isimportant;
	}
	
	

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public boolean isIsimportant() {
		return isimportant;
	}

	public void setIsimportant(boolean isimportant) {
		this.isimportant = isimportant;
	}

	@Override
	public String toString() {
		return "Subject [nameString=" + nameString + ", isimportant=" + isimportant + "]";
	}
	
	
}
