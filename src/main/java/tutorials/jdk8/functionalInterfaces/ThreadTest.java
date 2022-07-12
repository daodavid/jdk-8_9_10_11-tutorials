package tutorials.jdk8.functionalInterfaces;

public class ThreadTest {
	
	public static void main(String[] args) {
		int i = 1;
		
		Thread t1 = new Thread( () -> {
			int c = 0;
			System.out.print("f");
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			int i = 0;
			@Override
			public void run() {
				i++;
			}
		});
		
		t2.start();
		
	
	}
}
