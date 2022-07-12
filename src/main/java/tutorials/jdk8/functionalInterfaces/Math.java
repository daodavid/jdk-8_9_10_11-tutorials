package tutorials.jdk8.functionalInterfaces;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Math {
	
	
	public static void main(String[] args) {
		Calc sum = (a,b) -> a+b;
		//Calc multiple = (a,b) -> a*b;
		
		System.out.println(sum.calculate(4,2));
		//System.out.print(multiple(4,2));
		
		
	 	Math m = new Math();
	    double result = m.action(2,3 ,(a,b) -> a*b);
	    System.out.println(result);
	 
	}
	
	
	
	
	public double action(int a, int b,Calc c){
		c.toString2();
		return c.calculate(a,b);
	}
	
    @FunctionalInterface
	interface Calc{
		 double calculate(double a, double b);
		 
		
	     default String toString2(){
		    return "Fuck";
		 }
	}
}
