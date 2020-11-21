package OOP.InnerClass;

/**
 * 成员内部类:
 * 非静态内部类:外部类能通过新建内部类对象访问内部类方法,但是不能访问内部类变量;
 * 不报错就是能访问
 * @author ZSP
 */
public class Test01NotStaticInnerClass {
	
	private String A = "外部类成员变量";
	public void OutMethot() {
		System.out.println("外部类方法");
	}
	
	public class InClass{
		private String B = "内部类成员变量";
		public void inMethod() {
			System.out.println("内部类方法");
		}
		
		//外部类访问内部类
		public void inTest() {
			System.out.println(A);
			OutMethot();
		}
	}
	
	//内部类访问外部类
	public void test() {
		//一.直接访问
		//1.外部类直接访问内部类成员变量:失败
		//System.out.println(B);
		//2.外部类直接访问内部类方法:失败
		//inMethod();
		//二.间接访问
		InClass inclass = new InClass();
		//1.访问内部类成员变量
		System.out.println(inclass.B);
		//2.访问内部类方法
		inclass.inMethod();
	}
	
}
