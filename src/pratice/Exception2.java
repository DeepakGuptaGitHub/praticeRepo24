package pratice;

import java.io.IOException;

public class Exception2 extends ExceptionHandling  {

	public void  m1() throws Exception{
		try {
			System.out.println("Start");
			throw new Exception(); 
		}finally {
			System.out.println("Finally");
		}
	}
	
	public static void main(String[] args) throws Exception{
		Exception2 Exception2 = new Exception2();
		try {
			Exception2.m1();
		}catch(IOException e){
			System.out.println("Start");
		}
			finally {
				System.out.println("Finally 2");
		}

		System.out.println("end3");
		
	}
}
