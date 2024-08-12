package pratice;

public class Pratice01 {
	static int z;
	static void m1(final int x) {
		int y;
		System.out.println(z);
		z = 10;
		System.out.println(x);
		char c = 'a';
		char b = 'b';
		System.out.println(c + b + "-" + c + b);
		int n = Integer.parseInt("abc");
	}
	
	char m1() {
		return 97;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");	
		Pratice01 Pratice01 = new Pratice01(); 
		//System.out.println(Pratice01.m1(2));
		new Pratice01().m1();
		
	}

}
