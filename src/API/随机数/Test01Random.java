package API.随机数;

import java.util.Random;

public class Test01Random {
	
	public static void main(String[] args) throws InterruptedException {
		Random random = new Random(100);
		Random random2 = new Random(100);
		while(true) {
			Thread.sleep(1000);
			
			//生成随机false
			//boolean boolean1 = random.nextBoolean();
			//System.out.println(boolean1);
			
			//生成随机int数组
			//byte[] buffer = new byte[10];
			//random.nextBytes(buffer);
			//System.out.println(Arrays.toString(buffer));
			
			//生成0-1之间多的随机double
			//double double1 = random.nextDouble();
			//System.out.println(double1);
			
			//生成0-1之间的随机false
			//float f = random.nextFloat();
			//System.out.println(f);
			
			//生成一个高斯函数
			//double gaussian = random.nextGaussian();
			//System.out.println(gaussian);
			
			//生成一个int数
			//int int1 = random.nextInt();
			//System.out.println(int1);
			
			//生成0-5的int数
			int int2 = random.nextInt(10);
			System.out.println(int2);
			
			//相同种子结果相同
			int int3 = random2.nextInt(10);
			System.out.println(int3);
			
		}
	}
}
