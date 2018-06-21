package Day2;
//Write a Java program that reads in two floating-point numbers and tests 
//whether they are the same up to three decimal places
public class Ex2_Conditions {

	public static void main(String[] args) {
		
		double num1 = 0;
		double num2 = 0;
		// assign the first number a here
		num1 = 1234.2323;
		num2 = 1234.2324;
		
		//double value = 3.25;
		//double fractionalPart = value % 1;
		//double integralPart = value - fractionalPart;
		
		double fractionalPartOfNum1 = (num1 % 1)*1000;
		double integralPartOfNum1 = (num1 - fractionalPartOfNum1/1000);
		
		System.out.println(integralPartOfNum1);
		System.out.println(fractionalPartOfNum1);
		

	}

}
