package Day2;
//Practice question for If condition:
//Problem:  
/*
	Given an integer, n, perform the following conditional actions:
	• If n is odd, print Weird
	• If n is even and in the inclusive range of 2 to 5 , print Not Weird
	• If n is even and in the inclusive range of 6 to 20 , print Weird
	• If n is even and greater than 20 , print Not Weird
*/
public class Ex_Conditions {

	public static void main(String[] args)
	{
		// assign some value for n here.
		int n = 18;
		if (n % 2 == 1) // to check if n is even
		{
			System.out.println("Weird");
		} 
		else 
		{
			if (n >= 2 && n <= 5 ) // for the range between 2 and 5
			{
				System.out.println("Not Weird");
			}
			else if (n >= 6 && n <= 20 ) // for the range between 6 and 20
			{
				System.out.println(" Weird");
			}
			else 
			{
				System.out.println("Not Weird");
			}
		}
	    
	}

}
/* the code with proper scanner class
 * import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N % 2 == 1) // to check if n is even
		{
			System.out.println("Weird");
		} 
		else 
		{
			if (N >= 2 && N <= 5 ) // for the range between 2 and 5
			{
				System.out.println("Not Weird");
			}
			else if (N >= 6 && N <= 20 ) // for the range between 6 and 20
			{
				System.out.println(" Weird");
			}
			else 
			{
				System.out.println("Not Weird");
			}
		}

    }
}
 * */
