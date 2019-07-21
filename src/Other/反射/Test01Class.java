package Other.反射;
/**
 * 获取class对象的三种方法
 * @author ZSP
 *
 */
public class Test01Class {

	public static void main(String[] args) {
		//1.
			try {
				Class forName = Class.forName("java.lang.String");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		//2.
		Class clazz2 = String.class;
		System.out.println(clazz2);
		//3.
		String string = "x";
		Class clazz3 = string.getClass();
		System.out.println(clazz3);

	}
}