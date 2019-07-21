package API.Thread;

/**
 * currentThread()相关方法
 * @author ZSP
 */
public class Test4CurrentMethod {
	public static void main(String[] args) {
		Test test = new Test();
		Thread thread = new Thread(test);
		thread.start();
	}
}
class Test implements Runnable{
	@Override
	public void run() {
		System.out.println("RUN线程开始");
		Thread.currentThread();
		System.out.println("RUN线程结束");
	}
}