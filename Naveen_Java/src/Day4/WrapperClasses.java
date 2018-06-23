package Day4;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "100";
		System.out.println(x+20);  // 10020
		
		// string to int conversion
		int i = Integer.parseInt(x); // 100
		System.out.println(i+20); // 120
		
		// string to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		//int j = Integer.parseInt(y); // error java.lang.NumberFormatException:
		System.out.println(d+20);
		//System.out.println(j+20);
	
	//String z = "100A";
	//int e = Integer.parseInt(z);  // numberFormatException;
	//System.out.println(e); 
	}
}
