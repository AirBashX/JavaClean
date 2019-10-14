package Other.BigDecimal.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal
 * @author ZSP
 *
 */
public class Arith {

	public static double add(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);	
		return b1.add(b2).doubleValue();
	}
	
	public static double subtract(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	
	public static double multiply(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	
	public static double devide(double v1,double v2,int num,RoundingMode rm) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.divide(b2,num,rm).doubleValue();
	}
	
}
