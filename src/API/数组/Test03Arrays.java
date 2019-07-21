package API.数组;

import java.util.Arrays;

public class Test03Arrays {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//用二分法输出元素1在数组arr中的下标,失败返回-1
		int index = Arrays.binarySearch(arr, 1);
		System.out.print(index);
		System.out.println();
		
		//用二分法输出元素1在数组arr[3-5]中的下标,失败返回-1
		int index2 = Arrays.binarySearch(arr, 3, 6, 4);
		System.out.print(index2);
		System.out.println();
		
		//将arr数组赋值为长度为5的新数组,不够的用默认值补齐,多余的删除
		int[] arr2 = Arrays.copyOf(arr, 5);
		for(int x : arr2) {
			System.out.print(x+",");
		}
		System.out.println();
		
		//将arr数组中从0开始的3个元素复制到arr3数组中从1开始的3位置上
		int[] arr3 = new int[5];
		System.arraycopy(arr, 0, arr3, 1, 3);
		for(int x : arr3) {
			System.out.print(x+",");
		}
		System.out.println();
		
		//数组排序:经过调优的快速排序
		int[] arr4 = {1,6,8,9,3,4,2,8};
		Arrays.sort(arr4);
		for(int x : arr4) {
			System.out.print(x+",");
		}
	}
}
