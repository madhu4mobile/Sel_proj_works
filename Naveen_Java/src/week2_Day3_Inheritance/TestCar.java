package week2_Day3_Inheritance;

public class TestCar {
	public static void main(String[] args) {
		// This class is the test car, in which we will create an object of BMW

		BMW b = new BMW();

		b.start();  // this start is common in both Car and BMW classes. But as TestCar has an object from BMW, this start will come from BMW (direct parent. Not from grand parent car)
		//The above method is called compilation time polymorphysm.
		b.accelerate();// the object in TestCar inherits accelerate from the object in TestCar inherits from grand parent car through parent BMW class
		b.applyBrakes();// the object in TestCar inherits from grand parent car through parent BMW
		b.leftIndicator(); // from the object in TestCar inherits from grand parent car through parent BMW
		b.theftSafety(); // from parent BMW.
		b.engine(); // this comes from grand parent vehicle though there is no direct enxention from BMW to Vehicle.
		//It goes as TestCar <--BMW<--CAR<--Vehicle

		// If needed, TestCar can create an object of car and access the properties directly from Car
		// But by that time, for the object C, BMW will be a sibling and we can not inherit from BMW.
		Car c = new Car();
		c.start(); // this will take prperty from car.
		c.accelerate(); // will take from Car
		c.applyBrakes(); // will take from car
		//c.theftSafety(); // this is not available. So throws error if uncommented.

		// We can create an object of child class without any reference. It is allowed through inheritance
		 new BMW();
		System.out.println("*********");

		// Top - Casting
		 //Also child class object can be referred by parent class reference variable.
		Car c1 = new BMW();  // this is called dynamic polymorphism OR run time polymorphism.

		c1.start(); // this will be from BMW into car object
		c1.accelerate(); //from BMW into car object
		//c1.theftSafetry(); //This is not allowed from a child BMW to a parent Object in car
/*
		// down Casting. ( It is not allowed in Java) : Class casting excetion.
		// which means that we can not create an object of BMW with new CAR
		//BMW b1 = new Car();// Throws error saying 'Type mismatch: cannot convert from Car to BMW' This can be allowed by down casting
		System.out.println("@@@@@@@@@@@");
		BMW b1 = (BMW) new Car(); // Here first Parent object new Car is first casted into a child (BMW) first and then obj reference b1 will be allowed.
		// will be allowed by the compiler but throws error at the run time
		// throws error at the run time as
		//'Exception in thread "main" java.lang.ClassCastException: week2_Day3_Inheritance.Car cannot be cast to week2_Day3_Inheritance.BMW
		//at week2_Day3_Inheritance.TestCar.main(TestCar.java:40)'

*/








	}

}
