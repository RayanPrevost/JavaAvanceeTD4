package eu.dauphine.rayanPrevost.td4.javaAvancee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Garage {

	private ArrayList<Vehicule> garage;
	private static int idGarage = 0;

	
	public Garage() {
		this.garage = new ArrayList<Vehicule>();
		idGarage ++;

	}
	
	public void addCar(Car car) {
		this.garage.add(Objects.requireNonNull(car,"Impossible Car is null"));
	}
	
	public static int getIdGarage() {
		return idGarage;
	}

	public static void setIdGarage(int idGarage) {
		Garage.idGarage = idGarage;
	}
	public int getId() {
		return this.idGarage;
	}

	public String toString() {
		StringBuilder res =  new StringBuilder();
		Iterator<Vehicule> iterator = this.garage.iterator();
		while (iterator.hasNext()) {
			res.append(iterator.next().toString());
		}
		return res.toString();
	}
	
	public long getSumValueGarage() {
		long res = 0;
		Iterator<Vehicule> iterator = this.garage.iterator();
		while (iterator.hasNext()) {
			res += iterator.next().getValue();
		}
		return res;	
	}
	
	public int sizeOfGarage() {
		return this.garage.size();
	}
	
	public Vehicule firstCarByBrand(String brand) {
		Vehicule res = null;
		boolean find = false;
		for (Vehicule vehicule : garage) {
			if(vehicule.getBrand() == brand && find == false) {
				res = vehicule;
				find = true;
			}
		}
		return res;
		
	}
	public void remove(Car c) {
		this.garage.remove(c);
	}
	
	public int protectionism(String brand) {
		int nbVehDelet = 0;
		Iterator<Vehicule> iterator = this.garage.iterator();
		while (iterator.hasNext()) {
			if(iterator.next().getBrand() == brand) {
				iterator.remove();
				nbVehDelet++;
			}
		}
		return nbVehDelet;
	}
	
	public boolean equal(Garage g) {
		boolean res = false;

		
		return res;
	}
}
