package inheritance;

public class Employee extends Manager{
	private int x =30;;
	int z = 35;
	
	@Override
	void m1() {
	System.out.println("Employee m1 " + z);
	}
	
	public void m2() {
		System.out.println("Employee m2 " + y);
		m3();
	}
	
	 void m3() {
		System.out.println("Employee m3 ");
	}	
	
	 void m4(int a, long b) {
		System.out.println("method 1 ");
	}	
	 
	 void m5(short b) {
		System.out.println("method 1 ");
	}	
	 
	 void m4(long a, int b) {
		System.out.println("method 2 ");
	}	
	 
}
