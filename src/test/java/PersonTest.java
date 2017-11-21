import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	
	@Test
	public void testGettersAndSetters() {
		Person p = new Person("Rafael", "Silva", 30,'M');
		p.setFirstName("Erik");
		p.setLastName("Edlund");
		p.setAge(26);
		p.setGender('M');
		assertEquals(p.getFirstName().equals("Erik"),true);
		assertEquals(p.getLastName().equals("Edlund"),true);
		assertEquals(p.getAge(),26);
		assertEquals(p.getGender(),'M');
	}
	
	

}
