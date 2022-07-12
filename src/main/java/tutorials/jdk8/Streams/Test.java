package tutorials.jdk8.Streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	private static String[] arrayOfEmps = {
			"1", "2", "4"
	};
	
	
	private static List<String> empList = Arrays.asList(arrayOfEmps);
	
	public static class Recalculate{
		
		
		double result = 0;
		public Recalculate(){
			super();
		}
		
		public void sum(String a){;
			this.result = this.result + Integer.parseInt(a);
		}
		
		public double getResult(){
			return result;
		}
	}
	
	public static void main(String[] args) {
		Stream.of(arrayOfEmps);
		
		
		int i = 0;
		Consumer k = p -> {
		
		};
		
		empList.stream().forEach(c -> System.out.print(c));
		
		List newList = empList.stream().map(c -> Integer.parseInt(c)*4 ).collect(Collectors.toList());
		
		System.out.println(newList.get(0).getClass());
		
		
		Recalculate r = new Recalculate();
		
		empList.stream().forEach( c -> r.sum(c));
		
		System.out.println(r.getResult());
		
		long p = empList.stream().filter(c ->
			 Integer.parseInt(c) > 2
		 ).count();
		
		System.out.println(p);
		
	}
}
