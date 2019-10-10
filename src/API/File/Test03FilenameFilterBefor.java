package API.File;

import java.io.File;
import java.io.IOException;

public class Test03FilenameFilterBefor {

	public static void main(String[] args) throws IOException {
		//新建目录
		File file = new File("D:\\FileName");
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
		
		//新建过滤2:方法1
		File file1 = new File("D:\\FileName\\1.f");
		boolean create1 = file1.createNewFile();
		System.out.println(create1);
		
		File file10 = new File("D:\\FileName\\10.f");
		boolean create10 = file10.createNewFile();
		System.out.println(create10);
		
		//新建非过滤文件:方法2
		File file2 = new File(file,"2");
		boolean create2 = file2.createNewFile();
		System.out.println(create2);
		
		//新建目录:
		File mkdir2 = new File(file,"mkdir");
		boolean createMkdir = mkdir2.mkdir();
		System.out.println(createMkdir);
		
		//新建过滤文件3:
		File file3 = new File(mkdir2,"3.f");
		boolean create3 = file3.createNewFile();
		System.out.println(create3);
		
		File file30 = new File(mkdir2,"30.f");
		boolean create30 = file30.createNewFile();
		System.out.println(create30);
		
		//新建非过滤文件4:
		File file4 = new File(mkdir2,"4");
		boolean create4 = file4.createNewFile();
		System.out.println(create4);
	}

}
