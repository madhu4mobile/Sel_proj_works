package Day2;

public class Cl_decrementAndIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = a++; // post increment   --> this first assigns the value of a to b and then increases the value of a by 1
		System.out.println(a); // should print 2 as the present value of a is 2 after the increment	
		System.out.println(b); // should print 1 as the initial value of a is assigned to b and then the value of a is increased.	

		int c = 2;
		int d = ++c; // pre increment  --> this increases the value of C first and then assigns to d


		System.out.println(c); // should print 3 as after the above two lines (before coming to this line) the value of C is increased by 1. 



		System.out.println(d);// should print 3 as d gets the value of C after increment.
		/* Info
		 * y = ++x; is equivalent to the following two statements ( AKA Pre-Increment)
		 * x = x + 1;
		 * y = x;
		 * 
		 * Similarly,
		 * y = x++; is equivalent to ( AKA post increment )
		 * y = x;
		 * x = x + 1;
		 * 
		 * 
		 * */
		

	}

}
