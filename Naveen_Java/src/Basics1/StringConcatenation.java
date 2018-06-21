package Basics1;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;

		String s1 = "Hello"; // string data declaration should start with caps letter
		String s2 = "World";

		System.out.println(a+b+s1+s2);  // to be executed from left to right. 300 will be added to HelloWorld
		System.out.println(s1+s2+a+b); // left to right --> HelloWorld100 will be concatenated to 200

		//To add space or comments
		System.out.println("First string is "+s1);
		System.out.println("String with tab character space is "+"\t"+s2); // \t is taken for tab
		System.out.println("using new line character"+s1 +"\nIn new line "+s2); // \n is taken for new line

		// will other operations like subtraction and multiplication work?
		//System.out.println(s1*4); // throws error saying * is undefined between strng and int
		//System.out.println(s1-"llo"); // throws error saying undefined for argument






	}

}
