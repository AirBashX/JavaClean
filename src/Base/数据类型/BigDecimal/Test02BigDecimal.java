package Base.数据类型.BigDecimal;

import java.math.RoundingMode;

import Base.数据类型.utility.Arith;

public class Test02BigDecimal {

	public static void main(String[] args) {
		//加
		double add = Arith.add(0.01, 0.09);
		System.out.println(add);
		System.out.println(0.01+0.09);
		
		//减
		double subtract = Arith.subtract(0.01, 0.09);
		System.out.println(subtract);
		
		//乘
		double multiply = Arith.multiply(0.01, 0.09);
		System.out.println(multiply);
		
		//除
		RoundingMode rm = RoundingMode.UP;
		double devide = Arith.devide(0.123456789,1,3,rm);
		double devide2 = Arith.devide(-0.123456789,1,3,rm);
		double devide3 = Arith.devide(0.123456789,1,6,rm);
		double devide4 = Arith.devide(-0.123456789,1,6,rm);

		System.out.println(devide);
		System.out.println(devide2);
		System.out.println(devide3);
		System.out.println(devide4);
	}

}
