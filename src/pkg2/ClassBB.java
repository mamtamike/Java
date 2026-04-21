package pkg2;

import advanceTopics.AccessModifier;
import advanceTopics.ClassAA;

public class ClassBB {
	public static void main(String[] args) {
		
		AccessModifier Ac = new AccessModifier();//method from class accessModifier of pkg1
		Ac.publicMethod();
		ClassAA ob = new ClassAA();//method from classAA of pkg1
		ob.methodAA();
		
	}

}
