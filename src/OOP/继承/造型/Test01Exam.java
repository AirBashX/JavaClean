package OOP.继承.造型;

/***
 * 向上造型类型题
 * @author ZSP
 *
 */
public class Test01Exam {

	//A
	//D	A---D
	//A	A---A


	//B==>C+D
	//D	A---D
	//A	B---A

	//B	B---B


	//A===>B===C+D
	
	
	public static void main(String args[]) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println(a1.show(b));//AA
		System.out.println(a1.show(c));//AA
		System.out.println(a1.show(d));//AD
		System.out.println(a2.show(b));//BA
		System.out.println(a2.show(c));//BA
		System.out.println(a2.show(d));//AD
		System.out.println(b.show(b));//BB
		System.out.println(b.show(c));//BB
		System.out.println(b.show(d));//AD
	}
	
}

class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}
}

class B extends A {
	public String show(B obj) {
		return ("B and B");
	}

	public String show(A obj) {
		return ("B and A");
	}
}

class C extends B {
}

class D extends B {
}
