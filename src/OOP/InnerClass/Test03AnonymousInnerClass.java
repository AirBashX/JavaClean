package OOP.InnerClass;

import OOP.InnerClass.entity.InterfaceFather;
import OOP.InnerClass.entity.ClassFather;

/**
 * 匿名内部类:简写新建子类或派生类
 * @author ZSP
 */
public class Test03AnonymousInnerClass {
	/**
	 * 1.创建接口相关的匿名内部类
	 * @param father01
	 */
	public void test01() {
		new InterfaceFather() {
			
			@Override
			public Integer getA() {
				return null;
			}
			
		};
		
	}
	
	/**
	 * 2.创建父类相关的匿名内部类
	 */
	public void test02() {
		//java1.8后自动在成员变量前加上final,再次定义则编译错误
		new ClassFather("耶稣") {
			public String getA() {
				return "10";
			}
		};
		
	}
	
}
