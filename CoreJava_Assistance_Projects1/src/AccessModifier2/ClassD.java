package AccessModifier2;

import AccessModifier1.*;

public class ClassD extends ClassC{
	public static void main(String[] args) {
		ClassD obj = new ClassD();
		System.out.println("Accessing Protected Class C from Class D in package B");
		obj.display();
	}
}