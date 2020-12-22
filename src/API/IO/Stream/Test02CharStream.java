package API.IO.Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * 字节流相关操作:用于写入和读取文本内容
 * @author ZSP
 *
 */
public class Test02CharStream {
	
	/**
	 * 字符输出流:写入
	 * @throws IOException 
	*/
	@Test
	public void test01() throws IOException {
		FileWriter fw = new FileWriter("D:\\b.txt");
		fw.write("写入数据01\r\n");
		System.out.println("写入完成");
		fw.close();
	}
	
	/**
	 * 字符输入流:读取
	 * @throws IOException
	 */
	@Test
	public void test02() throws IOException {
		FileReader fr = new FileReader("D:\\a.txt");
		char[] cbuf = new char[1024];
		int hasRead=0;
		while((hasRead = fr.read(cbuf))>0) {
			System.out.println(new String(cbuf));
		}
	}
	
	/**
	 * 复制文件
	 * @throws IOException
	 */
	@Test
	public void test03() throws IOException {
		FileReader fr = new FileReader("D:\\a.txt");
		FileWriter fw = new FileWriter("D:\\b.txt");
		char[] cbuf = new char[1024];
		int hasRead=0;
		while((hasRead=fr.read(cbuf))>0) {
			fw.write(cbuf,0,hasRead);
		}
		fw.close();
	}
}
