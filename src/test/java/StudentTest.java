import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	@Test
	public void testGettersAndSetters() {
		Student student2 = new Student("Christer","Edlund",68,'M');
		Student student = new Student("Erik", "Edlund", 26, 'M', 8, 7, 10);
		student.setFirstGrade(7.0);
		student.setSecondGrade(6.0);
		student.setThirdGrade(9.0);
		assertEquals(student.getFirstGrade(),7.0,0);
		assertEquals(student.getSecondGrade(),6.0,0);
		assertEquals(student.getThirdGrade(),9.0,0);
		assertEquals(student2.getFirstName().equals("Christer"),true);
		assertEquals(student2.getLastName().equals("Edlund"),true);
		assertEquals(student2.getAge(),68);
		assertEquals(student2.getGender(),'M');
		
	}
	
	@Test
	public void testCalculateAverage() {
		Student student = new Student("Erik", "Edlund", 26, 'M', 7, 5, 10);
		double sumOfGrades = 0;
		double averageResult = 0;
		student.setFirstGrade(7.0);
		student.setSecondGrade(8.0);
		student.setThirdGrade(9.0);
		sumOfGrades = student.getFirstGrade()+student.getSecondGrade()+student.getThirdGrade();
		averageResult = sumOfGrades/3;
		student.calculateAverage(student.getFirstGrade());
		student.calculateAverage(student.getFirstGrade(), student.getSecondGrade(), student.getThirdGrade());
		student.calculateAverage();
		
		assertEquals(student.getAverageGrade(),averageResult,0);
		
	}
	
	@Test
	public void testHasClearedTheCourse() {
		Student student = new Student("Erik", "Edlund", 26, 'M', 7, 6, 10);
		Student student2 = new Student("Per-Åke","Svensson",40,'M');
		student.setFirstGrade(5.0);
		student.setSecondGrade(3.0);
		student.setThirdGrade(10.0);
		student2.setFirstGrade(5);
		student2.setSecondGrade(0);
		student2.setThirdGrade(5);

		student.calculateAverage();
		student2.calculateAverage();
		
		assertEquals(student.hasClearedTheCourse(),true);
		assertEquals(student2.hasClearedTheCourse(),false);
		
	}
	
	@Test
	public void testToString() {
		Student student = new Student("Erik", "Edlund", 26, 'M', 7, 6, 10);
		Student student2 = new Student("Per-Åke","Svensson",40,'M');
		student.setFirstGrade(5.0);
		student.setSecondGrade(3.0);
		student.setThirdGrade(10.0);
		student2.setFirstGrade(5);
		student2.setSecondGrade(0);
		student2.setThirdGrade(5);

		student.calculateAverage();
		student2.calculateAverage();
		
		System.out.println(student.toString());
		System.out.println(student2.toString());
		
	}
	
	

}
