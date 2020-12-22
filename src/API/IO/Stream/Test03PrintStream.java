package API.IO.Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.junit.Test;

/**
 *处理流之打印流:用于处理包装输出流 
 * @author ZSP
 *
 */
public class Test03PrintStream {
	
	/**
	 * 用处理流:字节打印流,处理字节输出流
	 * @throws FileNotFoundException
	 */
	@Test
	public void test01() throws FileNotFoundException {
		File file = new File("D:\\a.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		ps.print("print测试1");
		ps.print(97);
		ps.write(98);
	}
	
	/**
	 * 用处理流:字符打印流,处理file
	 * @throws FileNotFoundException
	 */
	@Test
	public void test02() throws FileNotFoundException {
		File file = new File("D:\\a.txt");
		PrintStream ps = new PrintStream(file);
		ps.print("print测试2");
		ps.print(97);
		ps.write(98);
	}
	
	/**
	 * 用处理流:字符处理流,处理字符输出流
	 * @throws IOException 
	 */
	@Test
	public void test03() throws IOException {
		File file = new File("D:\\a.txt");
		FileWriter fos = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fos);
		pw.println("print测试3");
		pw.println(97);
		pw.write(98);
		pw.write("99");
		pw.close();
	}
	
	/**
	 * 用处理流:字符处理流,处理字符file
	 * @throws IOException 
	 */
	@Test
	public void test04() throws IOException {
		File file = new File("D:\\a.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("print测试4");
		pw.println(97);
		pw.write(98);
		pw.write("99");
		pw.close();
	}
	
	/**
	 * 可以交叉传入
	 * @throws FileNotFoundException
	 */
	@Test
	public void test05() throws FileNotFoundException {
		File file = new File("D:\\a.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintWriter pw = new PrintWriter(fos);
		pw.print("123456");
	}
	
}
