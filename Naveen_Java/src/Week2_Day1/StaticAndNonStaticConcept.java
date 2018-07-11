package Week2_Day1;

public class StaticAndNonStaticConcept {
	//Class variables
		String name = "Tom"; // non static
			static int age = 25; // static
	

	public static void main(String[] args) {
		// How to call the static vars and methods.
		//1. direct calling
		System.out.println(age);
		System.out.println(name);
		// when to create static vars?
		//==> when you want to have the vars as common property. Like number of wheels in a car = 4;
		// if you are creating a non-static wheel, then each object can acces it and any one can change it to another value?
		
		
	}

}
