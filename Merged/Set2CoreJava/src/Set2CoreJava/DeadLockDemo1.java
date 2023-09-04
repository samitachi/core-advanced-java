package Set2CoreJava;

class Resource1a {

}

class MyThread1a extends Thread {
	Resource1a res1, res2;

	MyThread1a(Resource1a res1, Resource1a res2) {
		this.res1 = res1;
		this.res2 = res2;
	}

	public void run() {
		synchronized (res1) {
			System.out.println("Thread1 has alocated Resource1a 1");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			synchronized (res2) {
				System.out.println("Thread1 has alocated Resource1a 2");
			}
		}
	}
}

class MyThread2a extends Thread {
	Resource1a res1, res2;

	MyThread2a(Resource1a res1, Resource1a res2) {
		this.res1 = res1;
		this.res2 = res2;
	}

	public void run() {
		synchronized (res2) {
			System.out.println("Thread2 has alocated Resource1a 2");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			synchronized (res1) {
				System.out.println("Thread2 has alocated Resource1a 1");
			}
		}
	}
}

public class DeadLockDemo1 {
	public static void main(String[] args) {
		Resource1a res1 = new Resource1a();
		Resource1a res2 = new Resource1a();

		MyThread1a t1 = new MyThread1a(res1, res2);
		t1.start();
		MyThread2a t2 = new MyThread2a(res1, res2);
		t2.start();
	}
}/*Output
Thread1 has alocated Resource1a 1
Thread2 has alocated Resource1a 2

Other part of print statement is unable to get printed due to deadlocking*/
