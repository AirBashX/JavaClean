package OOP.内存;

/**
 * 模拟多个变量引用一个对象在栈堆中的关系
 * @author ZSP
 */
public class Test01 {
	public static void main(String[] args) {
		Test01 test = new Test01();
		test.test1();
		test.test2();
	}
	/**
	 * 修改变量无效
	 */
	public void test1(){
		int a = 100;
		int b = a;
		a=50;
		System.out.println(b);
	}
	/**
	 * 修改变量引用的对象
	 */
	public void test2() {
		Integer[] a = new Integer[]{1,1,1,1};
		Integer[] b = a;
		a[0]=0;
		System.out.println(b[0]);
	}
}
