package OOP.InnerClass;

/**
 * 成员内部类:
 * 静态内部类:只能访问外部类的类成员(静态方法+变量),不能访问外部类的实例成员
 * @author ZSP
 */ 
public class Test02StaticInnerCLass {
	
	private String A1 = "外部类成员变量";
	private static String A2="外部类静态成员变量";
	private void OutMethod1() {
		System.out.println("外部类非静态方法");
	}
	
	private static void OutMethod2() {
		System.out.println("外部类静态方法");
	}
	
	public static class Inclass{
		private String B1 = "内部类成员变量1";
		private static String B2 = "内部类成员变量2";
		
		//一.静态内部类非静态方法访:不能访问外部类实例成员,只能访问外部类的类成员
		public void inMethod1() {
			//1.访问非静态内部类:失败
			//System.out.println(A1);
			//2.访问静态内部类
			System.out.println(A2);
			//二.静态内部类非静态方法访问外部类方法:
			//1.访问非静态内部方法:失败
			//OutMethod1();
			//2.访问静态内部类方法
			OutMethod2();
			
		}
		
		//二.静态内部类静态方法:不能访问外部类实例成员,只能访问外部类的类成员
		public static void inMethod2() {
			//1.访问非静态内部类:失败
			//System.out.println(A1);
			//2.访问静态内部类
			System.out.println(A2);
			//二.静态内部类非静态方法访问外部类方法:
			//1.访问非静态内部方法:失败
			//OutMethod1();
			//2.访问静态内部类方法
			OutMethod2();
		}
	}
}
