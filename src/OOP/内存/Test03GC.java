package OOP.内存;

public class Test03GC {
	/**
	 * 模拟内存溢出错误,并调用GC;
	 * @param args
	 */
	public static void main(String[] args) {
		showMem();
		String name = "hello";
        for (int i = 0; i < 10000000; i++) {
            name += name;
            System.out.println(i);
            //name=null;//将所有引用对象的变量设置为null,用来模拟对象被废弃
            //System.gc();//回收
        }
        
        System.gc();
		showMem();
	}
	/**
	 * MAX:Total动态增加最大可扩展到的大小
	 * Total:当前jvm最大内存
	 * Free:空闲的内存
	 */
	public static void showMem() {
		//首先获得运行时对象
		Runtime runtime = Runtime.getRuntime();
		System.out.println(
			"Max:"+runtime.maxMemory()/1024/1024+"M,"+
			"Total:"+runtime.totalMemory()/1024/1024+"M,"+
			"Free:"+runtime.freeMemory()/1024/1024+"M"
		);
	}
}
