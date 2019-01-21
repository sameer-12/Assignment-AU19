package com.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.Array;

import com.hibernate.test.pojo.Course;
import com.hibernate.test.pojo.Student;
import com.hibernate.test.pojo.Teacher;

public class App {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();

		/*
		 * Course c = new Course(); c.setCourseId(1); c.setCourseName("physic");
		 * session.save(c);
		 */

		System.out.println("Hello");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		// setting database entry
		Teacher t = new Teacher();
		t.setEmp_id(23);
		t.setName("Vantesh");

		Student s = new Student();
		s.setStudentId(52);
		s.setStudentName("sam");
		Integer id = (Integer) session.save(s);
		System.out.println(id);

		Course c = new Course();
		c.setCourseId(1);
		c.setCourseName("hibernate");
		c.setStudentId(52);
		// session.save(c);
		// session.save(c);
		List<Teacher> teacherList = new ArrayList<Teacher>();
		// Integer id = (Integer) session.save(c);
		// System.out.println(id);
		
		  Criteria cr = session.createCriteria(Student.class);
		  cr.add(Restrictions.gt("studentAge", 21)); studentList = cr.list();
		  
		/*
		 * for (Student student : studentList) {
		 * System.out.println(student.getStudentName() + "|" + student.getStudentAge() +
		 * "|" + student.getStudentId() + "|" + (!student.getCourses().isEmpty() ?
		 * student.getCourses().get(0).getCourseName() : "")); }
		 */
		 
		for (Teacher teacher : teacherList)
		{
		System.out.print(teacher.getName()+ "|" + teacher.getEmp_id()+
				"|"+(teacher.getCourses()));
		}

		/*
		 * Criteria cr = session.createCriteria(Teacher.class);
		 * cr.add(Restrictions.idEq(32));
		 */
//		s.setStudentAge(21);
		session.save(t);
		session.save(s);
		session.save(c);
		// Criteria cr = session.createCriteria(Student.class);
		// cr.add(Restrictions.gt("studentAge", 21));

//		cr.add(Restrictions.disjunction().add(criterion)("studentAge",21));
		// cr.add(Restrictions.disjunction().add(Restrictions.idEq(43)));

//		List teacherList = new ArrayList<Teacher>();

		// teacherList =cr.list();

		// System.out.println(teacherList);

		session.getTransaction().commit();

	}

}
