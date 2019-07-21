package Other.反射.untity;

public class Father {
	private String name;
	private Integer id;
	private String sex;
	
	public Father() {
		super();
	}
	public Father(String name, Integer id, String sex) {
		super();
		this.name = name;
		this.id = id;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Father [name=" + name + ", id=" + id + ", sex=" + sex + "]";
	}
	
}
