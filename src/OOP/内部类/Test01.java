package OOP.内部类;

/**
 * 成员内部类:
 * 非静态内部类:外部类能通过新建内部类对象访问内部类方法,但是不能访问内部类变量;
 * @author ZSP
 */
public class Test01 {
	
	private String A = "外部类成员变量";
	public class Inclass{
		private String B = "内部类成员变量";
		public void inMethod() {
			String C ="内部类局部变量";
			System.out.println(C);
		}
	}
	public void test() {
		Inclass inclass = new Inclass();
		//1.访问内部类方法
		inclass.inMethod();
		//2.访问外部类方法
		//System.out.println(inclass.A);
	}
	public static void main(String[] args) {
		Test01 s = new Test01();
		s.test();
	}
}
