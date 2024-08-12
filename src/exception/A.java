package exception;

public class A {
	void m1() {
		System.out.println("A m1");
		B b = new B();
		try {
			b.m3();
		}catch(ArithmeticException ae) {
			System.out.println("in A catch");
		}
		System.out.println("A m1 end");
		
		}
	
	public static void main(String[] args){
		System.out.println("Start");
		A a = new A();
		a.m1();
		System.out.println("End");
	}
}
