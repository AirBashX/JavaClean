package API.IO;

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
public class Test05PrintStream {
	
	/**
	 * 用处理流处理字节输出流
	 * @throws FileNotFoundException
	 */
	@Test
	public void test01() throws FileNotFoundException {
		File file = new File("D:\\a.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(file);
		ps.print("print测试2");
	}
	
	/**
	 * 用处理流处理字符输出流
	 * @throws IOException 
	 */
	@Test
	public void test02() throws IOException {
		File file = new File("D:\\a.txt");
		FileWriter fos = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fos);
		pw.print("print测试x");
		pw.close();
	}
}
