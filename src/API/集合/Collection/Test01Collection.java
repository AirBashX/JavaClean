package API.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * collection相关方法测试
 * 
 * @author ZSP
 *
 */
public class Test01Collection {

	public static void main(String[] args) {
		//test01();
		//test02List();
		test03Set();
	}

	/**
	 * 基础方法作用
	 */
	public static void test01() {
		// 不能传入基本数据类型,只能传入对象
		// new ArrayList<int>();
		Collection<Integer> cc = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		// 1. 添加元素
		list.add(1);
		cc.add(10);
		cc.add(1);
		set.add(1);
		// 1.2将cc集合中的数据复制list中,如果list是set集合数据可以重复,如果是list集合数据不可以重复
		// list.addAll(cc);
		// set.addAll(cc);

		// 2.删除元素
		// cc.remove(10);
		// 2.2删除两个集合中相同的元素
		// cc.removeAll(list);

		// 3.集合大小
		// int size = cc.size();
		// System.out.println(size);

		// 4.1设置为空集
		// cc.clear();
		// 4.2检测是否为空集
		// boolean empty = cc.isEmpty();
		// System.ou;t.println(empty);

		// 5.修改值
		// list.set(0, 15);

		// 6.包含
		boolean contains = list.contains(1);
		System.out.println(contains);
		// 6.2完全包含
		boolean containsAll = list.containsAll(set);
		System.out.println(containsAll);

		System.out.println("collection" + cc);
		System.out.println("list:" + list);
		System.out.println("set" + set);
	}
	
	/**
	 * 测试相关:list集合可以使用不同类型元素
	 */
	public static void test02List() {
		ArrayList arrayList = new ArrayList();
		arrayList.add(123);
		arrayList.add("1254");
		for(Object object:arrayList) {
			System.out.println(object);
		}
	}
	
	/**
	 * 测试相关:treeSet不能添加不同类型元素
	 */
	public static void test03Set() {
		TreeSet treeSet = new TreeSet();
		treeSet.add(123);
		treeSet.add("456");
		
		//报错
		//System.out.println(treeSet.first());
		
		//报错
		for(Object object:treeSet) {
			System.out.println(object);
		}
		
	}
}
