package eu.dauphine.rayanPrevost.td4.javaAvancee;

public class Car implements Vehicule {
	private final String brand;
	private final long value;
	private final int vetusteLevel;


	public Car(String brand, long value, int vetusteLevel) {
		if(value < 0) {
			throw new IllegalArgumentException("Value of car can't be negative");
		}
		this.brand = brand;
		this.value = value;
		this.vetusteLevel = vetusteLevel;
	}
	
	public Car(String brand, long value) {
		if(value < 0) {
			throw new IllegalArgumentException("Value of car can't be negative");
		}
		this.brand = brand;
		this.value = value;
		this.vetusteLevel = 0;
	}
	
	public int getVetusteLevel() {
		return vetusteLevel;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public long getValue() {
		long res = getVetusteLevel()*1000;
		return value-res;
	}

	public String toString() {
		return "Marque : "+ this.brand + " Valeur : "+ getValue()+ " Vétusté : "+this.vetusteLevel;
	}
	
	
	public boolean equals(Car c) {
		boolean res = false;
		if(c instanceof Car && c.brand == this.getBrand() 
			&& c.value == this.getValue() 
			&& c.vetusteLevel == this.getVetusteLevel()) {
			res = true;
		}
		
		return res ;
	}




}

