package API.File;

import java.io.File;

/***
 * 删除非空目录的操作
 * 
 * @author ZSP
 *
 */
public class Test02Delete {

	public static void main(String[] args) {
		File file = new File("D:\\A");
		//delete1(file);
		delete2(file);
	}

	public static void delete1(File file) {
		if (file.exists()) {
			if (file.isFile()) {
				file.delete();
				System.out.println("文件已删除");
			} else {
				File[] list = file.listFiles();
				for (File file2 : list) {
					file2.delete();
				}
				file.delete();
				System.out.println("删除完毕");
			}
		}else {
			System.out.println("要删除的文件或目录不存在");
		}
	}

	public static void delete2(File file) {
		if (!file.exists()) {
			return;
		} else if (file.isFile()) {
			file.delete();
			return;
		} else {
			File[] files = file.listFiles();
			for (File file2 : files) {
				delete2(file2);
			}
			file.delete();
		}
		System.out.println("删除完毕");
	}
}
