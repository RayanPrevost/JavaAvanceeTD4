package eu.dauphine.rayanPrevost.td4.javaAvancee;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a==b); //False
		System.out.println(b==c); //False
		System.out.println(a==d); //True -> Normal
		System.out.println(a.equals(b)); //false
		System.out.println(b.equals(c)); //false
		System.out.println(a.equals(d)); //True -> Normal

		
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a)); //0
		System.out.println(list.indexOf(b)); //1
		System.out.println(list.indexOf(c)); // -1
		System.out.println(b.equals(c));//true ->Normal!
		
		
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
		
		Garage garage = new Garage();
		Car car = new Car("BMW",10000);
		Car car1 = new Car("Peugeot",10000,3);
		Car car2 = new Car("Mazda",10000,2);
		Car car3 = new Car("BMW",10000,4);
		garage.addCar(car);
		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		System.out.println(garage.sizeOfGarage());
		garage.protectionism("BMW");
		System.out.println(garage.sizeOfGarage());
		
		
		
		
		
	}
	
	

}
