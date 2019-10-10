package Other.反射.untity;

public class Person {
	public String name;
	public int age;
	private String sex;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	public void toString2(String abc) {
		System.out.println(toString()+abc);
	}
}
