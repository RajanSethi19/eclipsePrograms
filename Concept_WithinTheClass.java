package Accessspecifier;

public class Concept_WithinTheClass {

	public void add() {
		System.out.println("we are in add method");
	}

	public void sub() {
		System.out.println("we are in sub method");
	}

	public void mul() {
		System.out.println("we are in mu;l method");
	}

	public void div() {
		System.out.println("we are in div method");
	}

	public static void main(String[] args) {
		Concept_WithinTheClass c= new Concept_WithinTheClass();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}

}
