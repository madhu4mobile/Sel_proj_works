package Day4;

public class Cl_DynamicArry {

	public static void main(String[] args) {
		// static arrays will have fixed length of the array
		// to have a changing length on demand, we have to use dynamic array
		// to use a multiple data types, we have to use object array also used as array list.
		ArryaList ar = new ArrayList();

		ar.add[100];
		ar.add[200];
		ar.add[300];
		ar.add[400];
		// to get array size, ar.size();

		//to print a particular value
		System.out.println(ar.get(3));

		// to print all the values from array list
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
// to remove any element
		ar.remove(2);// this removes the second element and the remaining elements will be shifted up to occupy that place.
		
		

		// Integer ArrayList;


		}



}
