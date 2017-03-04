package test1;

public class TestRunnable1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestRunnable().lacunch();
	}

	private void launch() {
		Run1 run1 = new Run1();
		new Thread(run1).start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

	private class Run1 implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				System.out.println("Runner1 : " + i);
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
