package OOP.泛型;

/**
 * 泛型类
 * @author ZSP
 *	1.类名后的T的类型决定类内方法和变量的T类型;
 *	2.构建方法不能使用泛型,但是引用时可以使用;
 */
public class Test02Class<T> {

	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public Test02Class(T a) {
		super();
		this.a = a;
	}

	public Test02Class() {
		super();
	}
	
	public static void main(String[] args) {
		Test02Class<Object> A = new Test02Class<>("123");
		Test02Class<String> B = new Test02Class<>("123");
		Test02Class<Integer> C = new Test02Class<>(123);
	}
	
}
