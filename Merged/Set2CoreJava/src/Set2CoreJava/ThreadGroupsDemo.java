package Set2CoreJava;

public class ThreadGroupsDemo {
	public static void main(String[] args) {
		String name = Thread.currentThread().getThreadGroup().getName();
		System.out.println(name);

		String parent_name = Thread.currentThread().getThreadGroup().getParent().getName();
		System.out.println(parent_name);
	}
}/*Output:
main
system*/
