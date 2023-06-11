package com.Hibernate.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity(name = "Project")
@Table(name="Projects")
public class Project {

	@Id
	@Column(name = "Project_id")
	private Integer id;
	
	@Column(name="Project_Name")
	private String projectNameString;
	
	@ManyToMany()
	@JoinTable(
			name = "Students_Project",
			joinColumns = {@JoinColumn(name="Project_id")},
			inverseJoinColumns = {@JoinColumn(name="Student_Id")})
	private List<Student>studentList;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(Integer id, String projectNameString, List<Student> studentList) {
		super();
		this.id = id;
		this.projectNameString = projectNameString;
		this.studentList = studentList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectNameString() {
		return projectNameString;
	}

	public void setProjectNameString(String projectNameString) {
		this.projectNameString = projectNameString;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectNameString=" + projectNameString + ", studentList=" + studentList + "]";
	}
	
	
	
}
