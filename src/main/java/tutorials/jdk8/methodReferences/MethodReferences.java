package tutorials.jdk8.methodReferences;

import java.io.LineNumberInputStream;
import java.util.ArrayList;

/**
 * Method references help to point to methods by their names. A method reference is described using "::" symbol. A method reference can be used to point the following types of methods −
 *
 *     1. Static methods
 *     2. Instance methods
 *     3. Constructors using new operator (TreeSet::new)
 *
 */
public class MethodReferences {
	
	
	
	
	public String  print(Object c){
		System.out.println(c.getClass().toString() + ": " +c);
		return " f";
	}
	
	public static void main(String[] args) {
		MethodReferences m = new MethodReferences();
		
		
		ArrayList list2 = new ArrayList();
		
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("David");
		
		list.forEach(m::print);
	}
	

}
