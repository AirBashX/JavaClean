package Other.反射.IOC;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
/**
 * 模仿SpringIoc功能
 * @author ZSP
 *
 */
public class MySpring {
	/**
	 * 根据className新建对象+依赖注入
	 * @param className 输入的类名
	 * @return 新建的类名对象
	 */
	public Object getBean(String className) {
		Object object = null;
		Scanner input = new Scanner(System.in);
		System.out.println("请给"+className+"类的对象赋值");
		try {
			//getBean
			Class<?> clazz = Class.forName(className);
			object = clazz.newInstance();
			//依赖注入:通过成员变量生成set方法
			Field[] fields = clazz.getDeclaredFields();
			for(Field field :fields) {
				//拼接成员变量变成set方法
				String fieldName = field.getName();
				String upperCase = fieldName.substring(0, 1).toUpperCase();
				String substring = fieldName.substring(1);
				StringBuilder setMethodName = new StringBuilder("set");
				setMethodName.append(upperCase);
				setMethodName.append(substring);
				//通过拼接到的set方法名获取set方法对象
				Class<?> Fieldtype = field.getType();
				Method method = clazz.getDeclaredMethod(setMethodName.toString(), Fieldtype);
				method.setAccessible(true);
				System.out.println("请给"+setMethodName+"赋值");
				String value = input.nextLine();
				//通过成员变量类型或者class对象,然后新建Strign为参数 的对象
				Constructor<?> fieldConstructor = Fieldtype.getDeclaredConstructor(String.class);
				Object value2 = fieldConstructor.newInstance(value);
				method.invoke(object, value2);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
		return object;
	}
}
