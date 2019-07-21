package 静态方法;

public class Test1 {
	int a;
	static int b;
	void show() {
		System.out.println(this.a);//this：当前变量
		System.out.println(Test1.b);//类名：
	}
	static void test() {
		//System.out.println(a);报错静态方法只能访问静态变量
		System.out.println(b);//默认没有类名
	}
}
