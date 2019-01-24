package com.spring.au.jUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rankTable")
public class StudentRank {
	
	@Id
	@Column(name = "srank")
	public int  sRank;
	
	@Column(name="studentId")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	public int studentId;
	
	@Column(name = "studentName")
	public String  studentName;
	
	@Column(name = "dob")
	public String  dob;
	
	@Column(name = "marks")
	public int  marks;

	public int getsRank() {
		return sRank;
	}

	public void setsRank(int sRank) {
		this.sRank = sRank;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
