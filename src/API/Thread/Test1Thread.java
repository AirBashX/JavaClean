package API.Thread;

public class Test1Thread {
	
	public static void main(String[] args) {
		//2.创建线程
		Processor processor = new Processor();
		//3.启动线程
		processor.start();
		Processor3 processor3 = new Processor3();
		//3.启动线程
		processor3.start();
		
		for(int i=0;i<=100;i++) {
			System.out.println("main-->"+1);
		}
		Thread thread = Thread.currentThread();
		Thread thread2 = new Thread();
		System.out.println("currentThread:"+thread.getName());
		System.out.println("new:"+thread2.getName());
		
		/*
		 * Thread.currentThread().setName("blue");
		 * System.out.println("main方法定义后线程名"+Thread.currentThread().getName());
		 */
	}
}

//1.定义线程:新建类继承Thread
class Processor extends Thread{
	//重写run方法
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("run-->"+1);
		}
		Thread thread = Thread.currentThread();
		Thread thread2 = new Thread();
		System.out.println("this2:"+this.getName());
		System.out.println("currentThread2:"+thread.getName());
		System.out.println("new2:"+thread2.getName());
	}
}
class Processor3 extends Thread{
	//重写run方法
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("run-->"+3);
		}
		Thread thread = Thread.currentThread();
		Thread thread2 = new Thread();
		System.out.println("this3:"+this.getName());
		System.out.println("currentThread3:"+thread.getName());
		System.out.println("new3:"+thread2.getName());
	}
}