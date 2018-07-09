package Week2_Day1;

public class OOPs_Functions {

	public static void main(String[] args) {
		// functions and Methods are same
		// function or method is like a factory. It produces something.
		// There are three type of factories
		//1. Main is also a method. There is a rule. We can not create a method inside a method.
		
		///// ****** Calling methods from Main
		// an object has to be created.
		
		// structure to initiate an object in Java ---> ClassName Object_Ref_Variable = new ClassName()
		OOPs_Functions ob = new OOPs_Functions();
		
		System.out.println(ob.div(12, 7));
		
	}
	//Rules: 1. Can not create a function inside a function
	//2. function can not return multiple vaalues. No multiple return statements
	//3. functions are independent -- parallel to each other.
	//4. no duplicate functions are allowed.
	//5. but a method can be over loaded. A function with same name but different parameters.
	//6. 
	
	
	//1. No input and No output - Method.  
	// This function doesnot accepts anything and does not returns anyting
	// void -- it does not return any value:
	public void test() {
		System.out.println("Method with no return");
	}
	//2. No input but some output - Method
	// this does not take any input but returns something
	public int sum() {
		System.out.println("This method takes nothing but gives sum");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c; // when there is a return the datatype can not be void. It should proper data type like int here.
	}
	//2a. some function to return a string
	public String getName() {
		System.out.println("This method should return a string");
		return "Tom";
	}
	//3. Some input and some output method 
	// this should take some values and returns some values
	public float div(int a, int b) {
		System.out.println("This method takes integers a and b and returns the integral value of a/b ");
		float d = (int)a/b;
		return d;
	}
	
	
	
	
}
