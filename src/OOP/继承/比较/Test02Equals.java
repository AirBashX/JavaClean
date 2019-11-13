package OOP.继承.比较;

import java.util.Objects;

/**
 * 测试eclipse四个选项生成的equals方法
 * @author ZSP
 */
public class Test02Equals {
	/*
	 * public static void main(String[] args) { Object object = new Object();
	 * object.equals("1"); }
	 */
	private String Name;
	private String age;
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Test02Equals other = (Test02Equals) obj;
//		if (Name == null) {
//			if (other.Name != null)
//				return false;
//		} else if (!Name.equals(other.Name))
//			return false;
//		if (age == null) {
//			if (other.age != null)
//				return false;
//		} else if (!age.equals(other.age))
//			return false;
//		return true;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Test02Equals)) {
//			return false;
//		}
//		Test02Equals other = (Test02Equals) obj;
//		return Objects.equals(Name, other.Name) && Objects.equals(age, other.age);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Test02Equals)) {
//			return false;
//		}
//		Test02Equals other = (Test02Equals) obj;
//		if (Name == null) {
//			if (other.Name != null) {
//				return false;
//			}
//		} else if (!Name.equals(other.Name)) {
//			return false;
//		}
//		if (age == null) {
//			if (other.age != null) {
//				return false;
//			}
//		} else if (!age.equals(other.age)) {
//			return false;
//		}
//		return true;
//	}
}
