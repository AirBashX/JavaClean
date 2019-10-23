package OOP.继承.造型;

import org.junit.Test;

import OOP.继承.造型.untity.Anaimal;
import OOP.继承.造型.untity.Cat;

/**
 * 造型
 * @author ZSP
 */
public class Test02FS {
	
	/**
	 * 向上造型:
	 * 1.子类重写父类的方法,调用的是子类的重写后的方法,不能使用子类的方法
	 * 2.向上造型考虑的是兼容性问题;
	 */
	@Test
	public void test01() {
		Anaimal anaimal = new Cat();
		anaimal.eatFood();
		//anaimal.eatFish();报错
	}
	
	/**
	 * 向下造型:
	 * 
	 */
	@Test
	public void test02() {
		Anaimal anaimal = new Cat();
		Cat cat = (Cat)anaimal;
		//Dog dog = (Dog)anaimal;报错
	}
}
