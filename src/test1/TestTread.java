package test1;

public class TestTread {
	public static void main(String[] args) {
		Runner r = new Runner();
		Thread t = new Thread( r );
		t.start();
		
		for(int i = 0; i < 10; i ++ ) {
			System.out.println("yn" + i);
		}
	}
}
class Runner implements Runnable {
	public void run() {
		for(int i = 0; i < 10; i ++ ) {
			System.out.println("yxx" + i);
		}
	}
	
}
