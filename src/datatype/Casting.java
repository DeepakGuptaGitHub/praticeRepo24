package datatype;

public class Casting {  //byte > short > int > long > float > double
	byte b = 10;					//Byte Range: -128 to 127
	int a = 12;
	//int c = 12L;               	// C.E. [Cannot convert long to int]
	
	
	double d = 12L;   		 		// storing long in double
	double d2 = 12.3f;   	 		// storing float in double
	double d3 = 12.0;   			// represent double
	
	float f = 45;  					// storing int in float
	//int e = 45.5f;    			// C.E. [Cannot convert float to int]
	float f2 = 12L;					// Storing long into float
	
	
	int z = (byte)130.5;   			// S.O.P -> -126 (will give answer in byte)
	//System.out.println(z);  		// C.E. [Cannot write execution statement outside method]
	
	// valid to add number in byte
	byte datatype() {
		int x;
		double d3 = (int)12/5;			//2.0
		double d4 = (double)12/5;  		//2.4
		double d5 = (double)(12/5); 	//2.0
	//	return x;		      		// C.E. [Cannot convert int to byte]
	//	return 324;		      		// C.E. [Cannot convert int to byte as byte range is -128 to 127]
		return 24;        			// No C.E. [As we return 24 and not int x value]
	}	
	
	
	// Cannot add fraction in float directly
	float datatype(int y) {   
	//	return 24.0;      			// C.E. [Cannot convert double to float]
		int x;
		System.out.println(y);  	// No C.E. [Local variable(parameter/argument) y shows no error]
		//System.out.println(x);  	// C.E. [Local variable x needs to initialize]
		return 24.0f;
	}
	
	public static void main(String[] args) {
		Casting casting = new Casting();
		System.out.println(casting.datatype());
		System.out.println(casting.z);
	}

}
