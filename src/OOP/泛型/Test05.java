package OOP.泛型;

/**
 * 实现接口泛型
 * @author ZSP
 *
 */
public class Test05 {

	//1.不指定默认Object
	public class Test1 implements Test04Interface{

		@Override
		public Object ABC() {
			return null;
		}
		
	}
	
	//2.指定类型
	public class Test2 implements Test04Interface<String>{

		@Override
		public String ABC() {
			return null;
		}
		
	}
	
	//3.依然使用T
	public class Test3<T> implements Test04Interface<T>{

		@Override
		public T ABC() {
			return null;
		}
		
	}
}
