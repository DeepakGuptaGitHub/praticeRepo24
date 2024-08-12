package inheritance;

public class Manager {
	int x = 10;
	static int y = 15;
	
	void m1() {
		System.out.println("Manager m1 " + x);
		m2();
	}
	
	protected void m2() {
		System.out.println("Manager m2 " + y);
	}
	
	void m3() {
		System.out.println("Manager m3 " + y);
	}
}
