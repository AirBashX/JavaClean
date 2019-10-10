package API.File;

import java.io.File;

public class Test05FilenameFilterAfter {

	public static void main(String[] args) {
		File file = new File("D:\\FileName");
		delete(file);
	}
	
	//删除文件
	public static void delete(File file) {
		if(!file.exists()) {
			return;
		}
		if(file.isFile()) {
			file.delete();
			return;
		}
		Test04FilenameFilter filter = new Test04FilenameFilter();
		File[] list = file.listFiles(filter);
		for(File file2 : list) {
			file2.delete();
		}
		file.delete();
		System.out.println("删除完毕");
	}
}
