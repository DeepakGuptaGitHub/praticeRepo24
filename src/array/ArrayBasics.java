package array;

public class ArrayBasics {
	//No of ways to declare array
	int[] num1 = {10,20,34};
	int num2[] = {10,30,40};
	int[] num3 = new int[3];
	int[] x;   //allowed
	//int[] num4 = new int[3]{10,30,50}; CE
	void m1() {
	String[] arr = {"Abc", "XYZ"};
	String[] arr2 = arr;
	System.out.println(arr);
	System.out.println(arr2);
	}
	//Return array
	int[] m1(int[] num) {
		return num;
	} 

	public static void main(String[] args) {
		//Declare local variable and reference variable
		ArrayBasics arrayBasics;
		
		String[] arr = {"Abc", "XYZ"};
		//arr = {"asd", "ssd"};    //C.E. ...Not allowed
 		String[] arr2 = arr;
		System.out.println(arr); //MA1
		arr = null;
		System.out.println(arr);  //pointing towards Null
		//System.out.println(arr.length);  //Null pointer Exception
		System.out.println(arr2); //MA1
		
		
		String[] arr3 = {"Abc", "XYZ"};
		arr3[10000]= "asd";  // array out of bounds.
		arr3[0]= null;
		System.out.println(arr3[0]); 
		//System.out.println(arr3[0].length());  //null pointer exception
		
		
		int[] num = {};
		System.out.println(num.length);  //0
		
		int[] num2;  //allowed
		//System.out.println(num2);  // C.E.
		//ystem.out.println(num2.length);   //C.E.
		

		
		
	}

}
