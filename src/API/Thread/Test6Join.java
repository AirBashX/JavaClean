package API.Thread;

/**
 * 检验join()的作用;当try没有被注释,"main方法执行结束"将最后执行;
 * @author ZSP
 *
 */
public class Test6Join {
	public static void main(String[] args) {
		
		Runnable a = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("线程a开始执行");
				}
			}
		};
		
		System.out.println("main方法开始执行");
		Thread thread = new Thread(a);
		thread.start();
		//try {
		//	thread.join();
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		System.out.println("main方法执行结束");
	}
}
