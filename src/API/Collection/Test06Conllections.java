package API.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import API.Collection.untity.School;

public class Test06Conllections {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(-1);
		list.add(-5);
		sort(list);
		
		//默认排序
		//System.out.println(list);
	}
	
	/**
	 * 排序
	 */
	public static void sort(ArrayList<Integer> list) {
		//自然排序
		//Collections.sort(list);
		
		//自然排序:自定义
		//ArrayList<School> list2 = new ArrayList<School>();
		//list2.add(new School("a",1));
		//list2.add(new School("c",3));
		//list2.add(new School("b",2));
		//list2.add(new School("d",4));
		//Collections.sort(list2, ((School school1,School school2)->
		//{
		//	return school1.getId()-school2.getId();
		//}));
		//System.out.println(list2);
		
		//乱序
		//Collections.shuffle(list);
		
		//反序
		Collections.reverse(list);
		System.out.println(list);
	}
}
