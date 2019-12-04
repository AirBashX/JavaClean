package Other.反射;
/**
 * 获取class对象的三种方法
 * @author ZSP
 *
 */
public class Test01GetClass {

	public static void main(String[] args) {
		//1.Class:
			try {
				Class forName = Class.forName("java.lang.String");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		//2.本身属性:推荐
		Class clazz2 = String.class;
		System.out.println(clazz2);
		
		//3.Object:
		String string = "x";
		Class clazz3 = string.getClass();
		System.out.println(clazz3);

	}
}