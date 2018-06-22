package Day3;

public class Cl_Arrays {

	public static void main(String[] args) {
		// 1. int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 33;
		i[3] = 40;
		//i[5] = 50;  throws error -->  java.lang.ArrayIndexOutOfBoundsException: 5
		// to print size of the array
		System.out.println(i.length);
		
		for (int x = 0; x < 4 ; x++)
		{
			System.out.println(i[x]);
		}
		 System.out.println("********************");
		// we can also use the assignment as int j[] = {10, 20, 33, 40};
		
		// double array
		double d[] = new double[2];
		d [1] = 23.45;
		d [2] = 98.12;
		
		for (int x = 0; x < 2 ; x++)
		{
			System.out.println(d[x]);
		} 
		System.out.println("********************");
		
	}

}
