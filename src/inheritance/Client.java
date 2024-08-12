package inheritance;

public class Client {

	public static void main(String[] args) {
		Manager mn1 = new Manager();
		//System.out.println(mn1.x);
		System.out.println(mn1.y);
		mn1.m1();
		mn1.m2();
		
		Employee e1 = new Employee();
		//System.out.println(e1.x);
		System.out.println(e1.y);
		e1.m1();
		e1.m2();
		//e1.m4(5,880); // ambiquous 
		//e1.m5(800);  //int to short not possible
		
		
		//Employee em1 = new Manager();  // C.E.
		
		Manager mn3 = new Employee();
		//System.out.println(mn3.x);
		System.out.println(mn3.y);
		mn3.m1();
		mn3.m2();		
	}

}
