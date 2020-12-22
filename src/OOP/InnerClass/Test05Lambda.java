package OOP.InnerClass;

import OOP.InnerClass.entity.ClassFather;
import OOP.InnerClass.entity.InterfaceFather;

/**
 * Lambda表达式:只对函数型接口有效,相当于简写了只有一个接口的匿名内部类
 * @author ZSP
 *
 */
public class Test05Lambda {

	public Test05Lambda() {
		
		//只有一个方法的函数型接口
		InterfaceFather a=()->{
			System.out.println(123);
			return null;
		};
		
		/*
		 * ClassFather b=()->{ System.out.println(123); };
		 */
	}

}
