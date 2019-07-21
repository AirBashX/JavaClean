package API.数组;

/**
 * 声明并初始化数组
 * @author ZSP
 *
 */
public class Tes01Ftirst {
	
	/**
	 * 声明数组对象
	 */
	static Integer[] x;
	static Integer y[];
	
	public static void main(String[] args) {
		
		twice();
	}
	
	/**
	 * 数组的初始化
	 */
	public static void twice() {
		//1.方法1:动态初始化:默认值
		x = new Integer[3];
		for(Integer a: x) {
			System.out.print(a+",");
		}
		System.out.println(x);
		System.out.println();
		//2.方法2
		x = new Integer[] {1,5,9};
		for(Integer a:x) {
			System.out.print(a+",");
		}
		System.out.println();
		//3.方法3:必须声明时初始化
		Integer[] x= {1,2,3};
		for(Integer a:x) {
			System.out.print(a+",");
		}
		System.out.println();
	}
	
}
