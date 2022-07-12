package tutorials.jdk8.functionalInterfaces;


import java.util.Comparator;

/**
 * Functional interfaces have a single functionality to exhibit. For example, a Comparable interface with a single method ‘compareTo’ is used for comparison purpose. Java 8 has defined a lot of functional interfaces to be used extensively in lambda expressions. Following is the list of functional interfaces defined in java.util.Function package.
 */

public class FunctionalInterfaces {
	public static void main(String[] args) {
		
		User u = new User(1);
		User u2 = new User(2);
		User u3 = new User(1);
		
		
		Comparator<User> comparator = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return 0;
			}
		};
		
		
	}
}


class User {
	
	private Integer ID;
	
	public User(Integer ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return this.ID;
	}
}



