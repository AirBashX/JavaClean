package Other.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

import Other.反射.entity.Person;

public class Test03GetClassContent {
	//获取类
	static Class clazz = Person.class;
	//获取变量数组
	static Field[] fields = clazz.getFields();
	public static void main(String[] args) {
		//getFilds();
		//getDeclaredFilds();
		//setFilds();
		getDeclaredMethods();
	}
	/**
	 * 获取属性(变量)信息
	 */
	public static void getFilds() {
		for(Field field:fields) {
			//获取名称;
			String name = field.getName();
			System.out.println("属性名:"+name);
			//获取类型;
			Class<?> type = field.getType();
			System.out.println("属性类型"+type);
			//获取修饰符;
			int modifiers = field.getModifiers();
			System.out.println(modifiers);
			
			System.out.println("-------------------------------");
		}
	}
	/**
	 * 获取包含私有数据
	 */
	public static void getDeclaredFilds() {
		Field[] fields = clazz.getDeclaredFields();
		for(Field field:fields) {
			//获取名称;
			String name = field.getName();
			System.out.println("属性名:"+name);
			//获取类型;
			Class<?> type = field.getType();
			System.out.println("属性类型"+type);
			//
		}
	}
	
	/**
	 * 获取方法信息
	 */
	public static void getDeclaredMethods() {
		Method[] methods = clazz.getMethods();
		for(Method method:methods) {
			//获取方法修饰符
			int modifiers = method.getModifiers();
			System.out.println("方法修饰符:"+modifiers);
			//获取方法名
			String name = method.getName();
			System.out.println("方法名称:"+name);
			//获取方法参数列表属性
			Class<?>[] parameterTypes = method.getParameterTypes();
			String string = Arrays.toString(parameterTypes);
			System.out.println("参数类型"+string);
			//获取返回值类型
			String returnType = method.getReturnType().getName();
			System.out.println("返回值类型"+returnType);
			System.out.println("---------------");
		}
		try {
			Object person = clazz.newInstance();
			Method method = clazz.getMethod("toString2",String.class);
			method.invoke(person,"123");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 添加数据
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NoSuchFieldException 
	 */
	public static void setFilds(){
		//clazz.getDeclaredConstructor().newInstance();
		try {
			Person	person = (Person)clazz.newInstance();
			Field field = clazz.getField("name");
			field.set(person, "吴彦祖");
			Object object = field.get(person);
			System.out.println(object);
			System.out.println(person);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
	}
}
