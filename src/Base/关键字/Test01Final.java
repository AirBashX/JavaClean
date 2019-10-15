package Base.关键字;

import Base.关键字.entity.Person;

/**
 * final关键字的作用:
 * 				1.修饰类时不能被继承(此处不演示)
 * 				2.修饰方法时不能被重写,但是能重载
 * @author ZSP
 */
public class Test01Final {
	
	/**
	 * final修饰变量时的两种赋值方法
	 */
	public void test01() {
		//1
		 final int a = 10;
		//2
		 final int b;
		 b=10;
		//3.错误演示赋值
		//a=10
	}
	
	/**
	 * final修饰引用:作为实例化
	 */
	public void test02() {
		final Person person = new Person("zhangsan");
		//1.对象的内容可以改变
		person.name="a";
		//2.引用不可以改变:引用不可以指向别的对象(错误的演示)
		//person = new Person("lisi");
	}
	
	/**
	 * final修饰引用:作为参数时
	 */
	public void test03(final Person person) {
		//1.对象的内容可以改变
		person.name="a";
		//2.引用不可以改变:引用不可以指向别的对象(错误的演示)
		//person = new Person("lisi");
	}
	
}
