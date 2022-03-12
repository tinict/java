package Array;

import java.util.Scanner;

public class Bai1 {
	public static void InputArray(int[] array, int size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public static void OutputArray(int[] array) {
		for(int i: array)
			System.out.println(i + " ");
	}
	
	public static double averageNumber(int[] array) {
		double sum = 0;
		for(int i: array)
			sum += i;
		return sum/array.length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int array[] = new int[num];
		InputArray(array, num);
		OutputArray(array);
		System.out.println(averageNumber(array));
		sc.close();
	}

}
