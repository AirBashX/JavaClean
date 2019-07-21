package API.集合.untity;

public class School{

	private String name;
	private Integer id;
	public School(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public School() {
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
		return "School [name=" + name + ", id=" + id + "]";
	}
	
}
