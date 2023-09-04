package Set2CoreJava;

class PlayAudio extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Audio playing");
		}
	}
}

class PlayVideo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("V playing");
		}
	}
}

public class MutiThreadingDemo2 {
	public static void main(String[] args) {
		PlayAudio pa = new PlayAudio();
		pa.start();
		pa.start();//We can not call a dead thread, we caanot call the same thread to do the same task
		//it will cause Exception"ava.lang.IllegalThreadStateException"

		PlayVideo pv = new PlayVideo();
		pv.start();

	}

}
