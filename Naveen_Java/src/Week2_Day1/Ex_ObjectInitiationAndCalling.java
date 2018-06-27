package Week2_Day1;

public class Ex_ObjectInitiationAndCalling {
	
	// let me create multiple functions and call them by objects in Main method.
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	public double divide ( int a, int b) {
		if (b == 0) { // in the case of b being zero, returns -1 to show error.
			return -1;
		} else {
			return (double) a/b;  ///=====> the (double) converts the result into double though the variables are integers.
			// without the (double) the result would be an integer division. So the result would be 4.0
		}
	}
	public double percentage(int p, int main) {


		//return (main * p/100);  //  the answer would be 151.0
		//return (double)(main * p/100);  //  the answer would be 151.0
		return ((double)main * (double)p/100);  // without (double) the answer would be 151.0
	}
//////////////////// Now let us call them using Main method.
	public static void main(String[] args) {
		// Initiation of Object
		Ex_ObjectInitiationAndCalling ob = new Ex_ObjectInitiationAndCalling();
		// syntax for initiating object is... 
		// ClassName ObjectReferenceVariable = new ClassNameasMethod();
		
		// now calling of the functions in the class can be done by the object ref variable.
		System.out.println("The sum of two numbers 12 & 27 is "+ob.add(12, 27));
		
		System.out.println("When 45 is subtracted from 293 the result is "+ob.subtract(293, 45));
		
		System.out.println("The multiplication of two numbers -56 & 27 is "+ob.multiply(-56, 27));
		
		System.out.println("When we divide 37 by 8 we get "+ ob.divide(37, 8));
		
		System.out.println("When we divide 37 by 0 we get "+ ob.divide(37, 0));
		
		System.out.println("33% of 459 is  "+ ob.percentage(33,459));

	}
	

	

}
