package API.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流相关操作:用于写入和读取二进制文件
 * @author ZSP
 */
public class Test03ByteStream {
	public static void main(String[] args) throws IOException {
		test00();
		//test01();
		//test02();
		//test03();
	}
	
	/**
	 * 一个一个字节进行读取
	 * @throws IOException
	 */
	public static void test00() throws IOException {
		File file = new File("D:\\a.txt");
		FileInputStream fis = new FileInputStream(file);
		int hasRead = -1;
		while ((hasRead = fis.read()) !=-1) {
			System.out.println((char)hasRead);
		}
		fis.close();
	}
	/**
	 * 读取一个字节数组文件
	 * @throws IOException
	 */
	public static void test01() throws IOException {
		File file = new File("D:\\a.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		while ((hasRead = fis.read(bbuf)) > 0) {
			System.out.println(new String(bbuf));
		}
		fis.close();
	}
	
	/**
	 * 读取后写入文件=复制文件
	 * @throws IOException
	 */
	public static void test02() throws IOException{
		File file1 = new File("D:\\a.txt");
		File file2 = new File("D:\\b.txt");
		//读取
		FileInputStream fis = new FileInputStream(file1);
		//写入
		FileOutputStream fos = new FileOutputStream(file2);
		byte[] bbuf = new byte[32];
		int hasRead = 0;
		while((hasRead=fis.read(bbuf))>0) {
			fos.write(bbuf);
		}
		//fos.close();
	}
	/**
	 * 追加读取后写入文件=追加复制文件
	 * @throws IOException 
	 */
	public static void test03() throws IOException {
		File file1 = new File("D:\\a.txt");
		File file2 = new File("D:\\b.txt");
		//读取
		FileInputStream fis = new FileInputStream(file1);
		//写入
		FileOutputStream fos = new FileOutputStream(file2,true);
		byte[] bbuf = new byte[32];
		int hasRead = 0;
		while((hasRead=fis.read(bbuf))>0) {
			fos.write(bbuf);
		}
		fos.close();
	}
}
