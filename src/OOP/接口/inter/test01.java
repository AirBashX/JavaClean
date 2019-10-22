package OOP.接口.inter;

/**
 * 接口类:abstract可以省略,编译器会补全
 * @author ZSP
 */
public abstract interface test01 {
	
	/**
	 * 常量:接口中没有成员变量,常量的修饰符可以省略
	 */
	String A= "10";
	//public static final String A="10";
	
	
	/**
	 * 抽象方法全写:接口内的方法都可以省略:public abstract,编辑器 会在补全;
	 */
	public abstract void method01();
	
	/**
	 * 抽象方法简写
	 */
	void method02();
	
	/**
	 *默认方法:相当于抽象类中的普通方法 :有方法体
	 */
	default void method03() {
		System.out.println("默认方法:该功能已被实现");
		System.out.println("默认方法引用私有方法");
		method05();
		System.out.println("---------------");
	}
	
	/**
	 * 静态方法
	 */
	static void method04() {
		System.out.println("静态方法");
		System.out.println("静态方法引用静态私有方法");
		method06();
		System.out.println("---------------");
	}
	
	/**
	 * 私有方法:默认方法的私有方法
	 */
	private void method05() {
		System.out.println("私有方法");
	}
	
	/**
	 * 静态私有方法:静态方法的私有方法
	 */
	private static void method06() {
		System.out.println("静态私有方法");
	}
	 
}
