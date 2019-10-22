package OOP.静态;

public class Test01 {
	int a;
	static int b;
	public void show() {
		System.out.println(this.a);//this：当前变量
		System.out.println(Test01.b);//类名：
	}
	public static void test() {
		//System.out.println(a);报错静态方法只能访问静态变量
		System.out.println(b);//默认没有类名
	}
}
