package com.Hibernate.Entity;


import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity(name ="Student_details")
@Table(name="Studnets")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Name")
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="firstNameString",column =@Column(name="First_Name")),
		@AttributeOverride(name="middleNameString",column =@Column(name="Middle_Name")),
		@AttributeOverride(name="lastNameString",column =@Column(name="Last_Name")),
	})
	private Name name;
	
	//@Column(name = "Address")
	@OneToOne()
	@JoinColumn(name="Address_emply")
	private Address add;
	
	
	//@OneToMany(mappedBy = "student")
	@OneToMany()
	@JoinTable(
					name = "Student_sibject",
					joinColumns = {@JoinColumn(name="StudentId")},
					inverseJoinColumns = {@JoinColumn(name="Subject_id")}
			)
	private List<Subject>subjectList;
	
	@ManyToMany(mappedBy = "studentList",cascade = CascadeType.ALL)
	private List<Project>projectList;
	
	@Transient
	private String cast;

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, Name name, Address add, List<Subject> subjectList,String cast) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.cast=cast;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + ", subjectList=" + "" + ", cast="
				+ cast + "]";
	}
	
	
	
	

}
