package eu.dauphine.rayanPrevost.td4.javaAvancee;




import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



class CarTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void creationCar() {
		Car car = new Car("BMW",10000,1);
		assertEquals("Marque : BMW Valeur : 9000 Vétusté : 1", car.toString());
	}
	
	@Test
	public void testCreationCarWithoutVetuste() {
		Car car = new Car("BMW",10000);
		assertEquals(0,car.getVetusteLevel());
		
	}
	
	@Test
	public void creationCar2() {
		Car car = new Car("Mazda",30000);
		assertEquals("Marque : Mazda Valeur : 30000 Vétusté : 0", car.toString());
	}
	@Test
	public void CreatCarwithNegativevalue() {
	    Throwable exception = assertThrows(
	    		IllegalArgumentException.class, () -> {
	    			new Car("BMW",-100,0);
	            }
	    );
	    assertEquals("Value of car can't be negative", exception.getMessage());

	}
}
// types d'assert
//AssertEquals()
//AssertNull()
//AssertThrows()
