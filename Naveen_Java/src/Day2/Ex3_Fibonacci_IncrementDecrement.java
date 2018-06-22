package Day2;

import com.sun.source.tree.WhileLoopTree;

/*
 * Print Fibonacci Series
To print Fibonacci series in Java Programming,
you have to first print the starting two of the Fibonacci series
 and make a while loop to start printing the next number of the Fibonacci series.
  Use the three variables say a, b and c.
  Place b in c and c in a, and now place a+b in c to print the value of c
   to make the Fibonacci series as shown in the following program.
 * */
public class Ex3_Fibonacci_IncrementDecrement {

	public static void main(String[] args) {
		int a = 1; int b = 1; int c = 0;

		int limit = 10; //set the range of the series
		int i = 0;
		while ( limit < 0) { // initiate a condition till i is less than the limit

			b = c;
			c = a;
			System.out.println(c);
			c = a+b;
			limit--;
		}


	}

}
