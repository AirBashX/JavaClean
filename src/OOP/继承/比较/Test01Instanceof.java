package OOP.继承.比较;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * instanceof
 * @author ZSP
 */
public class Test01Instanceof {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		//直接或间接父类
		System.out.println(arrayList instanceof List);		//父类实现接口
		System.out.println(arrayList instanceof AbstractList);//父类 true
		System.out.println(arrayList instanceof AbstractCollection);//父类的父类
		System.out.println(arrayList instanceof Collection);
		
		//不能使用基本数据类型
		
		//null类型直接返回false
		System.out.println(null instanceof Collection);
		
		//直接关系
		List list = new ArrayList();
		System.out.println(list instanceof ArrayList);
		
		//数组:class只能是object
		String[] strs = new String[]{""};
		System.out.println(strs instanceof Object);
	}

}
