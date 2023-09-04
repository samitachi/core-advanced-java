package Set2CoreJava;

public class ThreadGroupsDemo3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());//10
		System.out.println(Thread.currentThread().getPriority());//5
		
		ThreadGroup tg=new ThreadGroup("sub-tg");
		Thread t1 = new Thread(tg,"deepak thread");
		t1.start();

		Thread t2 = new Thread(tg,"Aayush thread");
		t2.start();
		
		System.out.println(tg.getMaxPriority());//10
		System.out.println(t1.getPriority());//5
		
		tg.setMaxPriority(7);
		
		System.out.println(tg.getMaxPriority());//7
		System.out.println(t1.getPriority());//5
		
		ThreadGroup sub_tg = new ThreadGroup(tg,"sub-sub-tg");
		System.out.println(sub_tg.getMaxPriority());//7
	}
}
