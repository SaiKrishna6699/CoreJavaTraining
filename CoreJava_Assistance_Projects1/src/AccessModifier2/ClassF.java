package AccessModifier2;

import AccessModifier1.ClassE;

public class ClassF {
	public static void main(String[] args) {
		ClassE obj = new ClassE();
		System.out.println("Accessing Public class from Different Package");
		obj.display();
	}

}
