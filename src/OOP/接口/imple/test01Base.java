package OOP.接口.imple;

import OOP.接口.inter.Itest01Base;

public class test01Base implements Itest01Base{

	@Override
	public void method01() {
		System.out.println("method01");
	}

	@Override
	public void method02() {
		System.out.println("method02");
	}
	
	//默认方法可以被重写
	//public void method03() {
		
	//}
	//静态方法可以被实现
	//public static void method04() {
		
	//}
}
