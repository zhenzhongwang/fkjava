package fkjava.codes04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{3, 4, 5, 6};
		int[] a2 = new int[]{3, 4, 5, 6};
		System.out.println(Arrays.equals(a, a2));
		
		int[] b = Arrays.copyOf(a, 6);
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.toString(b));
		Arrays.fill(b, 2, 4, 1);
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		int[] arry1 = new int[]{3, -4, 25, 16, 30, 18};
		Arrays.parallelSort(arry1);
		System.out.println(Arrays.toString(arry1));
		
		int[] arry2 = new int[]{3, -4, 25, 16, 30, 18};
		Arrays.parallelPrefix(arry2, new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				// TODO Auto-generated method stub
				return left * right;
			}
		});
		
		System.out.println(Arrays.toString(arry2));
		
		int[] arry3 = new int[5];
		Arrays.setAll(arry3, new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int operand) {
				// TODO Auto-generated method stub
				return operand * 5;
			}
		});
		
		System.out.println(Arrays.toString(arry3));
	}

}
