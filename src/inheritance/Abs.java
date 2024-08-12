package inheritance;

public abstract class Abs {
	int value;
	Abs(){
		addValue();
		System.out.println(value);
		
		String [] a = {"a","b"};
		a[1000] ="s";
	}
	
	abstract void mn();
	
	void addValue() {
		value = value + 10;
	}

}
