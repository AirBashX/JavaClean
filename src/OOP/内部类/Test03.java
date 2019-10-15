package OOP.内部类;

import OOP.内部类.entity.Book;
import OOP.内部类.entity.Father;

/**
 * 匿名内部类:
 * @author ZSP
 */
public class Test03 {
	/**
	 * 1.接口相关匿名内部类
	 * @param book
	 */
	public void book(Book book) {
		System.out.println("书的名字是:"+book.getName()+",价格是"+book.getPrice());
	}
	
	/**
	 * 2.继承匿名内部类
	 */
	public void father() {
		//java1.8后自动在成员变量前加上final,再次定义则编译错误
		String book="数学";
		//book="12";
		Father father = new Father("耶稣") {
			public Integer getAge() {
				return 10;
			}
			public String getBook() {
				return book;
			}
		};
		System.out.println("姓名:"+father.getName()+",年龄:"+father.getAge()+",书籍:"+father.getBook());
	}
	
	public static void main(String[] args) {
		Test03 test = new Test03();
		
		//1.引用是匿名内部类
		test.book(new Book() {

			@Override
			public Integer getPrice() {
				return 10;
			}
			@Override
			public String getName() {
				return "数学";
			}
		});
		
		//2.对象时匿名内部类
		test.father();
	}

}
