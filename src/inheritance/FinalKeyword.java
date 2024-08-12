package inheritance;

public class FinalKeyword {
	int x;
	//final int x;  // with final keyword, instance variable need to be initialize
	
	int y = 10;
	//y = 11;		//C.E.
	//int y =11;   //C.E.
	
	void m1(final int x) {
		final int y;  // with final keyword, local variable is not compulsory to initialize. It can be initialize before use(refer line.13)
		y =10;
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
