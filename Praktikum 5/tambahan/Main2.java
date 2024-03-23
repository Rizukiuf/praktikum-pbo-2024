interface IEngine {
	public void turnOn();
	public void turnOff();
}

abstract class Vehicle {
	protected String make;
	protected String model;
	protected String year;
	
	public Vehicle(String make, String model, String year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public abstract void move();

	// TODO 1: Tambahkan method abstract stop, accelerate, dan decelerate
	
}

// TODO 2: Buatlah class Bike yang merupakan turunan dari class Vehicle


// TODO 3: Buatlah class Car yang merupakan turunan dari class Vehicle dan mengimplementasikan interface Engine


public class Main2 {
	public static void main(String[] args) {
		// TODO 4: Buatlah objek bike dan car, lalu panggil method-method yang ada
		/* Contoh pemanggilan method
		Bike bike = new Bike("Honda", "CBR", "2018");
		bike.move();
		bike.accelerate();
		bike.decelerate();
		bike.stop();
		 */
	}

}
