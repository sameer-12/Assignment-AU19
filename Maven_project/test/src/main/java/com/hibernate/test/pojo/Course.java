package com.hibernate.test.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="courses")
public class Course {
@Id
@Column(name="courseId")
//@GeneratedValue(strategy=GenerationType.AUTO)
public Integer courseId;

@Column(name="courseName")
public String courseName;

@Column(name="studentId")
public Integer studentId;
@Column(name="emp_id")
public Integer emp_id;



public Integer getEmp_id() {
	return emp_id;
}

public void setEmp_id(Integer emp_id) {
	this.emp_id = emp_id;
}

public Integer getCourseId() {
return courseId;
}

public void setCourseId(Integer courseId) {
this.courseId = courseId;
}

public String getCourseName() {
return courseName;
}

public void setCourseName(String courseName) {
this.courseName = courseName;
}

public Integer getStudentId() {
return studentId;
}

public void setStudentId(Integer studentId) {
this.studentId = studentId;
}



}