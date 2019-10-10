package OOP.内部类;

/**
 * 成员内部类:
 * 静态内部类:
 * @author ZSP
 */ 
public class Test02 {
	
	private String A1 = "外部类成员变量1";
	private static String A2="外部类成员变量2";
	public static class Inclass{
		private String B1 = "内部类成员变量1";
		private static String B2 = "内部类成员变量2";
		public void inMethod() {
			String C ="内部类局部变量";
			//1.静态内部类:不能访问外部类实例成员,只能访问外部类的类成员
			//System.out.println(A1);
			System.out.println(A2);
		}
	}
	public void test() {
		Inclass inclass = new Inclass();
		System.out.println(inclass.B1);
		System.out.println(Inclass.B2);
		//System.out.println(inclass.inMethod());
	}
	public static void main(String[] args) {
		System.out.println(new Inclass().B1);
		System.out.println(Inclass.B2);
	}
}
