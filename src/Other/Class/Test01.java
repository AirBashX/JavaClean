package Other.Class;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.junit.Test;

/**
 * 获取类加载器地址
 * @author ZSP
 *
 */
public class Test01 {
	
	@Test
	public void test01() {
		//类加载器
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		System.out.println("系统类加载器:" + systemLoader);
		try {
			Enumeration<URL> resources = systemLoader.getResources("");
			while (resources.hasMoreElements()) {
				System.out.println(resources.nextElement());

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//拓展类加载器
		ClassLoader extensionLader = systemLoader.getParent();
		System.out.println("拓展类加载器:");
		System.out.println(System.getProperty("java.ext.dirs"));

	}
}
