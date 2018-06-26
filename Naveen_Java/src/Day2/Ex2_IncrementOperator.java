package Day4;

public class Ex2_IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x2, y2, z2;
		x2 =2;
		y2=3;
		z2=4;
		//System.out.println(""+z2+y2++);

		System.out.println(""+z2+y2++*2);// ans is 46


		// reson is simple
		// in the case of (""+z2+y2++*2)  --> from left to right, because of "", null string is added to z2. so it will be a string 4.
		// then while doing y2++, first the initial value of y2 = 3 is concatenated to 4 and the result is 43.
		//after that,y2 value is increased by 1 but it will be stored as 4 in memory. For the present line, the value of y2 is still 3
		// due to y2*x2, the last digit is printed as 6.

		// proof if we print y2 value in the next line, we can see y2 as 4.

		System.out.println(y2);//y2 is 4 now as the value of y2 is increased in last step.
		//
		//now we can expalin why the answer is 12 for the follwing print.
		System.out.println(z2+y2++*x2);// ans is 12   Why is that??


	}

}
