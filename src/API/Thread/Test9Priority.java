package API.Thread;
/**
 * 模拟优先级
 * @author ZSP
 *
 */
public class Test9Priority implements Runnable{
	
	public static void main(String[] args) {
		Test9Priority test1 = new Test9Priority();
		Thread thread1 = new Thread(test1,"低优先级");
		thread1.setPriority(Thread.MIN_PRIORITY);
		Test9Priority test2 = new Test9Priority();
		Thread thread2 = new Thread(test2,"高优先级");
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for(int i=0;i<100;i++) {
			System.out.println(thread.getName()+"的优先级是:"+thread.getPriority());
		}
		
	}

}
