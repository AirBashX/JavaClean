package Other.反射;

import Other.反射.IOC.MySpring;
import Other.反射.entity.Father;

public class Test04SpringIOC {

	public static void main(String[] args) {
		MySpring spring = new MySpring();
		Father father = (Father)spring.getBean("Other.反射.untity.Father");
		System.out.println(father);
	}
}
