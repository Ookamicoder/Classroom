import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	ArrayList<Student> students = new ArrayList<Student>();
	Classroom classroom = new Classroom("TEST15", "Spring 16", students);
	Student student1 = new Student("Rafael", "Silva", 20, 'M', 3.1, 5.4, 6.2);
	Student student2 = new Student("Fredrik", "Mellgren", 20, 'M', 8.0, 8.8, 6.1);
	Student student3 = new Student("Hans", "Ekstr�m", 20, 'M', 8.8, 5.0, 6.0);
	Student student4 = new Student("Patrik", "Hollsten", 20, 'F', 8.2, 7.3, 6.0);
	Student student5 = new Student("Gopi", "Sundarraj", 20, 'M', 8.2, 9.0, 6.0);

	@Test
	public void testAddANewStudent() {


		classroom.addANewStudent(student1);
		classroom.addANewStudent(student2);
		classroom.addANewStudent(student3);
		classroom.addANewStudent(student4);
		classroom.addANewStudent(student5);
		assertEquals(classroom.getStudents(),students);
	}
	
	@Test
	public void testGettersAndSetters() {
		classroom.setClassroomName("KVALIT17");
		classroom.setClassroomTerm("Autumn 17");
		classroom.setStudents(students);
		assertEquals(classroom.getClassroomName(),"KVALIT17");
		assertEquals(classroom.getClassroomTerm(),"Autumn 17");
		assertEquals(classroom.getStudents(),students);
	}
	
	

}
