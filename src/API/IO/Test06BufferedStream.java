package API.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.junit.Test;

public class Test06BufferedStream {
	ClassLoader classLoader = ClassLoader.getSystemClassLoader();
	URL url = classLoader.getResource("jdbc.properties");
	String file = url.getPath();
	File file1 = new File("D://a.txt");
	File file2 = new File("D://b.txt");
	
	/**
	 * 缓冲字节输入流和缓冲字节输出流:跟字节输入输出流没有太大差别
	 * @throws IOException
	 */
	@Test
	public void test01() throws IOException {
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] bbuf= new byte[1024];
		int hasRead =-1;
		while((hasRead = bis.read(bbuf))!=-1) {
			System.out.println(new String(bbuf));
		}
	}
	
	@Test
	public void test02() throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String hasRead=null;
		while((hasRead = br.readLine())!=null) {
			System.out.println(hasRead);
		}
	}
	
}
