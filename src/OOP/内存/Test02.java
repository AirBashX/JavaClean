package OOP.内存;

import OOP.内存.entity.Father;
import OOP.内存.entity.Father2;

/**
 * 模拟方法在栈堆中的关系
 * 
 * @author ZSP
 *
 */
public class Test02 {
	private static Double aprice = 12.5;
	private static Father father = new Father();

	public static void main(String[] args) {
		test1(aprice);
		System.out.println(aprice);

		/*
		 * test2(); System.out.println(father.age);
		 */

		Father2 father2 = new Father2(20);
		test3(father2);
		System.out.println(father2.age);

	}

	/**
	 * 方法在栈帧中用完就消失,所以方法内的aprice也会消失
	 * 
	 * @param aname
	 * @param price
	 */
	public static void test1(Double aprice) {
		aprice = aprice + 10;
	}

	/**
	 * age是包装类,存储在常量池,常量池存储在方法区,因此下列无效,上面father会出现空指针错误
	 */
	public static void test2() {
		Integer age = father.getAge();
		age += 20;
		father.setAge(age);
	}

	/**
	 * father2.age属于实例变量,实例变量存储在堆中,因此下列有效
	 * 
	 * @param father2
	 */
	public static void test3(Father2 father2) {
		father2.age += 20;
	}
}
