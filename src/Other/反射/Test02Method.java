package Other.反射;

public class Test02Method {

	public static void main(String[] args) {
		//获取class对象
		Class clazz = String.class;
		//获取类的修饰符
		int modifiers = clazz.getModifiers();
		System.out.println(modifiers);
		//获取包类名
		String name = clazz.getName();
		System.out.println(name);
		//获取类名
		String simpleName = clazz.getSimpleName();
		System.out.println(simpleName);
		String packageName = clazz.getPackageName();
		System.out.println(packageName);
		String name2 = clazz.getSuperclass().getName();
		System.out.println(name2);
	}
}
