package Basics1;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		i = 20;  // it replaces the value of i. But does not show error as i is already declared
		int j = 12;
		
		double d1 = 34.02;
		double d2 = 07.12;
		double d3 = 12;  // can assign an integer to a double variable. But reverse is not true
		
		char c = 'c';  // double quotes show error
		char a = 'a';
		//char i = 'i';  // here i is a duplicate local variable. As this had been used in int
		char i1 = 'i';
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(i+j);  // addition of two int values --> 32 expected
		System.out.println(i + d1); //addition of an int with double value. ?? gives double?
		System.out.println(d1+i);// addition of double with int??
		System.out.println(b1);
		System.out.println(c+i);// char added with int  --> expected c20  but got 119
		System.out.println(i+c);// int added with char  --> expected 20C but got 119
		
		
		
		
		
		
		

	}

}
