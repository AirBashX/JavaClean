package API.File;

import java.io.File;
import java.io.IOException;

public class Test01File {
	static File file = new File("a.txt");
	public static void main(String[] args) {
		crate();
		other();
	}
	
	/**
	 * 文件名+路径
	 * 绝对地址相同/相对地址getname只显示名字
	 */
	public static void path() {
		System.out.println("new File:"+file);
		String path = file.getPath();
		System.out.println("getPath:"+path);
		
		String name = file.getName();
		System.out.println("getName:"+name);
		
		//以下完全相同
		File file2 = file.getAbsoluteFile();
		System.out.println("getAbsoluteFile:"+file2);
		String absolutePath = file.getAbsolutePath();
		System.out.println("getAbsolutePath:"+absolutePath);
	}
	
	/**
	 * 检测是否存在
	 */
	public static void flag() {
		//是否存在目录或文件
		boolean exists = file.exists();
		System.out.println(exists);
		//是否存在文件
		boolean file2 = file.isFile();
		System.out.println(file2);
		//是否存在目录
		boolean directory = file.isDirectory();
		System.out.println(directory);
	}
	
	/**
	 * 创建文件目录
	 */
	public static void crate() {
		//创建文件
		try {
			boolean createNewFile = file.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//创建临时文件
		try {
			File create1 = File.createTempFile("123",".f", file);
			System.out.println(create1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//创建目录(左侧不会显示,但是实际创建了)
		File mkdir = new File("A");
		boolean createNewMkdir = mkdir.mkdir();
		System.out.println(createNewMkdir);
		
		//创建多级目录
		File mkdir2 = new File("D:\\A\\C");
		boolean mkdirs = mkdir2.mkdirs();
		System.out.println(mkdirs);
		
		//删除目录:只能删除非空目录
		boolean delete = mkdir.delete();
		System.out.println(delete);
		File mkdir3 = new File("D:\\B");
		boolean delete2 = mkdir3.delete();
		System.out.println(delete2);
	}
	
	/**
	 * 显示目录内的目录和文件
	 */
	public static void other() {
		//文件目录大小
		long length = file.length();
		System.out.println(length);
		
		//显示目录下的目录和文件路径
		File path = new File("D:\\A");
		String[] list = path.list();
		for(String file:list) {
			System.out.println(file);
		}
		
		//显示目录下的目录和文件名称
		File[] list2 = path.listFiles();
		for(File file:list2) {
			System.out.println(file);
		}
	}
	
}
