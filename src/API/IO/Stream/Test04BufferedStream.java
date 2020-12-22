package API.IO.Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * 缓冲流:加快字节流和字符流的写入和读取速度
 * @author ZSP
 *
 */
public class Test04BufferedStream {
	File file1 = new File("D://a.txt");
	File file2 = new File("D://b.txt");
	
	/**
	 * 字节缓冲输入流
	 * @throws IOException
	 */
	@Test
	public void test01() throws IOException {
		FileInputStream fis = new FileInputStream(file1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] bbuf= new byte[1024];
		int hasRead =-1;
		while((hasRead = bis.read(bbuf))!=-1) {
			System.out.println(new String(bbuf,0,hasRead));
		}
		//byte[] bytes = bis.readAllBytes();
		//System.out.println(new String(bytes));
	}
	
	/**
	 * 字节缓冲输出流
	 * @throws IOException
	 */
	@Test
	public void test02() throws IOException {
		FileInputStream fis = new FileInputStream(file1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] bbuf= new byte[1024];
		int hasRead =-1;
		while((hasRead = bis.read(bbuf))!=-1) {
			bos.write(bbuf,0,hasRead);
		}
//		byte[] bytes = bis.readAllBytes();
//		bos.write(bytes);
		bos.close();
	}
	
	/**
	 * 字符缓冲输入流
	 * @throws IOException
	 */
	@Test
	public void test03() throws IOException {
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
		String hasRead=null;
		while((hasRead = br.readLine())!=null) {
			System.out.println(hasRead);
		}
	}
	/**
	 * 字符缓冲输出流
	 * @throws IOException
	 */
	@Test
	public void test04() throws IOException {
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(fw);
		String hasRead=null;
		while((hasRead = br.readLine())!=null) {
			bw.write(hasRead+"\n");
		}
		bw.close();
	}
	
}
