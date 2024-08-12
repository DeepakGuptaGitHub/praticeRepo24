package pratice;

public class Pratice_02 {
		
	int[] num4;
	
	void m1(int arr[]) {
		
	}
	
	public static void main(String[] args) {
	String str =  "Deepak";
	System.out.println(str.contains("a"));
	int[] num = {1};
	int[] num2 = new int[1];
	System.out.println(num.length);	
	System.out.println(num2.length);	
	
	
	int[] num5 = {1,3};
	System.out.println();
	int[] num3 = new int[4];
	System.out.println(num3.length);
	for(int index = 0; index < num3.length; index++) {
		System.out.println(num3[index]);
	}
	
	Pratice_02 Pratice_02 = new Pratice_02();
	Pratice_02.m1(new int[3]); //allowed
	//Pratice_02.m1({1,3,4});   // not allowed
	}

}
