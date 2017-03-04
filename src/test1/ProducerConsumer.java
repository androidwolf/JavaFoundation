package test1;

public class ProducerConsumer {

	public static void main(String[] args) {
		Tong tong = new Tong();
		Producer p = new Producer(tong);
		Consumer c = new Consumer(tong);
		new Thread(p).start();
		new Thread(c).start();
	}
}

class Baozi {
	int id;

	Baozi(int id) {
		this.id = id;
	}

	public String toString() {
		return "Baozi:" + id;
	}
}

class Tong {
	static int index;
	Baozi[] BZ = new Baozi[10];

	public synchronized void push(Baozi baozi) {
		if (index == BZ.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		BZ[index] = baozi;
		index++;
	}

	public synchronized Baozi pop() {
		if (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return BZ[index];
	}
}

class Producer implements Runnable {
	Tong tong = null;

	Producer(Tong tong) {
		this.tong = tong;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Baozi baozi = new Baozi(i);
			tong.push(baozi);
			System.out.println("生产了 :" + baozi);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	Tong tong = null;

	Consumer(Tong tong) {
		this.tong = tong;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Baozi baozi = tong.pop();
			System.out.println("消费了:" + baozi);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
