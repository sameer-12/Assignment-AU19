package com.spring.au;
 import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		JDBCTemplateDao jdbc=applicationContext.getBean(JDBCTemplateDao.class);
		Student student = new Student();
		student.setStudentId(13);
		student.setStudentName("sam13kv");
		jdbc.saveStudent(student);

		List<Student> list=jdbc.findall();
		for(Student st:list) {
			System.out.println("Id | "+st.getStudentId()+" Name |"+st.getStudentName());
		}
		
		Factory a=(Factory)applicationContext.getBean("Factory");
	}
}
