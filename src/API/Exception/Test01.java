package API.Exception;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * 异常类方法
 * @author ZSP
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			new FileInputStream("b.txt");
		} catch (IOException e) {
			//输出异常信息
			System.out.println(1+":"+e.getMessage());
			//输出异常日志:信息+错误位置+异常类名
			System.out.print(2+":");
			e.printStackTrace();
			//返回跟踪栈信息(未知)
			System.out.println(3+":"+e.getStackTrace());
		}
	}
}
