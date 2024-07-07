package abstract_concepts;

class birds {

	void crow() {
		System.out.println("I am in birds class and crow method");
	}

	void owl() {
		System.out.println("I am in birds class and owl method");
	}

}

abstract class animals extends birds {
	abstract void cat();

	abstract void Dog();

	void horse() {
		super.crow();
		super.owl();
		System.out.println("I am in abstract animal class and horse method");
	}

	void lion() {

		System.out.println("I am in abstract animal class and lion method");
	}
}

public class Abstract_first_Assgnment extends animals {
	void fish() {
		super.horse();
		super.lion();

		System.out.println("I am in abstract_first_Assignment class and fish method");
	}

	void whale() {
		System.out.println("I am in abstract_first_Assignment class and whale method");
	}

	void cat() {
		System.out.println("Implemented method of abstract class :-cat");
	}

	void Dog() {
		System.out.println("Implemented method of abstract class :-Dog");
	}

	public static void main(String[] args) {
		Abstract_first_Assgnment ab = new Abstract_first_Assgnment();
		ab.fish();
		ab.whale();
		ab.cat();
		ab.Dog();

	}

}
