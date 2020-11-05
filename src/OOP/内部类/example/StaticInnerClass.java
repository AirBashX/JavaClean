package OOP.内部类.example;

/**
 * 静态内部类
 * 
 * @author ZSP
 *
 */
public class StaticInnerClass {

	/**
	 * 外部类成员变量
	 */
	private String A1 = "外部类非静态成员变量A1";
	private static String A2 = "外部类静态成员变量A2";

	public void test01() {
		System.out.println(A1 + A2);
	}

	public static void test02() {
		System.out.println(A2);
	}

	public static class Instatic {
		/**
		 * 内部类成员变量
		 */
		private String B1 = "内部类非静态成员变量B1";
		private static String B2 = "内部类静态成员变量B2";

		/**
		 * 内部类局部方法://不能访问外部类实例成员,只能访问外部类的类成员;静态内部类不能直接访问外部类的静态内容
		 */
		public void inMethod() {
			String C1 = "内部类非静态方法局部变量C1";
			System.out.println(A2 + B2);
		}

		public static void inStaticMethod() {
			String C2 = "内部类静态方法局部变量C2";
			System.out.println(A2 + B2);
			StaticInnerClass staticInnerClass = new StaticInnerClass();
			staticInnerClass.test01();
		}
	}

	public class Inunstatic {
		/**
		 * 内部类成员变量
		 */
		private String B1 = "内部类非静态成员变量B1";

		/**
		 * 内部类局部方法
		 */
		public void inMethod() {
			String C1 = "内部类非静态方法局部变量C1";
			System.out.println(A1 + A2 + B1);
		}
	}

	public void testx() {
		Inunstatic inunstatic = new Inunstatic();
		Instatic instatic = new Instatic();

	}

	public static void main(String[] args) {
		StaticInnerClass sic = new StaticInnerClass();
		sic.test01();
		Inunstatic inunstatic = sic.new Inunstatic();
	}

}
