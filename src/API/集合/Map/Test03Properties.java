package API.集合.Map;

import java.util.Properties;

import org.junit.Test;

public class Test03Properties {
	
	
	@Test
	public void test01() {
		//继承自HashTable
		Properties properties = new Properties();
		String driver = properties.getProperty("driver");
		System.out.println(driver);
	}
}
