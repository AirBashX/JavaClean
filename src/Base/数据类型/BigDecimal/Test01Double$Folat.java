package Base.数据类型.BigDecimal;

public class Test01Double$Folat {

	public static void main(String[] args) {
		doublex();
	}
	
	/**
	 * 默认小数点是double类型,精度不准确案例
	 */
	public static void doublex() {
		double d1 = 0.05;
		double d2 = 0.01;
		System.out.println(d1+d2);
		
		System.out.println(0.05+0.01);
	}

}
