package week2_Day3_Inheritance;

public class BMW extends Car {

	// Method overrriding
	// Same method with same name and same parameters available in parent class as well as child class


	public void start() {
		System.out.println("BMW - starts");
	}
	public void accelerate() {
		System.out.println("BMW accelerates");
	}

	public void theftSafety() {
		System.out.println("BMW - TheftSafety");
	}


}
