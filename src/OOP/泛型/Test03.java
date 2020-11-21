package OOP.泛型;

/**
 * 泛型类的子类:继承的泛型
 * @author ZSP
 */
public class Test03{
	
	//1.不指定泛型:T>>>Object
	public class Test1 extends Test02Class{
		public Object getA() {
			return "";
		}
	}
	
	//2.指定泛型:T>>>变成指定的泛型
	public class Test2 extends Test02Class<String>{
		public String getA() {
			return "";
		}
	}
	
	//3.依然为T:不能重写
	public class Test3<T> extends Test02Class<T>{
		private T a;

		public T getA() {
			return a;
		}

		public void setA(T a) {
			this.a = a;
		}
		
		private T b;
		public void setB(T b) {
			this.b = b;
		}
		public T getB() {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Test3<String> test = new Test03().new Test3<String>();
		test.setA("122");
		System.out.println(test.getA());
		test.setB("456");
		System.out.println(test.getB());
	}

}
