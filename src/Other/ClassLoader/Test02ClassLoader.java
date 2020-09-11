package Other.ClassLoader;

import java.net.URL;

import org.junit.Test;

/**
 * 三种类加载器
 * 
 * @author ZSP
 *
 */
public class Test02ClassLoader {

	public static void main(String[] args) {
		//系统类加载器
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		System.out.println("系统类加载器:"+systemLoader);
		URL url1 = systemLoader.getResource("jdbc.properties");
		System.out.println(url1);
		
		//当前类加载器
		Class<?> clazz = Test01SystemClassLoaderURL.class;
		ClassLoader clazzLoader = clazz.getClassLoader();
		System.out.println("当前类加载器:"+clazzLoader);
		URL url2 = clazzLoader.getResource("jdbc.properties");
		System.out.println(url2);
		
		//Thread类加载器
		ClassLoader threadLoader = Thread.currentThread().getContextClassLoader();
		System.out.println("Thread类加载器:"+threadLoader);
		URL url3 = threadLoader.getResource("jdbc.properties");
		System.out.println(url3);
	}

}
