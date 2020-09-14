package API.String;

import org.junit.Test;

public class Test02Number {
	static int a=10;
	static Integer b = 100;
	/**
	 * 基本类型转换为String
	 */
	@Test
	public void test01() {
		int a=10;
		Integer integer = 100;
		//toString
		String string1 = integer.toString();
		System.out.println("string1:"+string1);
		//valueOf()
		String string2 = String.valueOf(a);
		String string3 = String.valueOf(integer);
		System.out.println("string2:"+string2);
		System.out.println("string3:"+string3);
		//+""
		String string4=a+"";
		String string5=integer+"";
		System.out.println("string4:"+string4);
		System.out.println("string5:"+string5);
		
	}
	
	/**
	 * string转换为基本类型
	 */
	public void test02() {
		String string = "10";
		//parseInt
		Integer valueOf = Integer.valueOf(string);
		int parseInt = Integer.parseInt(string);
	}
	
	/**
	 * 基本类型>>>包装类
	 */
	public void test03() {
		//手动
		Integer valueOf = Integer.valueOf(a);
		Integer integer1 = new Integer(a);
		//自动
		Integer integer2 = a;
	}
	
	/**
	 * 包装类>>>基本类型
	 */
	public void test04() {
		//手动
		int int1 = b.intValue();
		//自动
		int int2 = b;
	}
}

