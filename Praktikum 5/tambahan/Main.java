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

	public abstract void stop();

	public abstract void accelerate();

	public abstract void decelerate();
	
}

class Car extends Vehicle implements IEngine {
	public Car(String make, String model, String year) {
		super(make, model, year);
	}

	@Override
	public void turnOn() {
		System.out.println("Brum brum, car is on");
	}

	@Override
	public void turnOff() {
		System.out.println("Car is off");
	}

	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	@Override
	public void stop() {
		System.out.println("Car has stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating");
	}

	@Override
	public void decelerate() {
		System.out.println("Car is decelerating");
	}

}

class Bike extends Vehicle {
	public Bike(String make, String model, String year) {
		super(make, model, year);
	}

	@Override
	public void move() {
		System.out.println("Bike is moving");
	}

	@Override
	public void stop() {
		System.out.println("Bike has stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("Bike is accelerating");
	}

	@Override
	public void decelerate() {
		System.out.println("Bike is decelerating");
	}
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Toyota", "Corolla", "2015");
		car.turnOn();
		car.move();
		car.accelerate();
		car.decelerate();
		car.stop();
		car.turnOff();

		Bike bike = new Bike("Honda", "CBR", "2018");
		bike.move();
		bike.accelerate();
		bike.decelerate();
		bike.stop();
	}
}
