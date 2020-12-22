package API.IO.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 字节流相关操作:用于写入和读取二进制文件
 * @author ZSP
 */
public class Test01ByteStream {
	
	/**
	 * 写入一个字节的内容
	 * @throws IOException
	 */
	@Test
	public void test01() throws IOException {
		File file = new File("D:\\a.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(97);
	}
	
	/**
	 * 写入一个数组[字节]的内容
	 * @throws IOException
	 */
	@Test
	public void test02() throws IOException {
		File file = new File("D:\\a.txt");
		FileOutputStream fos = new FileOutputStream(file);
		byte[] buff = new byte[3];
		buff[0]=97;
		buff[1]=32;
		buff[2]=98;
		fos.write(buff);
	}
	
	/**
	 * 一个字节一个字节的读取
	 * @throws IOException
	 */
	@Test
	public void test03() throws IOException {
		File file = new File("D:\\a.txt");
		FileInputStream fis = new FileInputStream(file);
		int hasRead = -1;
		while ((hasRead = fis.read()) !=-1) {
			System.out.println((char)hasRead);
		}
		//fis.close();
	}
	
	/**
	 * 读取一个数组[字节]的内容
	 * @throws IOException
	 */
	@Test
	public void test04() throws IOException {
		File file = new File("D:\\a.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] bbuf = new byte[4096];
		int hasRead = -1;
		while ((hasRead = fis.read(bbuf)) !=-1) {
			System.out.println(new String(bbuf));
		}
		//fis.close();
	}
	
	/**
	 * 读取后写入文件=复制文件
	 * @throws IOException
	 */
	@Test
	public void test05() throws IOException{
		File file1 = new File("D:\\a.txt");
		File file2 = new File("D:\\b.txt");
		//读取
		FileInputStream fis = new FileInputStream(file1);
		//写入
		FileOutputStream fos = new FileOutputStream(file2);
		byte[] bbuf = new byte[1024];
		int hasRead = -1;
		while((hasRead=fis.read(bbuf))!=-1) {
			fos.write(bbuf,0,hasRead);
		}
		//fos.close();
	    //fis.close();
	}
	/**
	 * 追加读取后写入文件=追加复制文件
	 * @throws IOException 
	 */
	@Test
	public void test06() throws IOException {
		File file1 = new File("D:\\a.txt");
		File file2 = new File("D:\\b.txt");
		//读取
		FileInputStream fis = new FileInputStream(file1);
		//写入
		FileOutputStream fos = new FileOutputStream(file2,true);
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		while((hasRead=fis.read(bbuf))>0) {
			fos.write(bbuf,0,hasRead);
		}
		fos.close();
	}
}
