package OOP;

/**
 * 局部变量和成员变量的区别
 * @author ZSP
 *
 */
public class test01finall {
	/**
	 * 成员变量:声明时必须赋值
	 */
	public static final String ABC="ABC";
	 //public static final String ABC2; ABC2="ABC2";
	/**
	 * 局部变量:声明时可以不赋值
	 */
	public void fangfa() {
		String abc="10";
		final String EFG;
		EFG="EFG";
	}
}
