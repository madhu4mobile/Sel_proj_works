package Day2;

public class Cl2_Conditions_GreatestOf3 {

	public static void main(String[] args) {
		// to print greates of the three given numbers
		int a = 200;
		int b = 700;
		int c = 100;

		if (a>b && a>c)  // the shortest way to find the greatest of three.
		{
			System.out.println("Greatest number is "+a);
		} else if (b > c)
		{
			System.out.println("Greatest number is "+b);
		} else
		{
			System.out.println("Greatest number is "+c);
		}

	}

}
