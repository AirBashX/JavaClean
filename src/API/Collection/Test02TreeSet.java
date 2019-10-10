package API.Collection;

import java.util.TreeSet;

import API.Collection.untity.School;
import API.Collection.untity.Student;

/**
 * Tree的两种排序方式
 * @author ZSP
 *
 */
public class Test02TreeSet {

	public static void main(String[] args) {
		//comparable();
		comparator();
	}

	/**
	 * 自定义排序:自定义类实现comparable类;
	 */
	public static void comparable() {
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student("a",1));
		set.add(new Student("c",3));
		set.add(new Student("b",2));
		System.out.println(set);
	}
	
	/**
	 * 自然排序:自定义类实现comparator类;
	 */
	public static void comparator() {
		TreeSet<School> set = new TreeSet<School>((School school1,School school2)->
		{
			return school1.getId()-school2.getId();
		});
		set.add(new School("a",1));
		set.add(new School("c",3));
		set.add(new School("b",2));
		System.out.println(set);
	}
}
