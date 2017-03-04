package TestSynchronizedStaticOrNot;

public class TestSynchronizedStaticOrNot {

	public static synchronized void staticFunction(String name)
			throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			System.out.println(name + " --- static function running ...");
		}
	}

	public synchronized void function(String name) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			System.out.println(name + " +++ function running ...");
		}
	}

	public static void main(String[] args) {

		final TestSynchronizedStaticOrNot demo = new TestSynchronizedStaticOrNot();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					staticFunction("1");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread11 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					staticFunction("2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					demo.function("1");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread thread23 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					demo.function("12");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread22 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					new TestSynchronizedStaticOrNot().function("2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thread11.start();
		thread1.start();
		thread2.start();
		thread23.start();
		thread22.start();
	}
}
