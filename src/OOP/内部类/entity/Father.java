package OOP.内部类.entity;

import java.util.Objects;

public class Father {
	
	
	public Father() {
		super();
	}
	public Father(String name) {
		super();
		Name = name;
	}

	public Father(String name, Integer age, String book) {
		super();
		Name = name;
		this.age = age;
		Book = book;
	}

	private String Name;
	private Integer age;
	private String Book;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBook() {
		return Book;
	}
	public void setBook(String book) {
		Book = book;
	}
}
