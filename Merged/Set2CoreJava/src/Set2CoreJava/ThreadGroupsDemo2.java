package Set2CoreJava;

public class ThreadGroupsDemo2{
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("main sub-thread group");
		Thread t1=new Thread(tg,"Aayush thread");
		Thread t2 =new Thread(tg,"Shashwat Thread");
		System.out.println("Current thread-group name: "+tg.getName());
		System.out.println("Parent thread-group name: "+tg.getParent().getName());
		t1.start();
		t2.start();
		System.out.println(tg.activeCount());//Output:1
		System.out.println(tg.getParent().activeCount());//Output:2
		System.out.println(tg.activeGroupCount());//Output:0
		System.out.println(tg.getParent().activeGroupCount());//Output:1.
		System.out.println(tg.getParent().getParent().activeGroupCount());//Output:3
		System.out.println(tg.getMaxPriority());//Output:10
		tg.setMaxPriority(7);
		System.out.println(tg.getMaxPriority());//Output:7
		tg.list();//it will be print he information of thread-group
	}
}
