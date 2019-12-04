package Other.Class;

import org.junit.Test;

/**
 * 类加载机制
 * 
 * @author ZSP
 *
 */
public class Test02 {

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("Other.Class.Test01");
			String name1 = clazz.getName();
			System.out.println(name1);
			ClassLoader loader = clazz.getClassLoader();
			System.out.println(loader);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test02() {
		
	}	

}
