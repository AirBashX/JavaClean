package API.Thread;

public class Test8Sleep extends Thread{
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println("thread线程开始执行"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	public static void main(String[] args) {
		new Test8Sleep().start();
		new Test8Sleep().start();
	}

}
