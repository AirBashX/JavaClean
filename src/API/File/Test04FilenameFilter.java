package API.File;

import java.io.File;
import java.io.FilenameFilter;

public class Test04FilenameFilter implements FilenameFilter{

	/**
	 * dir:父目录
	 * name:文件名
	 */
	@Override
	public boolean accept(File dir, String name) {
		boolean endsWith = name.endsWith(".f");
		
		//name只有new File才能使用File的方法
		//boolean directory = new File(name).isDirectory();
		return endsWith;
	}
}
