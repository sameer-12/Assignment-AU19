package com.spring.au.jUnit;

import java.util.List;

public interface StudentDao {
	public List<Student> getStudents();
	public void saveStudent(Student student);
	public void notifyStudent(Student student);
}
