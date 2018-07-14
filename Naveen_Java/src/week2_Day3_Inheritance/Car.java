package week2_Day3_Inheritance;

public class Car extends Vehicle { // car is the child of Vehicle.

	public void start() {
		System.out.println("Car starts");
	}

	public void accelerate() {
		System.out.println("Car accelerates");
	}
	public void applyBrakes() {
		System.out.println("Car decelates");
	}
	public void rightIndicater() {
		System.out.println("Car - right indicator on");
	}
	public void leftIndicator() {
		System.out.println("Car - left indicator on");
	}

}
