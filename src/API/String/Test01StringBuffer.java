package API.String;

public class Test01StringBuffer {
	public static void main(String[] args) {
		test1();
		Integer integer = new Integer(123);
	}
	
	/**
	 * 1.java常量池
	 *2.String两种创建方式的区别
	 *3.String中equals和==的区别
	 */
	public static void test1() {
		//第一种创建方式
		String a=new String("abc");
        String b=new String("abc");
        //第二种创建方式
        String str="abc";
        String str2="abc";
        
        System.out.println(a.equals(b));//3
        System.out.println(a==b);
        System.out.println(str==str2);//1.
        System.out.println(a==str);   
	}
}
