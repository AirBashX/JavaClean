package API.Thread;

/**
 * currentThread和this的区别
 * @author ZSP
 *
 */
public class Test5CurrentThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		new Thread(mt, "Name1").start();
		new Thread(mt, "Name2").start();
		new Thread(mt).start();
		//System.out.println(Thread.currentThread().getName()); // main主方法
	}
}

class MyThread extends Thread {
//2:14;1:13;-:15
	@Override
	public void run() {
		try {
			Thread.sleep(500);
			Thread t = Thread.currentThread();
			System.out.println("t:当前线程名字：" + t.getName() + " 当前线程的优先级别为："+ t.getPriority() + " ID:" + t.getId());
			System.out.println("this:当前线程名字：" + this.getName() + " 当前线程的优先级别为：" + this.getPriority() + " ID:"+ this.getId());
			 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



