package API.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * daemon方法检测:当把线程设置以为setDaemon(true)时,main方法执行结束了,线程也就结束了,注释后,main方法结束线程仍可执行
 * @author ZSP
 *
 */
public class Test7Daemon implements Callable<Void>{

	@Override
	public Void call() throws Exception {
		for(int i=1;i<100;i++) {
			System.out.println("call线程执行:"+i);
		}
		return null;
	}

	public static void main(String[] args) {
		Test7Daemon Daemon = new Test7Daemon();
		FutureTask<Void> task = new FutureTask<Void>(Daemon);
		Thread thread = new Thread(task);
		//thread.setDaemon(true);
		boolean daemon2 = thread.isDaemon();
		System.out.println(daemon2);
		System.out.println("main方法开始执行");
		thread.start();
		/*
		 * try { thread.join(); } catch (InterruptedException e) { e.printStackTrace();
		 * }
		 */
		System.out.println("main方法执行完毕");
	}
}
