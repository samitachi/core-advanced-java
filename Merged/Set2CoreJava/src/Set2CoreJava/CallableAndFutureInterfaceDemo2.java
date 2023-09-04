package Set2CoreJava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadTask1 implements Callable {
	public Object call() {
		int a=20,b=10,c;
		c=a+b;
		return c;
	}
}

public class CallableAndFutureInterfaceDemo2 {
	public static void main(String[] args) throws Exception {
       ExecutorService es = Executors.newFixedThreadPool(3); //3 threads gets formed inside thread pool,from which
       //any thread can be called to execute the task.
       ThreadTask1 tt = new ThreadTask1();
       Future f = es.submit(tt);
       System.out.println(f.get());
       es.shutdown();
       //output: 30
	}
}