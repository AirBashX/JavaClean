package API.集合.Collection.entity;

public class Student implements Comparable<Student>{

	private String name;
	private Integer id;
	
	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	/**
	 * ":"的作用else或者else if;
	 */
	@Override
	public int compareTo(Student student) {
		//return student.id-id;
		return 1;
	}
}
