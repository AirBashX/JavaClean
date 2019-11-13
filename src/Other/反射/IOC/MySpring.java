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
			//1.getBean
			Class<?> clazz = Class.forName(className);
			//Class<?> clazz = className.getClass();			//1.获取类对象
			//2.依赖注入:通过成员变量生成set方法
			Field[] fields = clazz.getDeclaredFields();			//2.获取私有成员变量
			for(Field field :fields) {
				//拼接成员变量变成set方法
				String fieldName = field.getName();				//3.获取成员变量的名字;
				Class<?> Fieldtype = field.getType();			//4.获取成员变量的类型;
				String upperCase = fieldName.substring(0, 1).toUpperCase();
				String substring = fieldName.substring(1);
				StringBuilder setMethodName = new StringBuilder("set");//5.通过变量名得到Set方法名
				setMethodName.append(upperCase);
				setMethodName.append(substring);
				//通过拼接到的set方法名获取set方法对象
				Method method = clazz.getDeclaredMethod(setMethodName.toString(), Fieldtype);//6.通过set方法名和参数获得set方法对象
				method.setAccessible(true);										//7.设置方法为非私有方法
				//获取需要通过set方法赋值
				System.out.println("请给"+setMethodName+"赋值");
				String value = input.nextLine();
				//赋值
				Constructor<?> fieldConstructor = Fieldtype.getDeclaredConstructor(String.class);//获取成员变量是Sting的构造器对象,
				Object value2 = fieldConstructor.newInstance(value);							//为参数是String的构造器赋值并创建对象
				object = clazz.newInstance();													//新建对象
				method.invoke(object, value2);													//执行对象的set方法
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
