package exception;

public class B {
	void m2(int x)throws RuntimeException{
		System.out.println(1);
		int ans = 10/x;      // ArithmeticException is thrown and it can be handled by Runtimeexception
		System.out.println(ans);
		System.out.println(2);
		}
	
	void m3(){
		System.out.println("in m3");
		try {
			m2(0);
		}catch(RuntimeException re){
			System.out.println("in 3 catch");
		}
	}
}
