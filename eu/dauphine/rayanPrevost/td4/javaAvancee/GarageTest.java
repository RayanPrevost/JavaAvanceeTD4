package eu.dauphine.rayanPrevost.td4.javaAvancee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GarageTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}


	@Test
	public void testCreateGarageVide() {
		Garage garage = new Garage();
		assertEquals(0,garage.sizeOfGarage());
	}
	
	@Test
	public void testAddCarIntoGarage() {
		Garage garage = new Garage();
		Car car = new Car("BMW",10000,1);
		Car car1 = new Car("Peugeot",10000,3);
		Car car2 = new Car("Mazda",10000,2);
		garage.addCar(car);
		garage.addCar(car1);
		garage.addCar(car2);
		assertEquals(3,garage.sizeOfGarage());
		
	}
	
	@Test
	public void addCarNullIntoGarage() {
	    Throwable exception = assertThrows(
	    		NullPointerException.class, () -> {
	    			Car car = null;
	    			Garage garage = new Garage();
	    			garage.addCar(car);
	            }
	    );		
	}
	
	@Test 
	public void testIdGarage() {
		Garage garage = new Garage();
		
		assertEquals(2,garage.getId());
		
		Garage garage1 = new Garage();
		
		assertEquals(3,garage.getId());
	}
	
	@Test
	public void testSumValueGarage() {
		Garage garage = new Garage();
		Car car = new Car("BMW",10000);
		Car car1 = new Car("Peugeot",10000,3);
		Car car2 = new Car("Mazda",10000,2);
		garage.addCar(car);
		garage.addCar(car1);
		garage.addCar(car2);
		assertEquals(25000,garage.getSumValueGarage());	
	}
	
	/*@Test
	public void testFirstCarByBrand() {
		Garage garage = new Garage();
		Car car = new Car("BMW",10000);
		Car car1 = new Car("Peugeot",10000,3);
		Car car2 = new Car("Mazda",10000,2);
		Car car3 = new Car("BMW",10000,4);
		garage.addCar(car);
		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		
		assertEquals("Marque : BMW Valeur : 10000 Vétusté : 0", garage.firstCarByBrand("BMW"));	
	}*/
	
	@Test
	public void testDeleteAllCarOfOneBrand() {		
	}
	


}
