package Base.Array;

/**
 * 测试数组下标异常:java.lang.ArrayIndexOutOfBoundsException
 * @author ZSP
 *
 */
public class Test02Exception {
	
	static int[] arr = new int[]{1,2,3};
	
	public static void main(String[] args) {
		
		first();
		second();
	}
	
	/**
	 * get超过下标的值
	 */
	public static void first() {
		System.err.println(arr[4]);
	}
	
	/**
	 * set超过下标的值
	 */
	public static void second() {
		arr[6] = 1;
	}
}
