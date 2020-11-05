package API.集合.Collection;

import java.util.TreeSet;

import org.junit.Test;

import API.集合.Collection.entity.School;
import API.集合.Collection.entity.Student;

/**
 * Tree的两种排序方式
 * @author ZSP
 *
 */
public class Test02TreeSet {

	/**
	 * 自然排序:实体类实现comparable类,请转到实体类Student中查看规则;
	 */
	@Test
	public void comparable() {
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student("c",3));
		set.add(new Student("a",1));
		set.add(new Student("b",2));
		System.out.println(set);
	}
	
	/**
	 * 定制排序:实体类实现comparator类;
	 */
	@Test
	public void comparator() {
		TreeSet<School> set = new TreeSet<School>((School school1,School school2)->
		{
			//升序
			return school2.getId()-school1.getId();
			//降序
			//return school2.getId()-school1.getId();
		});
		set.add(new School("a",1));
		set.add(new School("c",3));
		set.add(new School("b",2));
		System.out.println(set);
	}
}
