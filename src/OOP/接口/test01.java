package OOP.接口;

import org.junit.Test;

import OOP.接口.imple.test01Base;
import OOP.接口.inter.Itest01Base;

public class test01 {
	
	@Test
	public void test01() {
		test01Base test = new test01Base();
		test.method01();
		test.method02();
		test.method03();
		
		//只能接口名调用
		Itest01Base.method04();
	}
}
