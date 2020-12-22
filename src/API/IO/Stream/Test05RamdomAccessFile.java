package API.IO.Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/**
 * 读写操作
 * 
 * @author ZSP
 *
 */
public class Test05RamdomAccessFile {

	File filea = new File("D:\\a.txt");
	File fileb = new File("D:\\b.txt");

	/**
	 * String写入
	 * 
	 * @param file
	 * @throws IOException
	 */
	@Test
	public void test01() throws IOException {
		String str = "RAF测试1";
		RandomAccessFile raf = new RandomAccessFile(fileb, "rw");
		byte[] bytes = str.getBytes("utf-8");
		raf.write(bytes);
		System.out.println("写入完毕");
	}

	/**
	 * String读取
	 * 
	 * @param file
	 * @throws IOException 
	 */
	@Test
	public void test02() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(filea, "rw");
//		byte[] bytes = new byte[(int) raf.length()];
//		raf.read(bytes);
//		String string = new String(bytes, "utf-8");
//		System.out.println(string);
		
		byte[] bytes =new byte[1024];
		int code = -1;
		while((code =raf.read(bytes))!=-1) {
			System.out.println(new String(bytes,0,code));
		}
	}

	/**
	 * 各类型的写入/读取
	 * @throws IOException 
	 */
	@Test
	public void writeOther() throws IOException {
			RandomAccessFile raf = new RandomAccessFile(fileb, "rw");
			
			System.out.println("开始写入");
			// ascll/char写入(不乱码)
//			 raf.write(97);
//			 raf.write('a');

			// int写入,double等省略
			// raf.writeInt(5555);
			// raf.writeInt(57845);

			// utf8写入
			//raf.writeUTF("123");
			//raf.writeUTF("你好吗");
			System.out.println("写入完毕");

			System.out.println("开始读取");
			raf.seek(0);

			// ascll/char读取
			// int code = -1;
			// while((code =raf.read())!=-1) {
			// System.out.println((char)code);
			// }

			// int读取
//			 while(raf.getFilePointer()!=raf.length()) {
//			 System.out.println(raf.readInt());
//			 }

			// utf-8读取
			while (raf.getFilePointer() != raf.length()) {
				System.out.println(raf.readUTF());
			}
			System.out.println("读取完毕");
}

	/**
	 * 字符集排序错误:java.io.EOFException
	 */
	public static void error() {
		try {
			// 第一次写入两个String类型
			RandomAccessFile raf1 = new RandomAccessFile("D:\\error.txt", "rw");
			raf1.writeUTF("你好");

			// 第二次写入1个int类型
			RandomAccessFile raf2 = new RandomAccessFile("D:\\error.txt", "rw");
			raf2.writeUTF("1");

			while (raf2.getFilePointer() != raf2.length()) {
				System.out.println(raf2.readUTF());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copy(File file) {
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;
		try {
			raf1 = new RandomAccessFile(file, "rw");
			byte[] bytes = new byte[1024];
			raf1.read(bytes);
			raf2 = new RandomAccessFile("D:\\B.txt", "rw");
			raf2.write(bytes);

			System.out.println("复制成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				raf1.close();
				raf2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
