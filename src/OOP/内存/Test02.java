package OOP.内存;

import OOP.内存.entity.Father;

/**
 * 模拟方法在栈堆中的关系
 * @author ZSP
 *
 */
public class Test02 {
	private static Double aprice = 12.5;
	private static Integer age = 20;
	public static void main(String[] args) {
		//test1("数学", aprice);
		//System.out.println(aprice);
		Father father = new Father(age);
		test2("代维",father);
		System.out.println(father.age);
	}
	/**
	 * 方法在方法帧中用完就消失,所以方法内的aprice也会消失
	 * @param aname
	 * @param price
	 */
	public static void test1(String aname,Double aprice) {
		aprice = aprice+10;
	}
	
	public static void test2(String name,Father father) {
		father.age+=20;
	}
}
