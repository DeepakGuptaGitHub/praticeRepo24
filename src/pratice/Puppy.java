package pratice;

import inheritance.Dog;

public class Puppy extends Dog {

	String breed;
	
	public Puppy(String breedType) {
		this.breed = breedType;
	}
	public static void main(String[] args) {
		Dog a = new Puppy("Golden Retriever");
		System.out.println(a);
	}

	public String toString(){
		return breed;
	}
}
