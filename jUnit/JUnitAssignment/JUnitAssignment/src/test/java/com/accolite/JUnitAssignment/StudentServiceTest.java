package com.accolite.JUnitAssignment;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.spring.au.jUnit.Student;
import com.spring.au.jUnit.StudentDao;
import com.spring.au.jUnit.StudentRank;
import com.spring.au.jUnit.StudentService;

public class StudentServiceTest {
	public StudentService service;
	
	public StudentDao studentDaoMock;
	
	@Before
	public void setup() {
		service=new StudentService();
		studentDaoMock = Mockito.mock(StudentDao.class);
		service.setDao(studentDaoMock);
	}
	
	@Test
	public void testRankStudents() {
		List<Student> students=new  ArrayList<Student>();
		students.add(new Student());
		students.get(0).setStudentName("sameer");;
		students.get(0).setMarks(52);
		students.get(0).setDob("12-2-1997");
		students.get(0).setS_id(12);
		
		students.add(new Student());
		students.get(1).setStudentName("mananasa");;
		students.get(1).setMarks(68);
		students.get(1).setDob("12-12-1996");
		students.get(1).setS_id(13);
		
		students.add(new Student());
		students.get(2).setStudentName("ashwini");;
		students.get(2).setMarks(89);
		students.get(2).setDob("19-11-1998");
		students.get(2).setS_id(3);
		
		students.add(new Student());
		students.get(3).setStudentName("rahul");;
		students.get(3).setMarks(83);
		students.get(3).setDob("1-12-1997");
		students.get(3).setS_id(12);
		
		
		
		Mockito.when(studentDaoMock.getStudents()).thenReturn(students);
		
		List<StudentRank> studentRank=service.getRankList(students);
		
		assertEquals(4,studentRank.size());
		assertEquals("sameer",studentRank.get(3).getStudentName());
		assertEquals("mananasa",studentRank.get(0).getStudentName());
		assertEquals("rahul",studentRank.get(1).getStudentName());
		assertEquals("sameer",studentRank.get(3).getStudentName());
		
		
	}
	
	@Test
	public void testRankwithSameMarks() {
		List<Student> students=new  ArrayList<Student>();
		students.add(new Student());
		students.get(0).setStudentName("sameer");;
		students.get(0).setMarks(56);
		students.get(0).setDob("21-2-1999");
		students.get(0).setS_id(1);
		
		students.add(new Student());
		students.get(1).setStudentName("anu");;
		students.get(1).setMarks(76);
		students.get(1).setDob("1-12-1995");
		students.get(1).setS_id(2);
		
		students.add(new Student());
		students.get(2).setStudentName("ashwini");;
		students.get(2).setMarks(76);
		students.get(2).setDob("19-11-1998");
		students.get(2).setS_id(3);
		
		
		
		Mockito.when(studentDaoMock.getStudents()).thenReturn(students);
		
		List<StudentRank> studentRank=service.getRankList(students);
		
		assertEquals(4,studentRank.size());
		assertEquals(1,studentRank.get(0).getsRank());
		assertEquals("manas",studentRank.get(0).getStudentName());
		assertEquals("aviral",studentRank.get(1).getStudentName());
		assertEquals("anu",studentRank.get(2).getStudentName());
		assertEquals("sameer",studentRank.get(3).getStudentName());
		

	}

}
