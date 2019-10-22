package OOP.静态;

public class Test02Static {
	public static void main(String[] args) {
			Loo abc = new Loo();
			abc.show();
			Loo abc2 = new Loo();
			abc2.show();
			Loo abc3 = new Loo();
			abc2.show();
	}
}
class Loo{ 
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show() {
		System.out.println(a+","+b);
	}
}