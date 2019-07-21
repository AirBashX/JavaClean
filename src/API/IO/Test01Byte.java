package API.IO;

public class Test01Byte {
	public static void main(String[] args) {
		byte[] detea = new byte[1024*10];
		String x = "123456789";
		byte[] bytes = x.getBytes();
		for(byte byte1 : bytes) {
			System.out.println(byte1);
		}
	}
}
