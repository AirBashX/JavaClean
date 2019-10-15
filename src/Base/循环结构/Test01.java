package Base.循环结构;

import org.junit.Test;

/**
 * 循环控制的三个关键字:break/return/continue的作用
 * @author ZSP
 */
public class Test01 {
	
	/**
	 * break:强制退出循环
	 */
	@Test
	public void test02Continue() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
	}
	
	@Test
	public void test01Break() {
		for(int i=0;i<10;i++) { 
			System.out.println(i);
			if(i==5) {
				continue;
			}
			System.out.println("----");
		}
	}
	
}

