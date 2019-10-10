package API.Thread;

/**
 * 同步块
 * 
 * @author ZSP
 *
 */
public class Test10WEB {

	class Student {
		private String name;
		private Integer price;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getPrice() {
			return price;
		}

		public Student(String name, Integer price) {
			super();
			this.name = name;
			this.price = price;
		}

		public Student() {
			super();
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", price=" + price + "]";
		}

		public synchronized Integer addprice() {
			price = price - 1;
			return price;
		}

	}

	public static void main(String[] args) {
		Student student = new Test10WEB().new Student("a", 10);
		Runnable runnable = new Runnable() {
			public void run() {
				String name = Thread.currentThread().getName();
				synchronized (student) {
					if (student.price - 1 < 0) {
						System.out.println(name + ":资金不足");
					} else {
						student.price = student.price - 1;
						System.out.println(name + ":当前余额" + student.price);
					}
				}
			}
		};
		for (int i = 1; i < 20; i++) {
			Thread thread = new Thread(runnable, "线程" + i);
			thread.start();
		}
	}

}