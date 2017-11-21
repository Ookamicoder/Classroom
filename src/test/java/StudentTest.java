import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	@Test
	public void testGettersAndSetters() {
		Student student = new Student("Erik", "Edlund", 26, 'M', 78, 65, 100);
		student.setFirstGrade(70.0);
		student.setSecondGrade(86.0);
		student.setThirdGrade(93.0);
		assertEquals(student.getFirstGrade(),70.0,0);
		assertEquals(student.getSecondGrade(),86.0,0);
		assertEquals(student.getThirdGrade(),93.0,0);
		
	}
	
	@Test
	public void testCalculateAverage() {
		Student student = new Student("Erik", "Edlund", 26, 'M', 78, 65, 100);
		double sumOfGrades = 0;
		double averageResult = 0;
		student.setFirstGrade(70.0);
		student.setSecondGrade(86.0);
		student.setThirdGrade(93.0);
		sumOfGrades = student.getFirstGrade()+student.getSecondGrade()+student.getThirdGrade();
		averageResult = sumOfGrades/3;
		
		assertEquals(student.calculateAverage(student.getFirstGrade(), student.getSecondGrade(), student.getThirdGrade()),averageResult,0);
		
	}
	
	

}
