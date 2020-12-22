package OOP.InnerClass;

import OOP.InnerClass.Test01NotStaticInnerClass.InnerClass;
import OOP.InnerClass.Test02StaticInnerClass.Innerclass;

/**
 * 访问内部类
 * @author ZSP
 */
public class Test03GetInnerClass {
	
	public static void main(String[] args) {
		
		//1.访问非静态内部类
		InnerClass innerClass = new Test01NotStaticInnerClass().new InnerClass();
		
		//2.访问静态内部类
		Innerclass innerclass2 = new Test02StaticInnerClass.Innerclass();
	}

}
