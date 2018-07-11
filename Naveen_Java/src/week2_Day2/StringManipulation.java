package week2_Day2;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Updates are available for your software.";
		
		System.out.println(str.length()); // to get length of the string.
		
		System.out.println(str.charAt(5)); // prints the character at 5th index --> 6th position.
		
		System.out.println(str.indexOf('s')); // 1st occurance of s
		// index of will take the first occurance.
		//to print the next occurance of 's', use a logic to use the follwing
		System.out.println(str.indexOf('s',6)); // to use the 2nd occurance of 's' by hard coded value
		System.out.println(str.indexOf('s',str.indexOf('s') )); // same as the above.
		
		System.out.println(str.indexOf("Hello"));// -1 as there is no 'Hello' in str.
		
		System.out.println(str.substring(10, 25));// used to slice the string
		
		String s = "     Hello World   ";
		//trim keyword for removing starting and trailing spaces.
		System.out.println(s.trim());// trim does not effect the spaces between words inside.
		
		//compareTo(anotherString) returns ture/false when the string can be seen in main straing.
		String str1 = "Updates Are Available for your software.";
		System.out.println(str.compareTo(s)); // should return False as they are different
		System.out.println(str.compareToIgnoreCase(str1)); // True because ignores case.
		
		
	}

}
