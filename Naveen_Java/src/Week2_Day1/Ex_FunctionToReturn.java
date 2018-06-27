package Week2_Day1;

public class Ex_FunctionToReturn {

	// my function to return the area of a rectangle after taking length and breadth

	public static int areaOfRectangle(int length, int breadth) {
		// now return the area
		return length * breadth;
	}
	public static String rootsOfQuadratic(int a, int b, int c) {
		// here the calculation goes
		/*// to get the roots, we need to initiate the local variables here.
		double root1 = 0;
		double root2 = 0;*/

		if ((b^2) < 4*a*c) {
			System.out.println("a is "+a);
			System.out.println("b is "+b);
			System.out.println("c is "+c);
			System.out.println("The given equation has complex roots");
			return "Complex Roots";
		}else {
			System.out.println("a is "+a);
			System.out.println("b is "+b);
			System.out.println("c is "+c);
			double term = ((b^2) - (4*a*c));
			System.out.println("Term value is :"+term);
			 double root1 = (-b + (Math.sqrt(term))/2*a);
			 double root2 = (-b - (Math.sqrt(term))/2*a);
			 //System.out.println(root1);
			 //System.out.println(root2);
			// if the roots are initiated before if, that will throw error.
			 return "The roots of the equation are "+ root1 + " and "+root2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area1 = areaOfRectangle ( 12, 4);
		System.out.println("The first rectangle with length as 12 and breadth as 4 has area "+ area1);
		String roots = rootsOfQuadratic(2,-8,-4);
		System.out.println(roots);
	}
}
