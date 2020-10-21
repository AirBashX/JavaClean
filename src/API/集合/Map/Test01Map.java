package API.集合.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01Map {
	static HashMap<String, String> map = new HashMap<String,String>();
	
	public static void main(String[] args) {
		map.put("A", "ZHANGSAN");
		map.put("B", "ZHANGSAN2");
		map.put("C", "ZHANGSAN3");
		get2();
	}

	/**
	 * keyset和value方法使用for方法遍历;
	 */
	public static void get() {
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
	}
	
	public static void get2() {
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for(Map.Entry<String,String>entry:entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
	
}
