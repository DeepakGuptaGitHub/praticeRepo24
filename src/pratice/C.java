package pratice;

public class C extends B{

	final int x = 50;
	
	{
		//System.out.println(x);
		int x = 5;
		//this.x = 10;
		System.out.println(5);
		System.out.println(x);
		
	}
	
	C(){
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		A a = new C();
		//System.out.println(x);
		
	}

}
 // 1 10 3 m1 start 5 10 10