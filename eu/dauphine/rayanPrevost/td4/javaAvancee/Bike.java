package eu.dauphine.rayanPrevost.td4.javaAvancee;

public class Bike implements Vehicule{
	
	private String brand ;
	public static final int value = 100;;

	public Bike(String brand) {
		this.brand = brand;
	}
	public Bike(String brand, Discount discount) {
		this.brand = brand;
	}
	
	@Override
	public long getValue() {
		return value;
	}

	@Override
	public String getBrand() {
		return this.brand;
	}

}
