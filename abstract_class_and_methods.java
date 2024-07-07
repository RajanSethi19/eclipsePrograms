package abstract_concepts;

abstract class count { // abstract class
	abstract void one();

	abstract void two();// abstract methods

}

public class abstract_class_and_methods extends count {
	
	void one() {
		System.out.println("implemented method 1");
	}

	void two() {
		System.out.println("implemented method 2");
	}

	public static void main(String[] args) {
		
		new abstract_class_and_methods().one();
		new abstract_class_and_methods().two();

	}

	

}
