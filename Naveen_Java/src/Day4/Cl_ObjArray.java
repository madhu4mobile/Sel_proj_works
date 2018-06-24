package Day4;

public class Cl_ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object Array;  --> This is used to give mixed data type array. But still it is a static array.
				Object ob[] = new Object[4];
				ob[0] = "Tom";
				ob[1] = "65";
				ob[2] = "M";
				ob[3] = 123.45;
				
				// to print the values
				for (int i = 0; i<ob.length-1; i++)  {
					System.out.print(ob[i]+", ");
				}
			
				int k = ob.length;
				
				System.out.print(ob[k-1]);  // to avoid the last trailing comma. followed this logic.
				
			}


}
