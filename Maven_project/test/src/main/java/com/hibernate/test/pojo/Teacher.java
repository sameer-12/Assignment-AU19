package com.hibernate.test.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {
	
	@Id
	@Column(name = "emp_id")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer emp_id;

	@Column(name = "name")
	public String name;

//	@Column(name = "studentAge")
//	public Integer studentAge;
	
	//private int emp_id;
//	private String name;
	 @OneToMany(mappedBy = "emp_id", fetch = FetchType.EAGER)
				public List<Course> courses;
	 
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
